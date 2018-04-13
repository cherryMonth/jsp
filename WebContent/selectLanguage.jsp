<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<!-- 添加I18N的拦截器后再请求中添加指定的语言后action返回的页面都会被国际化 但是跳转到非action控制的页面则不会被国际化 -->
	<a href="selectLanguage.action?request_locale=zh_CN"><s:text name="zhch" /></a>
	<br><br>
	<a href="selectLanguage.action?request_locale=en_US"><s:text name="usen" /></a>
	<a href="selectLanguage.jsp"><s:text name="next"/></a>
</body>
</html>