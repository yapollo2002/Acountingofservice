package com.yapollo.acountingofservice.service;

import com.yapollo.acountingofservice.model.RepairReceipt;
import com.yapollo.acountingofservice.repository.ReceiptsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

   @Service("receiptService")
 public class ReceiptService {

    @Autowired  ReceiptsRepository receiptsRepository;

    public List find(){  return (List)receiptsRepository.findAll();
    }

    public RepairReceipt findPhonenumber(int phoneNumber){

        return receiptsRepository.findByPhoneNumber(phoneNumber);
    }

    public void create(RepairReceipt repairReceipt){
        receiptsRepository.save(repairReceipt);

    }

    public void update(RepairReceipt repairReceipt){
        RepairReceipt receipt = receiptsRepository.findById(repairReceipt.getId()).get();
        receiptsRepository.save(repairReceipt);

    }

    public void delete(Long id){
       receiptsRepository.deleteById(id);

    }
}
