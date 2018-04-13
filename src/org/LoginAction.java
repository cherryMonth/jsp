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
	
	public String execute() throws Exception{  // 得到参数后设置user的值
		if(getUsername().equals("songjian") && getPassword().equals("123")) {
			ActionContext.getContext().getSession().put("user", username);  //请求上下文添加session 并进行转发 转发时附带action
			 //的参数
			return SUCCESS;
		}
		else {
			return ERROR;
		}
	}
	/*
	 *  当xml文件确定后就可以不需要每个类都定义validate 该包下所有类共用格式检查
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