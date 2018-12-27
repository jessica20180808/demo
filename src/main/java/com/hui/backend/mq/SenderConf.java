package com.hui.backend.mq;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
*@auther  ceated by Jessica
*@data   2018年11月29日 -----下午5:55:08
*
*
*/
@Configuration
public class SenderConf {
	  @Bean
	     public Queue queue() {
	          return new Queue("queue");
	     }
}

