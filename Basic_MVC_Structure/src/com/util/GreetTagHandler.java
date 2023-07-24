package com.util;

import java.io.IOException;
import java.util.Calendar;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class GreetTagHandler extends SimpleTagSupport {
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void doTag() throws JspException, IOException {		
		JspWriter out = getJspContext().getOut();
		int hour = Calendar.getInstance().getTime().getHours();
		
		if(hour >= 4 && hour <= 11) {
			out.print(Calendar.getInstance().getTime());
			out.print("<br/>Good Morning, " + name);
		} else if (hour >= 12 && hour <= 17) {
			out.print(Calendar.getInstance().getTime());
			out.print("<br/>Good Afternoon, " + name);
		} else if (hour >= 18 && hour <= 22) {
			out.print(Calendar.getInstance().getTime());
			out.print("<br/>Good Afternoon, " + name);
		} else if (hour >= 23 && hour <= 3) {
			out.print(Calendar.getInstance().getTime());
			out.print("<br/>Good Night, " + name);
		}		
	}
}
