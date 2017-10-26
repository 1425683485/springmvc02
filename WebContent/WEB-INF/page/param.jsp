<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath %>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="reqp/dateParam.do" method="post">
	<input type="text" name="id" placeholder="id"/><br>
	<input type="text" name="name" placeholder="名字"/><br>
	<input type="text" name="sex" placeholder="性别"/><br>
	<input type="date" name="date" placeholder="生日"><br>
	<input type="submit" value="提交"/><br>
</form>
</body>
</html>