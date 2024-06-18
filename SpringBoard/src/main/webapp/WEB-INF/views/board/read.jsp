<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="../include/header.jsp"%>

<h1>/board/read.jsp</h1>

<div class="box box-primary">
	<div class="box-header with-border">
		<h3 class="box-title"></h3>
	</div>
	
	<form role="form" action="" method="post">
		<%-- <input type="text" name="bno" value="${resultVO.bno }"> --%>
		<input type="hidden" name="bno" value="${param.bno }">
	</form>


	<div class="box-body">
		<div class="form-group">
			<label for="exampleInputEmail1">번호</label> <input type="text" name="bno" class="form-control" id="exampleInputEmail1" value="${resultVO.bno }" readonly>
		</div>
		<div class="form-group">
			<label for="exampleInputEmail1">제목</label> <input type="text" name="title" class="form-control" id="exampleInputEmail1" value="${resultVO.title }" readonly>
		</div>
		<div class="form-group">
			<label for="exampleInputEmail1">작성자</label> <input type="text" name="writer" class="form-control" id="exampleInputEmail1" value="${resultVO.writer }" readonly>
		</div>
		<div class="form-group">
			<label>내용</label>
			<textarea class="form-control" name="content" rows="3" readonly>${resultVO.content }</textarea>
		</div>
	</div>

	<div class="box-footer">
		<button type="submit" class="btn btn-danger">수정</button>
		<button type="submit" class="btn btn-warning">삭제</button>
		<button type="submit" class="btn btn-primary">리스트</button>
	</div>
</div>


<script type="text/javascript">

	$(document).ready(function(){
		
		// '수정'버튼 클릭 시 수정 페이지로 이동
		$(".btn-danger").click(function(){
// 			alert("수정버튼 클릭");
			
			// 수정 페이지로 이동(+bno)
			$("form[role='form']").attr("action", "/board/modify")
			$("form[role='form']").attr("method", "get")
			$("form[role='form']").submit();
		});
		
		// '리스트'버튼 클릭 시 리스트 페이지로 이동
		$(".btn-primary").click(function(){
			alert("클릭");
			location.href="/board/listALL";
		});
		
	});

</script>

<%@ include file="../include/footer.jsp"%>
