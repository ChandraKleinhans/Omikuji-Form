<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Omikuji</title>
</head>
<body>
	<h1>Send an Omikuji!</h1>
	
	<form action = "omikujiForm" method="post">
		<div>
			<label for = "">Pick any number from 5 to 25</label>
			<br />
			<input type ="number" min=5 max=25 name="number" />
		</div>
		
		<div>
			<label for = "">Enter the name of any city</label>
			<br />
			<input type = "text" name = "cityName" />
		</div>
		
		<div>
			<label for = "">Enter the name of any real person</label>
			<br />
			<input type = "text" name = "personName" />
		</div>
		
		<div>
			<label for = "">Enter a professional endeavor or hobby</label>
			<br />
			<input type = "text" name = "hobby" />
		</div>
		
		<div>
			<label for = "">Enter any type of living thing</label>
			<br />
			<input type ="text" name="livingThing" />
		</div>
		
		<div>
			<label for = "">Say something nice to someone:</label>
			<br />
			<textarea name="somethingNice" id= "" cols="30" rows="10"> </textarea>
		</div>
		
		<p>Send and show a friend!</p>
		<input type="submit" value="Send"/>
		
	</form>

</body>
</html>