package com.hui.backend.mq;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
*@auther  ceated by Jessica
*@data   2018年11月29日 -----下午6:03:48
*
*
*/
@Component
public class HelloReceive {
	
	@RabbitListener(queues="queue")    //监听器监听指定的Queue
    public void processC(String str) {
        System.out.println("Receive:"+str);
    }
}

