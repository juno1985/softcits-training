package servletdemo;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class Mytaglib extends SimpleTagSupport {

	@Override
	public void doTag() throws JspException, IOException {
		//获取页面输出流
		getJspContext().getOut().write("The first my tag " + new java.util.Date());
		
	}

}
