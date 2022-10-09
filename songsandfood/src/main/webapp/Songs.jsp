<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Song Details</title>
</head>
<body>
<h1>Enter Songs Details</h1>
<h3>${SongsDTOs.name}</h3>
	<form action="song.do" method="post">

		<br>Name:<input type="text" name="name" /> <br> <br>Singer:<input
			type="text" name="singer" /><br> <br>Duration:<input
			type="text" name="duration" /><br> <br>Producer:<input
			type="text" name="producer" /><br> <br>Lyrics:<input
			type="text" name="lyrics" /><br> <br>Language:<select
			name="language">
			<option>Select</option>
			<option>Kannada</option>
			<option>Hindi</option>
			<option>Telghu</option>
		</select><br> <br>Type:<select name="type">
			<option>Select</option>
			<option>ItemSongs</option>
			<option>LoveSongs</option>
			<option>PathoSongs</option>
		</select><br> <br> <input type="submit" value="Add"
			style="color: white; background-color: blue;" /><br>

	</form>

</body>
</html>