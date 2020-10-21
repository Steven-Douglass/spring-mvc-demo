<!DOCTYPE html>
<html>
	<head>
		<title>Hello World - Input Form</title>
	</head>

	<body>
	<p>Please fill out the form below</p>
	<img src="${pageContext.request.contextPath}/resources/images/downArrow.PNG" />
		<form action="processFormVersionThree" method="GET">
			<input type="text" name="studentName"
				placeholder="What's your name?" />
			<input type="submit" />
		</form>
	</body>
	
</html>