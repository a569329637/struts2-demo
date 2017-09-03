package com.struts.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.struts.demo.service.HelloWorldService;

public class HelloWorldServiceTest {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-common.xml");
		
		HelloWorldService helloWorldService = (HelloWorldService) context.getBean("helloWorldService");
		String ret = helloWorldService.getString("HelloWorldServiceTest");
		
		System.out.println(ret);
	}
}
