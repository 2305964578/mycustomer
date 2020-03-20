package cn.google.customermanege.controller;

import cn.google.common.api.ListResponse;
import cn.google.common.api.ObjResponse;
import cn.google.customermanege.model.Proposal;
import cn.google.customermanege.service.ManegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/manege")
public class ManegeController {

    @Autowired
    ManegeService manegeService;

    //新增管理建议
        @GetMapping("/addProposal")
    public ObjResponse insertProposal(Proposal proposal){
        ObjResponse objResponse = new ObjResponse(this.manegeService.insertProposal(proposal));
        return objResponse;
    }

    //根据时间查询管理建议
    @GetMapping("/selectTime")
    public ListResponse selectByTime(String proposalTime){
        return new ListResponse(this.manegeService.selectByTime(proposalTime));
    }

    //根据用户来查询管理建议
    @GetMapping("/selectUserId")
    public ListResponse selectByUserId(Integer userId){
        return new ListResponse(this.manegeService.selectByUserId(userId));
    }

    //根据管理建议id来修改管理建议
    @GetMapping("/updateProposalId")
    public ObjResponse updateByPrimaryKey(Proposal proposal){
        ObjResponse objResponse = new ObjResponse(this.manegeService.updateByPrimaryKey(proposal));
        return objResponse;
    }

    //根据管理建议id来删除建议
    @GetMapping("deleteProposalId")
    public ObjResponse deleteByPrimaryKey(Integer proposalId){
        ObjResponse objResponse = new ObjResponse(this.manegeService.deleteByPrimaryKey(proposalId));
        return objResponse;
    }
}
