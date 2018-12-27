package com.hui.backend.mq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
*@auther  ceated by Jessica
*@data   2018年11月29日 -----下午5:58:24
*
*
*/
@Component
public class HelloSender {
	@Autowired
    private AmqpTemplate template;
    
    public void send() {
    		template.convertAndSend("queue","hello,rabbit~");
    }
}

