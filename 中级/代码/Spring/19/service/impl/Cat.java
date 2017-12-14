package app.service.impl;

import app.service.*;

public class Cat implements Being
{
	private String msg;
	// msg的setter方法
	public void setMsg(String msg)
	{
		this.msg = msg;
	}
	// 实现接口必须实现的testBeing方法
	public void testBeing()
	{
		System.out.println(msg +
			"，猫喜欢吃老鼠");
	}
}
