package app.service.impl;

import app.service.*;

public class Dog implements Being
{
	private String msg;
	// msg的setter方法
	public void setMsg(String msg)
	{
		this.msg = msg;
	}
	// 实现接口必须实现的testBeing()方法
	public void testBeing()
	{
		System.out.println(msg +
			"，狗爱啃骨头");
	}
}
