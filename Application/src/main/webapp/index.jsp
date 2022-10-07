<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Committed Suicide Details</title>
</head>
<body>
<h3>${name}</h3>
<h3>${DTO}</h3>
<h3>${type}</h3>
<pre>
<form action="create.do">

Name:<input type="text" name="name"/>
Age:<input type="text" name="age"/>
Reason:<textarea rows="3" cols="10" name="reason"></textarea>
<fieldset>
<legend>Gender</legend>
Male:<input type="radio" name="gender" value="male"/>
Female:<input type="radio" name="gender" value="female"/>
TransGender:<input type="radio" name="gender" value="transgender"/>
</fieldset>
NoOfAttempts:<input type="text" name="noOfAttempts"/>
Spot:<input type="text" name="spot"/>
DateAndTime:<input type="text" name="dateAndTime"/>
Type:<select name="type">
<option>Select</option>
<option>Hanging</option>
<option>Railway Track</option>
<option>Jumping From Building</option>
<option>Jumping into,Bavi,Kere</option>
</select>
<input type="submit" value="Send" style="color: white; background: blue;">

</form>
</pre>

</body>
</html>