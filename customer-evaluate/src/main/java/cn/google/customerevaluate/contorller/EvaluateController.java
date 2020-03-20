package cn.google.customerevaluate.contorller;

import cn.google.common.api.ListResponse;
import cn.google.common.api.ObjResponse;
import cn.google.customerevaluate.model.Evaluate;
import cn.google.customerevaluate.service.EvaluateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/evaluate")
public class EvaluateController {

    @Autowired
    EvaluateService evaluateService;

    //新增评价信息
    @PostMapping("/addEvaluate")
    public ObjResponse insertEvaluete(Evaluate evaluate){
        ObjResponse objResponse = new ObjResponse(this.evaluateService.insertEvaluete(evaluate));
        return objResponse;
    }

    //根据用户id查询
    @GetMapping("/selectUserId")
    public ListResponse selectByUserId(Integer userId){
        return new ListResponse(this.evaluateService.selectByUserId(userId));
    }

    //根据评价人查询评价信息
    @GetMapping("/selectUserName")
    public ListResponse selectByUserName(String evaluateUserName){
        return new ListResponse(this.evaluateService.selectByUserName(evaluateUserName));
    }

    //按评价时间查询
    @GetMapping("/selectTime")
    public ListResponse selectByEvaluateTime(String evaluateTime){
        return new ListResponse(this.evaluateService.selectByEvaluateTime(evaluateTime));
    }

    //根据评定id修改评价内容
    @PostMapping("/updateEvaluateId")
    public ObjResponse updateByPrimaryKey(Evaluate evaluate){
        ObjResponse objResponse = new ObjResponse(this.evaluateService.updateByPrimaryKey(evaluate));
        return objResponse;
    }
}
