<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Basic Struts 2 Application - Welcome</title>
</head>
<body>
	<h1>Welcome To Struts 2!</h1>
	    
	<p>
		<a href="<s:url action='hello'/>">Hello World</a>
	</p>
	<p>
		<a href="register.jsp">Please register</a> for our prize drawing.
	</p>
	<s:url action="registerInput" var="registerInputLink" />
	<p>
		<a href="${registerInputLink}">Please register</a> for our prize
		drawing.
	</p>

	<h3>注册</h3>
	<s:url action="registerInput" var="registerInputLinkCN">
		<s:param name="request_locale">cn</s:param>
	</s:url>
	<p>
		<a href="${registerInputLinkCN}">注册有奖</a>
	</p>

	<hr />
	<s:text name="contact" />
</body>

</html>