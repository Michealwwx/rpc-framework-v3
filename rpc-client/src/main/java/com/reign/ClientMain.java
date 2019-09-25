package com.reign;

import com.reign.interfaces.OrderService;
import com.reign.proxy.ClientProxy;

/**
 * @ClassName: ClientMain
 * @Description: 客户端
 * @Author: wuwx
 * @Date: 2019-09-25 15:10
 **/
public class ClientMain {

    public static void main(String[] args) {
        OrderService orderService = new ClientProxy().getProxy(OrderService.class);
        int result  = orderService.add(1,3);
        System.out.println("返回结果："+result);
    }


}
