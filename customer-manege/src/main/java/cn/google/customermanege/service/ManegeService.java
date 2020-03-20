package cn.google.customermanege.service;

import cn.google.customermanege.dao.ProposalMapper;
import cn.google.customermanege.model.Proposal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManegeService {

    @Autowired
    ProposalMapper proposalMapper;

    //新增管理建议
    public int insertProposal(Proposal proposal){
        return this.proposalMapper.insert(proposal);
    }

    //根据时间查询管理建议
    public List<Proposal> selectByTime(String proposalTime){
        return this.proposalMapper.selectByTime(proposalTime);
    }

    //根据用户来查询管理建议
    public List<Proposal> selectByUserId(Integer userId){
        return this.proposalMapper.selectByUserId(userId);
    }

    //根据管理建议id来修改管理建议
    public int updateByPrimaryKey(Proposal proposal){
        return this.proposalMapper.updateByPrimaryKey(proposal);
    }

    //根据管理建议id来删除建议
    public int deleteByPrimaryKey(Integer proposalId){
        return this.proposalMapper.deleteByPrimaryKey(proposalId);
    }
}
