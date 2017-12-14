package org.urlclassloader.impl;

import org.urlclassloader.test.ActionInterface;

public class ActionTest implements ActionInterface {

	@Override
	public String sayHello() {
		return "Say Hello World!!!";
	}

}
