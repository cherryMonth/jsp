package org;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
	
	private String username;
	private String password;
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getUsername() {
		return this.username;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPassword() {
		return this.password;
	} 
	
	public String execute() throws Exception{  // �õ�����������user��ֵ
		if(getUsername().equals("songjian") && getPassword().equals("123")) {
			ActionContext.getContext().getSession().put("user", username);  //�������������session ������ת�� ת��ʱ����action
			 //�Ĳ���
			return SUCCESS;
		}
		else {
			return ERROR;
		}
	}
	/*
	 *  ��xml�ļ�ȷ����Ϳ��Բ���Ҫÿ���඼����validate �ð��������๲�ø�ʽ���
	public void validate() {
		if(getUsername()==null || getUsername().trim().equals("")) {
			addFieldError("username", "user.required");
		}
		if(getPassword()==null || getPassword().trim().equals("")) {
			addFieldError("password", "pass.required");
		}
	}
	*/
}