package cn.google.customerclientorder.controller;

import cn.google.common.api.ListResponse;
import cn.google.common.api.ObjResponse;
import cn.google.customerclientorder.model.Order;
import cn.google.customerclientorder.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    //新增订单
    @PostMapping("/addorder")
    public ObjResponse insertOrder(Order order){
        ObjResponse objResponse = new ObjResponse(orderService.insertOrder(order));
        return objResponse;
    }

    //根据订单id删除订单
    @PostMapping("delById")
    public ObjResponse deleteByPrimaryKey(Integer orderId){
        ObjResponse objResponse = new ObjResponse(orderService.deleteByPrimaryKey(orderId));
        return objResponse;
    }

    //根据用户id查询该用户所有订单
    @GetMapping("/selByCustomerId")
    public ListResponse selectByCustomerId(Integer customerId){
        return new ListResponse(this.orderService.selectByCustomerId(customerId));
    }

    //根据订单id修改订单
    @PostMapping("/updareById")
    public ObjResponse updateByPrimaryKey(Order order){
        ObjResponse objResponse = new ObjResponse(orderService.updateByPrimaryKey(order));
        return objResponse;
    }
}
