package cn.google.customermanege.model;

public class Proposal {
    private Integer proposalId;

    private Integer userId;

    private String proposalContent;

    private String proposalTime;

    public Integer getProposalId() {
        return proposalId;
    }

    public void setProposalId(Integer proposalId) {
        this.proposalId = proposalId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getProposalContent() {
        return proposalContent;
    }

    public void setProposalContent(String proposalContent) {
        this.proposalContent = proposalContent == null ? null : proposalContent.trim();
    }

    public String getProposalTime() {
        return proposalTime;
    }

    public void setProposalTime(String proposalTime) {
        this.proposalTime = proposalTime == null ? null : proposalTime.trim();
    }
}