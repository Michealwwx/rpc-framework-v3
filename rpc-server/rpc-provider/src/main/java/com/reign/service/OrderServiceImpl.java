package com.reign.service;

import com.reign.annotations.RpcService;
import com.reign.interfaces.OrderService;
import com.reign.model.Order;

/**
 * @ClassName: OrderServiceImpl
 * @Description: order
 * @Author: wuwx
 * @Date: 2019-09-25 16:15
 **/
@RpcService(value = OrderService.class)
public class OrderServiceImpl implements OrderService {


    public Order addAge(Order order) {
        long orderNo = order.getOrderNo();
        order.setOrderNo(orderNo + 1);
        return (order);
    }

    public int add(int a, int b) {
        return (a + b);
    }
}
