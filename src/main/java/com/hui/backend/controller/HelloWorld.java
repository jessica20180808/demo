package com.hui.backend.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hui.backend.mq.HelloSender;

@RestController
public class HelloWorld {

	
	   @RequestMapping("/hello")
	    public String helloworld(HttpServletResponse response) throws IOException {
	        
	        return "Hello Spring-boot";
	    }	
	   @Autowired
	    private HelloSender helloSender;
	   @RequestMapping("/mq")
	    public String mq(HttpServletResponse response) throws IOException {
	        
		   helloSender.send();
		   return "Hello Spring-boot";
	    }	
}
