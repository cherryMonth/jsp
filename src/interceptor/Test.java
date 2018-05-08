package interceptor;

import com.opensymphony.xwork2.ActionSupport;

public class Test extends ActionSupport {
	
	private String username;
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getUsername() {
		return this.username;
	}
	
		public boolean check() {
		if (username == null || username.length() == 0) {
			return false;
		}
		else if(username.charAt(username.length()-1) == 'r'){
			System.out.println("匹配到了");
			return true;
		}
		System.out.println("没有匹配");
		return false;
	}

	public String execute()throws Exception{
		System.out.println("12323");
		System.out.println(username);
		return SUCCESS;
		
	}
}
