package com.spring.springinaction;

public class HelloWorld {
	String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	public void say() {
		System.out.println("say:"+ msg);
	}
}
