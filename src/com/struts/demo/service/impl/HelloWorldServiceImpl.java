package com.struts.demo.service.impl;

import com.struts.demo.service.HelloWorldService;

public class HelloWorldServiceImpl implements HelloWorldService {

	@Override
	public String getString(String name) {
		// TODO Auto-generated method stub
		String tmp = "hello " + name;
		return tmp;
	}
	
}
