package org;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;

public class I18NFilter implements Filter {
	
	@Override
	public void destroy() {
		
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain filterChain)
			throws IOException, ServletException {
		
		HttpServletRequest r = (HttpServletRequest) req;
		MyRequestWrapper request = new MyRequestWrapper(r);
		filterChain.doFilter(request, resp);
	}
	
	
	@Override
	public void init(FilterConfig filterChain) throws ServletException {
		
	}

}
