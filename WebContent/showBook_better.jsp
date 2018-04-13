<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>  <!-- struts2 自带的标签 -->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<table>
    <!-- 迭代输出valuestack的books对象  其中status是迭代序号  -->
	<s:iterator value="books" status="index">
	<!-- 判断序号是否为奇数 -->
	
	<!-- 通过判断当前的序号改变当前行的style -->
	<s:if test="#index.odd == true">
	<tr style="background-color:#ccc">
	</s:if>
	<s:else>
	<tr>
	</s:else>
	
	<td>书名</td>
	<td><s:property/></td> <!-- 迭代的值 -->
	</tr>
	</s:iterator>
</table>  <!-- 本页面仅使用struts2标签控制输出，消除了JSP脚本, 降低了后期维护的成本 -->
</body>
</html>