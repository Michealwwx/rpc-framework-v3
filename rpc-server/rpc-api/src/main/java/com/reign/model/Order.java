package com.reign.model;

/**
 * @ClassName: Order
 * @Description: 订单
 * @Author: wuwx
 * @Date: 2019-09-25 16:16
 **/
public class Order {

    private long orderNo;

    private String address;

    public Order(long orderNo, String address) {
        this.orderNo = orderNo;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNo=" + orderNo +
                ", address='" + address + '\'' +
                '}';
    }

    public long getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(long orderNo) {
        this.orderNo = orderNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
