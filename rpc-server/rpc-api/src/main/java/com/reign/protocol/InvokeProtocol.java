package com.reign.protocol;

/**
 * @ClassName: InvokeProtocol
 * @Description: 请求包装类
 * @Author: wuwx
 * @Date: 2019-09-25 17:43
 **/
public class InvokeProtocol {

    public String className;

    public String methodName;

    public Object[] params;

    public Class<?>[] types;


    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public Object[] getParams() {
        return params;
    }

    public void setParams(Object[] params) {
        this.params = params;
    }

    public Class<?>[] getTypes() {
        return types;
    }

    public void setTypes(Class<?>[] types) {
        this.types = types;
    }
}
