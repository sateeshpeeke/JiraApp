<!-- login.html -->
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body style="text-align: center">
	<h2>Login</h2>

	<form action="/login" method="post">
		<table align="center">
			<tr>
				<td>Email:</td>
				<td><input type="text" id="email" name="email" required>
				</td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" id="password" name="password"
					required></td>
			</tr>
			<tr>
				<td></td>
				<td align="center"><input type="submit" value="login"></td>
			</tr>
		</table>
	</form>
</body>
</html>