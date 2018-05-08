package interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

import interceptor.Test;


public class UsernameInterceptor extends AbstractInterceptor {

	
	
	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("拦截器起作用");
		Test action = (Test)arg0.getAction();
		System.out.println("拦截器" + action.getUsername());
		if(action.check()){
		return arg0.invoke();
		}
		else {
			action.addFieldError("username", "用户名必须以 'r' 字符为后缀才能通过验证!");
			return "login";
		}
	}
}
