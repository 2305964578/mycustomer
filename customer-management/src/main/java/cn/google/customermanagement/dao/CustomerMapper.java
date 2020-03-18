package cn.google.customermanagement.dao;

import cn.google.customermanagement.model.Customer;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CustomerMapper {


    Customer selectByPrimaryKey(Integer customerId);
    List<Customer> selectCustomer();

}