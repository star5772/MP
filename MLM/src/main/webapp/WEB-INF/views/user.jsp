<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
$(function(){
	$("#join").on("click",function() {
		$("#join_form").submit();
	})	
})

</script>
</head>
<body>

<form id="join_form" action="/MikoLogitics/user/join" method="post" >
	uno		<input type="text" id="uno" name="uno">				<br>
	username<input type="text" id="userName" name="userName">	<br>
	<button type="button" id="join" >ㄱㄱ</button>
</form>
</body>
</html>