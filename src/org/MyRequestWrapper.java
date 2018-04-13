package org;

import java.util.*;
import javax.servlet.http.*;

public class MyRequestWrapper extends HttpServletRequestWrapper {
	
	private Locale locale = null;
	
	public MyRequestWrapper(HttpServletRequest request) {
		super(request);
		HttpSession session = request.getSession();
		
		String local = request.getParameter("request_locale");
		
		if(local!=null) {
			String a [] = local.split("_");
			session.setAttribute("locale", new Locale(a[0], a[1]));
		}
		locale = (Locale)session.getAttribute("locale");
	}
	
	@Override
	public Locale getLocale(){
		if(locale!=null)
			return this.locale;
	return super.getLocale();
	}
}
