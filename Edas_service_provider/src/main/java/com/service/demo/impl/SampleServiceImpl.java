package com.service.demo.impl;
import  com.service.api.SampleService;

public class SampleServiceImpl implements SampleService {

	@Override
	public String echo(String str) {
		System.out.println("provider 接收到到信息参数为:"+str);
		str=" i am is provider,i recevie param is: "+str;
		return str;
	}

}
