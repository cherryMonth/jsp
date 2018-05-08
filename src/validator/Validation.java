package validator;

import com.opensymphony.xwork2.ActionSupport;

public class Validation extends ActionSupport {
	
	private String username;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	private String passwd;
	private int age;
	private String repass;
	
	public String getRepass() {
		return repass;
	}
	public void setRepass(String repass) {
		this.repass = repass;
	}
	public String execute()throws Exception{
		return SUCCESS;
	}
	
}
