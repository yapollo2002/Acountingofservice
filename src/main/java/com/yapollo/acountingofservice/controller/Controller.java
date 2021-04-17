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
       public List find(){
           return null;
       }

       @GetMapping(path="/find/{phonenumber}")
       public RepairReceipt findPhonenumber(@PathVariable(value="phonenumber") int phonenumber){
           return receiptService.findPhonenumber(phonenumber);
       }

       @PostMapping(path="/")
       public void create(@RequestBody RepairReceipt receipt){

       }
       @PutMapping(path="/")
       public void update(@RequestBody RepairReceipt receipt){

       }

       @DeleteMapping(path="/{id}")
       public void delete(@PathVariable(value="id") int id){

       }

}
