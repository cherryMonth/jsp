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
	<s:text name="welcome">
	<s:param><s:text name="Chenheng" /></s:param>
	<s:param><s:text name="Monday" /></s:param>
	</s:text>
	<a href="selectLanguage.jsp"><s:text name="next" /></a>
</body>
</html>