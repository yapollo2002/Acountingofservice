package com.yapollo.acountingofservice.service;

import com.yapollo.acountingofservice.model.RepairReceipt;
import com.yapollo.acountingofservice.repository.ReceiptsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

   @Service("receiptService")
 public class ReceiptService {

    @Autowired  ReceiptsRepository receiptsRepository;

    public List find(){
        return (List)receiptsRepository.findAll();
    }

    public RepairReceipt findPhonenumber(int phoneNumber){
        return null;
    }

    public void create(RepairReceipt repairReceipt){

    }

    public void update(RepairReceipt repairReceipt){

    }

    public void delete(int id){

    }
}
