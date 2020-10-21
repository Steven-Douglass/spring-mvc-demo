<!DOCTYPE html>
<html>
	<head>
		<link rel="stylesheet" type="text/css"
			href="${pageContext.request.contextPath}/resources/css/styles.css">
		<title>Hello World</title>
	</head>

	<body>
		<div id="title" class="centered">
			<h1>Hello World of Spring!</h1>		
		</div>
	
		<br><br>
		<div id="student-name" class="centered">
			<p>Student name: ${param.studentName}</p>
		</div>
	
		<br><br>
		<div id="message" class="centered">
			<p>The message: ${message}</p>
		</div>	
	
	</body>
	
</html>