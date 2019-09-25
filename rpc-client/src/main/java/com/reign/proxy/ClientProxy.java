package com.reign.proxy;

import java.lang.reflect.Proxy;

/**
 * @ClassName: ClientProxy
 * @Description: 客户端代理类
 * @Author: wuwx
 * @Date: 2019-09-25 17:53
 **/
public class ClientProxy {

    public <T> T getProxy(Class<?> clazz) {
        Class[] interfaces = null;
        if (clazz.isInterface()) {
            interfaces = new Class[]{clazz};
        } else {
            interfaces = clazz.getInterfaces();
        }
        return (T) Proxy.newProxyInstance(clazz.getClassLoader(), interfaces, new ProxyInvokeHandler());
    }

}
