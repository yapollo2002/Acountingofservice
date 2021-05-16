package com.yapollo.acountingofservice.service;

import com.yapollo.acountingofservice.model.RepairReceipt;
import com.yapollo.acountingofservice.repository.ReceiptsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

   @Service("receiptService")
 public class ReceiptService {

    @Autowired  ReceiptsRepository receiptsRepository;

    public  List <RepairReceipt> find(){
        return (List<RepairReceipt>)receiptsRepository.findAll();

    }

    public RepairReceipt findPhoneNumber(Integer phoneNumber){

        return receiptsRepository.findByPhoneNumber(phoneNumber);




    }

    public void create(RepairReceipt repairReceipt){
        RepairReceipt rr = new RepairReceipt();
        rr.setPhoneNumber(repairReceipt.getPhoneNumber());
        rr.setModel(repairReceipt.getModel());
        rr.setIssue(repairReceipt.getIssue());
        rr.setNotes(repairReceipt.getNotes());
          receiptsRepository.save(rr);

    }

    public void update(RepairReceipt repairReceipt){
        RepairReceipt receipt = receiptsRepository.findById(repairReceipt.getId()).get();
        receiptsRepository.save(repairReceipt);

    }

    public void delete(Integer id){
       receiptsRepository.deleteById(id);

    }
}
