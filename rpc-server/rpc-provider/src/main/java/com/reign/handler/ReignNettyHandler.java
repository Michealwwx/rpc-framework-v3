package com.reign.handler;

import com.reign.protocol.InvokeProtocol;
import com.reign.spring.SpringServiceLoader;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

import java.lang.reflect.Method;


/**
 * @ClassName: ReignNettyHandler
 * @Description: 入站处理器
 * @Author: wuwx
 * @Date: 2019-09-25 15:28
 **/
public class ReignNettyHandler extends ChannelInboundHandlerAdapter {

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        Object result = new Object();
        InvokeProtocol protocol = (InvokeProtocol) msg;
        Object bean = SpringServiceLoader.getServiceBean(protocol.getClassName());
        if(bean!=null){
            Class clazz = bean.getClass();
            Method method = clazz.getMethod(protocol.getMethodName(),protocol.getTypes());
            result = method.invoke(bean,protocol.getParams());
        }
        ctx.writeAndFlush(result);
        ctx.close();
    }


    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        super.exceptionCaught(ctx, cause);
    }
}
