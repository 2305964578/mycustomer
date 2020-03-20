package cn.google.customerevaluate.service;

import cn.google.customerevaluate.dao.EvaluateMapper;
import cn.google.customerevaluate.model.Evaluate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EvaluateService {

    @Autowired
    EvaluateMapper evaluateMapper;

    //新增评价信息
    public int insertEvaluete(Evaluate evaluate){
        return this.evaluateMapper.insert(evaluate);
    }

    //根据用户id查询
    public List<Evaluate> selectByUserId(Integer userId){
        return this.evaluateMapper.selectByUserId(userId);
    }

    //根据评价人查询评价信息
    public List<Evaluate> selectByUserName(String evaluateUserName){
        return this.evaluateMapper.selectByUserName(evaluateUserName);
    }

    //按评价时间查询
    public List<Evaluate> selectByEvaluateTime(String evaluateTime){
        return this.evaluateMapper.selectByEvaluateTime(evaluateTime);
    }

    //根据评定id修改评价内容
    public int updateByPrimaryKey(Evaluate evaluate){
        return this.evaluateMapper.updateByPrimaryKey(evaluate);
    }

}
