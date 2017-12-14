package service.impl;

import service.Axe;
import service.Person;

public class Chinese implements Person {
	
	private String name;
	private Axe axe;
	
	@Override
	public void useAxe() {
		this.axe.chop();
	}

	public void init(){
		System.out.println("Chinese bean 初始化完成");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Axe getAxe() {
		return axe;
	}

	public void setAxe(Axe axe) {
		this.axe = axe;
	}
	
	
}
