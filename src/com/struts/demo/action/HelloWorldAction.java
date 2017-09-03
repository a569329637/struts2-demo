package com.struts.demo.action;

public class HelloWorldAction {
	private String name;
	
	public String execute() throws Exception {
		
		System.out.println("fdfd");
		return "success";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
