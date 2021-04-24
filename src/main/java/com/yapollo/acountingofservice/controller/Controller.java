package com.yapollo.acountingofservice.controller;

import com.yapollo.acountingofservice.model.RepairReceipt;
import com.yapollo.acountingofservice.service.ReceiptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

       @Autowired ReceiptService receiptService;

       @GetMapping(path="/all")
       public @ResponseBody Iterable<RepairReceipt> find(){

           return receiptService.find();
       }

       @GetMapping(path="/find/{phonenumber}")
       public RepairReceipt findPhoneNumber(@PathVariable(value="phonenumber") Integer phoneNumber){
           return receiptService.findPhoneNumber(phoneNumber);
       }

       @PostMapping(path="/")
       public void create(@RequestBody RepairReceipt receipt){

           receiptService.create(receipt);
       }
       @PutMapping(path="/")
       public void update(@RequestBody RepairReceipt receipt){
           receiptService.update(receipt);

       }

       @DeleteMapping(path="/{id}")
       public void delete(@PathVariable(value="id") Integer id){
           receiptService.delete(id);
       }

}
