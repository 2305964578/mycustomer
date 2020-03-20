package cn.google.customerevaluate.dao;

import cn.google.customerevaluate.model.Evaluate;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface EvaluateMapper {
    int deleteByPrimaryKey(Integer evaluateId);

    //用户新增评价信息
    int insert(Evaluate record);

    int insertSelective(Evaluate record);

    Evaluate selectByPrimaryKey(Integer evaluateId);

    //根据用户id查询
    List<Evaluate> selectByUserId(Integer userId);

    //根据评价人查询评价信息
    List<Evaluate> selectByUserName(String evaluateUserName);

    //按评价时间查询
    List<Evaluate> selectByEvaluateTime(String evaluateTime);

    int updateByPrimaryKeySelective(Evaluate record);

    //根据评定id修改评价内容
    int updateByPrimaryKey(Evaluate record);
}