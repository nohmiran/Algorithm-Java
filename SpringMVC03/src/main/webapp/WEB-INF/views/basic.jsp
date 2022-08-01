<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">
<head>
<title>Bootstrap Example</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		// 서버와 통신($.ajax())
		loadList();

	});
	function loadList() {
		$.ajax({
			url : "boardListAjax.do",
			type : "get",
			dataType : "json", // 데이터를 받는 타입
			// [{게시판1},{2},{3},{4}]
			success : listView,
			error : function() {
				alert("error");
			}
		});
	}
	// 								0	 	 1		  2
	function listView(data) { // [{board}, {board}, {board}]
		// 동적으로 게시판을 만들기
		var blist = "<table class='table table-hover'>";
		blist += "<tr>";
		blist += "<td>번호</td>";
		blist += "<td>제목</td>";
		blist += "<td>작성자</td>";
		blist += "<td>작성일</td>";
		blist += "<td>조회수</td>";

		blist += "<td>수정</td>";
		blist += "<td>삭제</td>";

		blist += "</tr>";

		// 반복문을 사용해서 게시물을 한개씩 꺼내온다.
		$
				.each(
						data,
						function(index, obj) {
							blist += "<tr>";
							blist += "<td>" + obj.idx + "</td>";
							blist += "<td id='t"+obj.idx+"'><a href = 'javascript:goContent(﻿"
									+ obj.idx + ")'>" + obj.title + "</a></td>";
							blist += "<td id='w"+obj.idx+"'>" + obj.writer
									+ "</td>";
							blist += "<td>" + obj.indate + "</td>";
							blist += "<td>" + obj.count + "</td>";

							blist += "<td id='u"+obj.idx+"'><button class = 'btn btn-info btn-sm' onclick='goUpdate("
									+ obj.idx + ")'>수정</button></td>";
							blist += "<td><button class = 'btn btn-warning btn-sm' onclick='goDelete("
									+ obj.idx + ")'>삭제</button></td>";

							blist += "</tr>";

							// 제목을 눌렀을 때 내용을 볼 수 있도록!
							blist += "<tr id='cv"+﻿obj.idx+"' style='display:none'>";
							blist += "<td>내용</td>";
							blist += "<td colspan='6'><textarea rows='7' id = 'c"+obj.idx+"' class = 'form-control'>"
									+ obj.contents + "</textarea>";

							blist += "<br/>";
							blist += "<button class = 'btn btn-info btn-sm' onclick='upClick("
									+ obj.idx + ")' >수정</button>";
							blist += "&nbsp;<button class = 'btn btn-warning btn-sm'>취소</button>";
							blist += "&nbsp;<button class = 'btn btn-danger btn-sm' onclick='goClose("
									+ obj.idx + ")'>닫기</button>";

							blist += "</td>";
							blist += "</tr>";

						});

		// 글쓰기 버튼
		blist += "<tr>";
		blist += "<td colspan = '7'>";
		blist += "<button class = 'btn btn-primary btn-sm' onclick = 'goForm()'>글쓰기</button>";
		blist += "</td>";
		blist += "</tr>";

		blist += "</table>"
		// $ 선택자를 이용해서 blist의 div를 찾아가도록 만든다
		$(".blist").html(blist);
	}

	// 글쓰기 버튼을 눌렀을 때 글쓰기 화면이 나오게 하는 함수 goForm=========================================
	function goForm() {
		if ($(".rform").css("display") == "block") {
			// $(".rform").css("display","none");
			$(".rform").slideUp();
		} else {
			//$(".rform").css("display","block");				
			$(".rform").slideDown();
		}
	}

	// 글쓰기 화면의 글쓰기 버튼을 눌렀을 때 게시물이 올라가도록 하는 함수 goInsert==============================
	function goInsert() { // title, contents, writer
		//var title = $("#title").val();
		//var contents = $("#contents").val();
		//var writer = $("#writer").val();

		var fData = $("#frm").serialize(); // serialize -> form안에 있는 파라미터를 한 번에 가져오는 함수
		$.ajax({
			url : "boardInsertAjax.do",
			type : "post",
			data : fData,
			success : loadList,
			error : function() {
				alert("error");
			}
		});

		// null("")로 초기화
		//$("#title").val(""); 
		//$("#contents").val(""); 
		//$("#writer").val("");

		// 취소 버튼을 강제로 클릭하기
		$(".cancel").trigger("click");

		// 글쓰기 완료시 글쓰기 창이 숨겨지도록.
		$(".rform").css("display", "none");
	}

	// 제목을 눌렀을 때 내용이 보이는 함수 goContent()===============================================
	function goContent(idx) {
		if ($("#cv" + idx).css("display") == "none") {
			$("#cv" + idx).css("display", "table-row"); //-> block보다 table-row가 내용칸을 더 넓게 보여준다.
		} else {
			$("#cv" + idx).css("display", "none");
		}

	}

	// 닫기 버튼을 눌렀을 때 수정창이 닫아지는 함수goClose()===========================================
	function goClose(idx) {
		$("#cv" + idx).css("display", "none");
	}

	// 수정버튼이 눌렸을 때 수정된 내용이 저장되는 함수upClick()========================================
	function upClick(idx) { // idx와 content를 가져오자
		var contents = $("#c" + idx).val();
		$.ajax({
			url : "boardContentUpdateAjax.do",
			type : "post",
			data : {
				"idx" : idx,
				"contents" : contents
			},
			success : loadList,
			error : function() {
				alert("error");
			}
		});

	}

	// 게시물 리스트의 삭제 버튼 goDelete()======================================================
	function goDelete(idx) {
		$.ajax({
			url : "boardDeleteAjax.do",
			type : "get",
			data : {
				"idx" : idx
			},
			success : loadList,
			error : function() {
				alert("error");
			}
		});
	}

	// 게시물 리스트의 수정 버튼 goUpdate()======================================================
	function goUpdate(idx) {
		// 제목이 text칸으로!
		var title = $("#t" + idx).text();
		var newTitle = "<input type='text' id='nt"+idx+"' class = 'form-control' value = '"+title+"'>";
		$("#t" + idx).html(newTitle);

		// 작성자가 text칸으로!
		var writer = $("#w" + idx).text();
		var newWriter = "<input type='text' id='nw"+idx+"' class = 'form-control' value = '"+writer+"'>";
		$("#w" + idx).html(newWriter);

		// 수정 버튼이 수정하기 버튼으로!
		var newUpdate = "<button class='btn btn-success btn-sm' onclick='update("
				+ idx + ")'>수정하기</button>"
		$("#u" + idx).html(newUpdate);
	}

	// 수정하기 버튼 update()================================================================
	function update(idx) { // idx, title, writer
		var title = $("#nt" + idx).val();
		var writer = $("#nw" + idx).val();
		$.ajax({
			url : "boardTWUpdateAjax.do",
			type : "post",
			data : {
				"idx" : idx,
				"title" : title,
				"writer" : writer
			},
			success : loadList,
			error : function() {
				alert("error")
			}
		});
	}
</script>
</head>

<body>

	<div class="container">
		<h2>Spring WEB MVC03(+회원인증)</h2>
		<div class="panel panel-default">
			<div class="panel-heading">
			
			<!-- inlineform(로그인 ) -->
				<form class="form-inline" action="/action_page.php">
					<div class="form-group">
						<label for="memId">아이디:</label> 
						<input type="text" class="form-control" name="memId" id="memId">
					</div>
					<div class="form-group">
						<label for="memPass">패스워드:</label> 
						<input type="password" class="form-control" name="memPass" id="memPass">
					</div>
					<button type="submit" class="btn btn-default">로그인</button>
				</form>

			</div>
			<div class="panel-body blist">Panel Content</div>

			<div class="panel-body rform" style="display: none">

				<!-- 글쓰기 화면 -->
				<form id="frm" class="form-horizontal" method="post">
					<div class="form-group">
						<label class="control-label col-sm-2" for="title">제목:</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="title" name="title"
								placeholder="Enter title">
						</div>
					</div>

					<div class="form-group">
						<label class="control-label col-sm-2" for="contents">내용:</label>
						<div class="col-sm-10">
							<textarea class="form-control" rows="5" id="contents"
								name="contents"></textarea>
						</div>
					</div>

					<div class="form-group">
						<label class="control-label col-sm-2" for="writer">작성자:</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="writer" name="writer"
								placeholder="Enter writer">
						</div>
					</div>

					<div class="form-group">
						<div class="col-sm-offset-2 col-sm-10">
							<button type="button" class="btn btn-success btn-sm"
								onclick="goInsert()">글쓰기</button>
							<button type="reset" class="btn btn-warning btn-sm cancel">취소</button>
						</div>
					</div>
				</form>

			</div>
			<div class="panel-footer">스프링 배우기(예스맨)</div>
		</div>
	</div>

</body>
</html>
