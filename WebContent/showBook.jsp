<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="java.util.*,com.opensymphony.xwork2.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<table>
<%
	ValueStack vs = (ValueStack)request.getAttribute("struts.valueStack");  // 获取上一个页面转发的值
	String [] books = (String[])vs.findValue("books");
	for(String book:books){
		%>
		<tr>
		<td>书名</td>
		<td><%=book%></td>
		</tr>
	<%}
%> 
</table>
</body>
</html>