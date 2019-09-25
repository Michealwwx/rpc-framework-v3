package com.reign.handler;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

/**
 * @ClassName: NettyHandler
 * @Description: netty pipeline中的handler
 * @Author: wuwx
 * @Date: 2019-09-25 18:07
 **/
public class NettyHandler extends ChannelInboundHandlerAdapter {

    private Object response ;

    public Object getResponse() {
        return response;
    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
       response = msg;
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        super.exceptionCaught(ctx, cause);
    }
}
