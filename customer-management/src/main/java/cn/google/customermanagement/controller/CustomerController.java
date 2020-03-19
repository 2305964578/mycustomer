package cn.google.customermanagement.controller;

import cn.google.common.api.BaseResponse;
import cn.google.common.api.ListResponse;
import cn.google.common.api.ObjResponse;
import cn.google.customermanagement.model.Customer;
import cn.google.customermanagement.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;



    //查询全部
    @GetMapping("get_customer")
    public ListResponse getCustomer(){
//        return this.customerService.selectCustomer();
        return new ListResponse(this.customerService.selectCustomer());
    }

    //根据id查询
    @GetMapping("/get_id")
    public ObjResponse selectByPrimaryKey(Integer id) {
//        return this.customerService.selectByPrimaryKey(id);
        return new ObjResponse(this.customerService.selectByPrimaryKey(id));
    }
    //修改
    @PostMapping("/customer_update")
    public ObjResponse updateByPrimaryKey(Customer record){
        ObjResponse objResponse =new ObjResponse(this.customerService.updateByPrimaryKey(record));

        return objResponse;
    }

    //添加
    @PostMapping("/add")
    public ObjResponse insertSelective(Customer record){
        ObjResponse objResponse =new ObjResponse(this.customerService.insertSelective(record));
        return objResponse;
    }
}
