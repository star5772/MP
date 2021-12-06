<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>Home</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script>


		$("#join").on("click",function() {
			$("#join_form").submit();
	})

</script>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>

<form id="join_form" action="/logitcs/user/join" method="post" enctype="text/plain">
	uno<input type="text" id="uno" name="uno"><br>
	username<input type="text" id="userName" name="userName"><br>
	<button type="submit" id="join" >ㄱㄱ</button>
</form>
</body>
</html>