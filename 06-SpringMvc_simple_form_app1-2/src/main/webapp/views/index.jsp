<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="user" method="post">
		<h1>
            Event Registration
        </h1>
        
        <label for="name">Name :</label>
        <br>
        <input type="text" name="Name" id="name">
        <br>
        <label for="mail">Email :</label>
        <br>
        <input type="text" name="Email" id="mail">
        <br>
        <label for="tel">Phone :</label>
        <br>
        <input type="tel" name="Phone" id="tel">
        <br>
        <input type="submit" name = "submit"> 
        
        <font colour = "green">${msg}</font>
	</form>
</body>
</html>