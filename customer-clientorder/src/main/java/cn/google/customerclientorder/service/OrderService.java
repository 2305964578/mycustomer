package cn.google.customerclientorder.service;

import cn.google.customerclientorder.dao.OrderMapper;
import cn.google.customerclientorder.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    OrderMapper orderMapper;

    //新增订单
    public int insertOrder(Order order){
        return this.orderMapper.insert(order);
    }

    //根据订单id删除订单
    public int deleteByPrimaryKey(Integer orderId){
        return this.orderMapper.deleteByPrimaryKey(orderId);
    }

    //根据用户id查询该用户所有订单
    public List<Order> selectByCustomerId(Integer customerId){
        return this.orderMapper.selectByCustomerId(customerId);
    }

    //根据订单id修改订单
    public int updateByPrimaryKey(Order order){
        return this.orderMapper.updateByPrimaryKey(order);
    }
}
