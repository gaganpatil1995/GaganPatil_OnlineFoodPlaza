package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.entity.Customer;
import com.masai.service.CustomerServiceImpl;

@RestController
//@RequestMapping("/customer")
public class CustomerControl {
    @Autowired
    private CustomerServiceImpl customerService;

//    @GetMapping("/{id}")
//    public Customer viewCustomerHandler(@PathVariable Integer id){
//        return customerService.viewCustomer(id);
//    }

    @PostMapping("/customer")
    public Customer saveCustomerHandler(@RequestBody  Customer customer){
        return customerService.addCustomer(customer);
    }
    @GetMapping("/customer")
    public List<Customer> getAllCustomer(){
    	
    	return customerService.getAllCustomer();
    }

}
