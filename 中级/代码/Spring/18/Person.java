package org.softcits.spring;

import javax.inject.Inject;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component("person")
@Scope("prototype")
public class Person {
	private Bread bread;

	public Bread getBread() {
		return bread;
	}
	
	@Inject
	//setter method will be auto triggered in beans.xml
	public void setBread(Bread bread) {
		this.bread = bread;
	}
	
	public void eatBread(){
		System.out.println("Meal begins:");
		//bread object will be auto injected thru setter
		System.out.println(bread.eaten());
	}
}
