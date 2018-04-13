package org;
import org.BookService;

import org.Action;
import com.opensymphony.xwork2.ActionContext;

public class GetBookAction implements Action {
	private String [] books;
	public void setBooks(String [] books) {
		this.books = books;
	}
	
	public String [] getBooks() {
		return this.books;
	}
	
	public String execute() throws Exception{
		String user = (String)ActionContext.getContext().getSession().get("user");
		if(user !=null && user.equals("songjian")) {
			BookService book = new BookService();
			setBooks(book.getBooks());  //ת��ʱ�����г�Ա������ֵ������һ��ҳ�� �洢��struts.ValueStack��
			return SUCCESS;
		}
		return LOGIN;	
	}
}
