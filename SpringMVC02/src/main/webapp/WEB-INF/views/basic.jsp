<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang = "en">
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
		function loadList(){
			$.ajax({
				url : "boardListAjax.do",
				type : "get",
				dataType : "json", // 데이터를 받는 타입
				// [{게시판1},{2},{3},{4}]
				success : listView,
				error : function(){ alert("error");}
			});
		}
		// 								0	 	 1		  2
		function listView(data){ // [{board}, {board}, {board}]
			// 동적으로 게시판을 만들기
			var blist="<table class='table table-hover'>";
			blist+="<tr>";
			blist+="<td>번호</td>";
			blist+="<td>제목</td>";
			blist+="<td>작성자</td>";
			blist+="<td>작성일</td>";
			blist+="<td>조회수</td>";
			blist+="</tr>";
			
			// 반복문을 사용해서 게시물을 한개씩 꺼내온다.
			$.each(data,function(index,obj){
				blist+="<tr>";
				blist+="<td>"+obj.idx+"</td>";
				blist+="<td>"+obj.title+"</td>";
				blist+="<td>"+obj.writer+"</td>";
				blist+="<td>"+obj.indate+"</td>";
				blist+="<td>"+obj.count+"</td>";
				blist+="</tr>";			
			});
			
			// 글쓰기 버튼
			blist+="<tr>";
			blist+="<td colspan = '5'>";
			blist+="<button class = 'btn btn-primary btn-sm' onclick = 'goForm()'>글쓰기</button>";
			blist+="</td>";
			blist+="</tr>";
			
			
			blist+="</table>"
			// $ 선택자를 이용해서 blist의 div를 찾아가도록 만든다
			$(".blist").html(blist);
		}
		// 글쓰기 버튼을 눌렀을 때 글쓰기 화면이 나오게 하는 함수 goForm
		function goForm(){
			if($(".rform").css("display")=="block"){
				// $(".rform").css("display","none");
				$(".rform").slideUp();
			}else{
				//$(".rform").css("display","block");				
				$(".rform").slideDown();
			}
		}
	</script>	
</head>

<body>

	<div class="container">
		<h2>Spring WEB MVC02(JQuery+Ajax+JSON)</h2>
		<div class="panel panel-default">
			<div class="panel-heading">SPRING BOARD</div>
			<div class="panel-body blist">Panel Content</div>
			
			<br/>
			<div class="panel-body rform" style = "display: none">
			<!-- 글쓰기 화면 -->
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
			<div class="panel-footer">스프링 배우기(예스맨)</div>
		</div>
	</div>

</body>
</html>
