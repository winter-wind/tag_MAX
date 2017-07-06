package cc.biibi.tagmax;

import java.io.IOException;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class TagMax extends SimpleTagSupport{

	private String max1;
	private String max2;
	
	public void setMax1(String max1) {
		this.max1 = max1;
	}
	public void setMax2(String max2) {
		this.max2 = max2;
	}
	
	
	@Override
	public void doTag() throws JspException, IOException {
		
		int maxa=Integer.parseInt(max1);
		int maxb=Integer.parseInt(max2);
		//在控制台输出
		System.out.println((maxa>maxb)?max1:max2);
		
		//在浏览器输出
		PageContext pageContext = (PageContext)getJspContext();
		pageContext.getOut().print(maxa>maxb?max1:max2);
			
	}
}
