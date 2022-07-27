<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>Bootstrap Example</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
	<script type = "text/javascript">
		$(document).ready(function(){
			// 서버와 통신($.ajax())
			loadList();
		});
		function loadList(){ //{}여러개를 쓰기 위해서는 중괄호를 써야한다.
			$.ajax({
				url : "boardListAjax.do",
				type : "get",
				dataType : "json", // 데이터를 받는 타입
				// [{게시판1},{2},{3},{4}]
				success : listView,
				error : function(){alert("error");}
				
			});
		}
		function listVeiw(data){
			
		}
	</script>	
</head>

<body>

	<div class="container">
		<h2>Spring WEB MVC02(JQuery+Ajax+JSON)</h2>
		<div class="panel panel-default">
			<div class="panel-heading">SPRING BOARD</div>
			<div class="panel-body">Panel Content</div>
			<div class="panel-footer">스프링 배우기(예스맨)</div>
		</div>
	</div>

</body>
</html>
