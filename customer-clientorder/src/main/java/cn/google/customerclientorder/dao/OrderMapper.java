package cn.google.customerclientorder.dao;

import cn.google.customerclientorder.model.Order;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface OrderMapper {

    //根据订单id删除订单
    int deleteByPrimaryKey(Integer orderId);

    //新增订单
    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Integer orderId);

    //根据用户id查询该用户所有订单
    List<Order> selectByCustomerId(Integer customerId);

    int updateByPrimaryKeySelective(Order record);

    //根据订单id来修改订单
    int updateByPrimaryKey(Order record);
}