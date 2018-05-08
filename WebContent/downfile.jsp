<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
     <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
</head>
<body>
<s:debug/>
<s:property value='uploadContentType'/>
<s:property value='path'/>
<s:property value='uploadFileName'/>
   <s:url var="downUrl" action="/file/downloadfile">  
     <s:param name="contentType">${uploadContentType}</s:param>
     <s:param name="fileName">${uploadFileName}</s:param>
     <s:param name="path">${path}</s:param>
   </s:url>
   <a href="${downUrl}">通过action下载</a>
</body>
</html>