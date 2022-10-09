<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Displaying Food Detalis</title>
</head>
<body>
<h1>Food Details</h1>
	<table border="2">
		<thead>
			<tr>
				<th>ItemName</th>
				<th>Price</th>
				<th>HotelName</th>
				<th>Type</th>
				<th>Location</th>
				<th>Ordered</th>
				<th>Quantity</th>
			</tr>
			<c:forEach items="${list}" var="dto">
				<tr>
					<td>${dto.itemName}</td>
					<td>${dto.price}</td>
					<td>${dto.hotelName}</td>
					<td>${dto.type}</td>
					<td>${dto.location}</td>
					<td>${dto.ordered}</td>
					<td>${dto.quantity}</td>
				</tr>
			</c:forEach>
		</thead>
	</table>

</body>
</html>