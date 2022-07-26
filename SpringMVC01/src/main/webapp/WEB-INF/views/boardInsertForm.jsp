<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!-- <c:set var="cpath" value="﻿${pageContext.request.contextPath}"/> -->

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Bootstrap Example</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
   href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
   src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script
   src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>

<body>

<div class = "container">
	<h2>Spring WEB MVC01</h2>
	<div class = "panel panel-default">
		<div class = "panel-heading">SPRING BOARD</div>
		<div class = "panel-body">
		
		<!-- 게시판 글쓰기 화면 만들기 -->
		<!-- <form class="form-horizontal" action="${cpath}/boardInsert.do" method="post"> -->
		<form class="form-horizontal" action="/web/boardInsert.do" method="post">
		  <div class="form-group">
		    <label class="control-label col-sm-2" for="title">제목:</label>
		    <div class="col-sm-10">
		      <input type="text" class="form-control" id="title" name = "title" placeholder="Enter title">
		    </div>
		  </div>
		  
		  <div class="form-group">
		    <label class="control-label col-sm-2" for="contents">내용:</label>
		    <div class="col-sm-10">
		    <textarea class="form-control" rows = "5" id = "contents" name = "contents"></textarea>
		    </div>
		  </div>
		  
		  <div class="form-group">
		    <label class="control-label col-sm-2" for="writer">작성자:</label>
		    <div class="col-sm-10">
		      <input type="text" class="form-control" id="writer" name = "writer" placeholder="Enter writer">
		    </div>
		  </div>
		  	  
		  <div class="form-group">
		    <div class="col-sm-offset-2 col-sm-10">
		      <button type="submit" class="btn btn-success btn-sm">글쓰기</button>
		      <button type="reset" class="btn btn-warning btn-sm">취소</button>
		    </div>
		  </div>
		</form>			
		</div>

</div>
<div class = "panel-footer">스프링 배우기(예스맨)</div>
</div>
</div>

</body>
</html>
