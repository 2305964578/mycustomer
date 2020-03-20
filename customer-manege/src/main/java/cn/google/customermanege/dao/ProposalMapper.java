package cn.google.customermanege.dao;

import cn.google.customermanege.model.Proposal;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ProposalMapper {
    //根据管理建议id来删除建议
    int deleteByPrimaryKey(Integer proposalId);

    //新增管理建议
    int insert(Proposal record);

    int insertSelective(Proposal record);

    Proposal selectByPrimaryKey(Integer proposalId);

    //根据时间查询管理建议
    List<Proposal> selectByTime(String proposalTime);

    //根据用户来查询管理建议
    List<Proposal> selectByUserId(Integer userId);

    int updateByPrimaryKeySelective(Proposal record);

    //根据管理建议id来修改管理建议
    int updateByPrimaryKey(Proposal record);
}