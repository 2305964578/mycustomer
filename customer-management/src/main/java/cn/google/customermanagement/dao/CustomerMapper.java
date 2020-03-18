package cn.google.customermanagement.dao;

import cn.google.customermanagement.model.Customer;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CustomerMapper {

    //根据id查询
    public Customer selectByPrimaryKey(Integer customerId);
    //查询全部
    public List<Customer> selectCustomer();

}