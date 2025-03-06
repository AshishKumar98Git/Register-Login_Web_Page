<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="/css/style.css" />
</head>
<body class="body_bg" >
	
	<h3> Register Here </h3>
	
	<c:if test="${not empty Successfull}">
		<h4 style="color:green"> ${Successfull} </h4>
	</c:if>
	<c:if test="${not empty ErrorMsg}">
			<h4 style="color:red"> ${ErrorMsg} </h4>
		</c:if>
	
	<form action ="regForm"  method = "post">
		
		Name: <input type = "text" name = "name" /> <br/><br/>
		email: <input type = "text" name = "email" /> <br/><br/>
		Password: <input type = "password" name = "password" /> <br/><br/>
		PhoneNumber: <input type = "text" name = "phoneno" /> <br/><br/>
		<input type="submit" value="Register"/>
		
	</form>
	<br/><br/>
		If already registered...<a href = "loginPage"> <b> Click Here</b> </a>
		
</body>
</html>