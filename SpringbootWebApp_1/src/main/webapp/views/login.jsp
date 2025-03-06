<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="/css/style.css" />
</head>
<body class="body_bg" >
	
	<h3> Please fill the your credential: </h3>
	
	<c:if test="${not empty ErrorMsg}">
			<h4 style="color:red"> ${ErrorMsg} </h4>
		</c:if>
	
	<form action ="loginForm"  method = "post">
		
		email: <input type = "text" name = "email" /> <br/><br/>
		Password: <input type = "password" name = "password" /> <br/><br/>
		<input type="submit" value="Login"/>
		
	</form>
	<br/><br/>
	If not registered...<a href = "regPage"> <b> Click Here</b> </a>
		
</body>
</html>