<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Displaying Songs</title>
</head>
<body>
<h1>Songs Details</h1>
	<table border="2">
		<thead>
			<tr>
				<th>Name</th>
				<th>Singer</th>
				<th>Duration</th>
				<th>Producer</th>
				<th>Lyrics</th>
				<th>Language</th>
				<th>Type</th>
			</tr>
			<c:forEach items="${list}" var="dto">
				<tr>
					<td>${dto.name}</td>
					<td>${dto.singer}</td>
					<td>${dto.duration}</td>
					<td>${dto.producer}</td>
					<td>${dto.lyrics}</td>
					<td>${dto.language}</td>
					<td>${dto.type}</td>
				</tr>
			</c:forEach>
		</thead>
	</table>

</body>
</html>