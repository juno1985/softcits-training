package org.softcits.spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("bread")//公共的创建Bean的Annotation
//目前WEB项目中推荐使用
//@Repository用于DAO对数据库的操作
//@Service用于业务层
//@Controller用于MVC的控制层
@Scope("prototype")
public class Bread {
	public String eaten(){
		return "Bread is eaten!";
	}
}
