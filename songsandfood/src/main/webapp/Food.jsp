<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Food Details</title>
</head>
<body>
<h1>Enter Food Details</h1>
	<h3>${FoodDto.itemName}</h3>
	<h3>${count}</h3>
	<form action="food.do" method="Post">
		<br> <br> Name:<input type="text" name="itemName" /> <br>
		<br> Price:<input type="text" name="price" /> <br> <br>
		HotelName:<select name="hotelName">
			<option>select</option>
			<option>Gokul Cafe</option>
			<option>Taj Hotel</option>
			<option>Sahara Hotel</option>
			<option>Patel Hotel</option>
		</select> <br> <br> Type:<input type="text" name="type" /> <br>
		<br> Location:<select name="location">
			<option>select</option>
			<option>BTM</option>
			<option>Channapatna</option>
			<option>Ramanagara</option>
			<option>Bidadi</option>
		</select> <br> <br> Ordered:<select name="ordered">
			<option>select</option>
			<option>Offline</option>
			<option>Online Layout</option>
		</select> <br> <br> Quantity:<select name="quantity">
			<option>select</option>
			<option>1</option>
			<option>2</option>
			<option>3</option>
			<option>4</option>
		</select> <br> <br> <input type="Submit" value="Add"
			style="color: White; background: blue;"> <br> <br>
			</form>

</body>
</html>