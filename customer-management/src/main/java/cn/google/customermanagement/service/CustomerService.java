package cn.google.customermanagement.service;

import cn.google.customermanagement.dao.CustomerMapper;
import cn.google.customermanagement.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {


    @Autowired
    CustomerMapper customerMapper;
    public List<Customer> selectCustomer(){
        return this.customerMapper.selectCustomer();
    }
}
