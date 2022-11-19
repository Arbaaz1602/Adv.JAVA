package example.tags.impl;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class SystemDateImplNew extends TagSupport {
	
	@Override
	public int doStartTag() throws JspException {
		//This method get called by Web Container when it encounters starting of the tag
		JspWriter out = pageContext.getOut();
		try {
			out.println("<h2>Just for check</h2>");//This gets printed when the start of the tag is encountered
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return EVAL_BODY_INCLUDE;//SKIP_BODY
		
	}
	@Override
	public int doEndTag() throws JspException{
		//This method get called by Web Container when it encounters ending of the tag
		//Obtaining a JspWriter to send the response
		JspWriter out = pageContext.getOut();
		LocalDate sysDate = LocalDate.now();
		try {
			System.out.println(sysDate);
			out.println("<h2>Today's date is " + sysDate+ "</h2>");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return EVAL_PAGE;//SKIP_PAGE
	}
}