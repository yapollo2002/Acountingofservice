package com.yapollo.acountingofservice.controller;

import com.yapollo.acountingofservice.AcountingofserviceApplication;
import com.yapollo.acountingofservice.model.RepairReceipt;
import com.yapollo.acountingofservice.service.ReceiptService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class Controller {

    private static final Logger LOGGER= LoggerFactory.getLogger(Controller.class);

       @Autowired ReceiptService receiptService;

       @GetMapping(path="/all")
       public List<RepairReceipt> find(){
           LOGGER.info("Request of all list");
           return  receiptService.find();
       }

       @GetMapping(path="/find/{phoneNumber}")
       public @ResponseBody RepairReceipt findPhoneNumber(@PathVariable(value="phoneNumber") Integer phoneNumber){
           return receiptService.findPhoneNumber(phoneNumber);
       }

       @PostMapping(path="/")
       public void create(@RequestBody RepairReceipt receipt){

           receiptService.create(receipt);
       }

    @PostMapping(path="/login")
    public void login(){
         LOGGER.info("Login");

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
