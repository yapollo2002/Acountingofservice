package com.yapollo.acountingofservice.controller;

import com.yapollo.acountingofservice.model.RepairReceipt;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {



       @GetMapping(path="/all")
       public List find(){
           return null;
       }

       @GetMapping(path="/find/{phonenumber}")
       public List findPhonenumber(@PathVariable(value="phonenumber") int phonenumber){
           return null;
       }

       @PostMapping(path="/")
       public void create(@RequestBody RepairReceipt receipt){

       }
       @PutMapping(path="/")
       public void update(@RequestBody RepairReceipt receipt){

       }

       @DeleteMapping(path="/{id}")
       public void delete(@PathVariable(value="id" int id){

       }

}
