package org;

import model.*;
import java.util.*;

import javax.annotation.Resource;

import com.opensymphony.xwork2.ActionSupport;
public class UserLoginAction extends ActionSupport{

	private User user = new User();

	public void setUser(User user) {
		this.user = user;
	}
	
	public User getUser() {
		return this.user;
	}
	
	@Override
	public void validate() {
		Locale le = new Locale("en", "US");
		Locale le2 = new Locale("zh", "TW");
		// ResourceBundle 输入国际化的基本配置文件 然后根据Locale的类型进行选择语言
		ResourceBundle rb = ResourceBundle.getBundle("org.messageResource", le2);
		if(user.getName()==null || user.getName().trim().equals("")) {
			addFieldError("user.name", rb.getString("user.require"));
		}
		if(user.getPass()==null || user.getPass().trim().equals("")) {
			addFieldError("user.pass", rb.getString("pass.require"));
		}
		
	}
	
	
	private Object getUs() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void test() {
		Locale le = new Locale("en", "US");
		Locale le2 = new Locale("zh", "CN");
		System.out.println(Locale.getDefault().toString());
		// ResourceBundle 输入国际化的基本配置文件 然后根据Locale的类型进行选择语言
		ResourceBundle rb = ResourceBundle.getBundle("org.messageResource", le2);
		System.out.println(rb.getString("user"));
	}
	
	public static void main(String []args) {
		UserLoginAction user = new UserLoginAction();
		user.test();
	}
	
}
