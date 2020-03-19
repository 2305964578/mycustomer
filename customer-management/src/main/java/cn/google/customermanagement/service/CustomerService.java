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
    //查询全部
    public List<Customer> selectCustomer(){
        return this.customerMapper.selectCustomer();
    }
    //根据id查询
    public Customer selectByPrimaryKey(Integer id){
        return this.customerMapper.selectByPrimaryKey(id);
    }
    //修改
    public int updateByPrimaryKey(Customer record){
        return this.customerMapper.updateByPrimaryKey(record);
    }
    //添加
    public int insertSelective(Customer record){
        return this.insertSelective(record);
    }
}
