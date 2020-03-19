package cn.google.customermanagement.dao;

import cn.google.customermanagement.model.Customer;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface CustomerMapper {
    int deleteByPrimaryKey(Integer customerId);

    int insert(Customer record);

    int insertSelective(Customer record);
    //根据id查询
    Customer selectByPrimaryKey(Integer customerId);
    //查询全部
    public List<Customer> selectCustomer();

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);
}