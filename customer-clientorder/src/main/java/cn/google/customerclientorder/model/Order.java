package cn.google.customerclientorder.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Order {
    private Integer orderId;

    private Integer customerId;

    private Integer commodityId;

    private Integer orderNumber;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date tradingHour;

    private String placeOfTransaction;

    private Integer tradingStatus;

    private String orderRemarks;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date orderCompletionTime;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
    }

    public Integer getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Integer orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Date getTradingHour() {
        return tradingHour;
    }

    public void setTradingHour(Date tradingHour) {
        this.tradingHour = tradingHour;
    }

    public String getPlaceOfTransaction() {
        return placeOfTransaction;
    }

    public void setPlaceOfTransaction(String placeOfTransaction) {
        this.placeOfTransaction = placeOfTransaction == null ? null : placeOfTransaction.trim();
    }

    public Integer getTradingStatus() {
        return tradingStatus;
    }

    public void setTradingStatus(Integer tradingStatus) {
        this.tradingStatus = tradingStatus;
    }

    public String getOrderRemarks() {
        return orderRemarks;
    }

    public void setOrderRemarks(String orderRemarks) {
        this.orderRemarks = orderRemarks == null ? null : orderRemarks.trim();
    }

    public Date getOrderCompletionTime() {
        return orderCompletionTime;
    }

    public void setOrderCompletionTime(Date orderCompletionTime) {
        this.orderCompletionTime = orderCompletionTime;
    }
}