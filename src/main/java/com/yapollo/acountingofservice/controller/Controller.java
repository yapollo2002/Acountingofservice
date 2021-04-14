package com.yapollo.acountingofservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

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
       public void create(){
           return null;
       }

}
