package com.reign.spring;

import com.reign.annotations.RpcService;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @ClassName: SpringServiceLoader
 * @Description: 初始化注解修饰的所有bean;  只有在getBean的时候才回去调用setApplicationContext方法
 * @Author: wuwx
 * @Date: 2019-09-25 17:20
 **/
@Component
public class SpringServiceLoader implements ApplicationContextAware {

    private static ConcurrentHashMap<String, Object> beanMap = new ConcurrentHashMap<String, Object>();

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        Map<String, Object> nameBeanMap = applicationContext.getBeansWithAnnotation(RpcService.class);
        if (!nameBeanMap.isEmpty()) {
            for (Object serviceBean : nameBeanMap.values()) {
                RpcService rpcService = serviceBean.getClass().getAnnotation(RpcService.class);
                String className = rpcService.value().getName();
                System.out.println("数据进来");
                beanMap.put(className, serviceBean);
            }
        }
    }


    public static Object getServiceBean(String className){
        return beanMap.get(className);
    }
}
