package cn.google.customermanagement.controller;

import cn.google.customermanagement.dao.CustomerMapper;
import cn.google.customermanagement.model.Customer;
import cn.google.customermanagement.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;



    //查询全部
    @GetMapping("get_customer")
    public List<Customer> getCustomer(){
        return this.customerService.selectCustomer();
    }
}
