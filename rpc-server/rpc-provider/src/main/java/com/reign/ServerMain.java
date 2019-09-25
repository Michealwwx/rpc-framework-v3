package com.reign;


import com.reign.spring.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName: RpcServer
 * @Description: 服务端
 * @Author: wuwx
 * @Date: 2019-09-25 15:11
 **/
public class ServerMain {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        ((AnnotationConfigApplicationContext)context).start();
    }

}
