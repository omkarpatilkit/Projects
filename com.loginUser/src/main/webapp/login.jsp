<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>

	<br>
	<br>
	<hr>
	<div align="center" style="width: 1004px;" title="Login page">
		Hello welcome to login page.<br> <br>
		<form method=post action="loginPage" autocapitalize="sentences">
			Email id : <input name="uEmail" style="text-transform: lowercase"><br>
			<br>Password: <input type="password" name="uPwd"
				formmethod="post"><br> <br> <input type="submit"
				value="Submit"><br>
		</form>

		<a href="resister.jsp"><br>Please resister for new user</a>
	</div>
	<br>

</body>
</html>