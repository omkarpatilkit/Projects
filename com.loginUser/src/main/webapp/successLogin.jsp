<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<br><br><br><hr>
	
	
	<div align="center">
	<%= request.getAttribute("userName") %><br>
	<%= request.getAttribute("userEmail") %><br>
	<%= request.getAttribute("userPhone") %><br>
	<br><br><br>
		<img src= "https://cdn.pixabay.com/photo/2015/04/15/21/31/welcome-sign-724689_960_720.jpg" style="width: 337px; height: 352px; "></img>
	</div>
</body>
</html>