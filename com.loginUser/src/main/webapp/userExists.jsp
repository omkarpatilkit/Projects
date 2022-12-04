<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Information</title>
</head>
<body>


	<div align="center">
	
	
	<br><br><hr>
	<form action="login.jsp">
	
			<br><div align="center"><h1><b><p align="center"><i><u>
			<%= request.getAttribute("userInfo") %><br><br>
			</u></i></p></b></h1></div>
			<input type="submit" value="Back to login page" style="height: 86px; "><br>
		</form>
	</div>
</body>
</html>