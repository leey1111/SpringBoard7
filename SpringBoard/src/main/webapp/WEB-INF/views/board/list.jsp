<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../include/header.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>

<h1>/board/list.jsp</h1>

<%-- 	${boardList } --%>

전달정보 : ${msg }
<hr>

<div class="box">
	<div class="box-header with-border">
		<h3 class="box-title">게시판 리스트(ALL)</h3>
	</div>

	<div class="box-body">
		<table class="table table-bordered">
			<tbody>
				<tr>
					<th style="width: 10px">BNO</th>
					<th>TILE</th>
					<th>WRITER</th>
					<th>REGDATE</th>
					<th style="width: 40px">VIEWCNT</th>
				</tr>
				<c:forEach var="vo" items="${boardList}">
					<tr>
						<td>${vo.bno}</td>
						<td><a href = "/board/read?bno=${vo.bno }">${vo.title}</a></td>
						<td>${vo.writer}</td>
						<td><fmt:formatDate type="both" value="${vo.regdate}" pattern="yyyy-MM-dd (a)HH:mm:ss" /></td>
						<td><span class="badge bg-purple">${vo.viewcnt}</span></td>
					</tr>
				</c:forEach>

			</tbody>
		</table>
		<!-- 모달창 -->
		<div class="modal fade" id="myModal" style="display: none;">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal" aria-label="Close">
							<span aria-hidden="true">×</span>
						</button>
						<h4 class="modal-title">아이티윌 게시판</h4>
					</div>
					<div class="modal-body">
						<p>집 갈래요</p>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-default pull-left" data-dismiss="modal">Close</button>
						<button type="button" class="btn btn-primary">Save changes</button>
					</div>
				</div>

			</div>

		</div>
		<!-- 모달창 -->
	</div>

	<div class="box-footer clearfix">
		<ul class="pagination pagination-sm no-margin pull-right">
			<li><a href="#">«</a></li>
			<li><a href="#">1</a></li>
			<li><a href="#">2</a></li>
			<li><a href="#">3</a></li>
			<li><a href="#">»</a></li>
		</ul>
	</div>
</div>



<!-- Jquery 사용 -->
<script>
	$(document).ready(function() {

		// * JSP페이지 구성요소의 실행 순서
		//	JAVA - JSTL/EL - HTML/CSS - JS - Jquery
		// 		alert("${msg}");

		var result = "${msg}";

		if (result == "createOk") {
// 			alert("글쓰기 완료! 리스트 페이지로 이동")
// 			$("#myModal").modal("show");
			Swal.fire("아이티윌 테스트!")
		}
		if (result == "updateOK") {
			Swal.fire("게시판 글 수정 완료!")
		}
		if (result == "deleteOK") {
			Swal.fire("게시판 글 삭제 완료!")
		}
		
// 		Swal.fire("SweetAlert2 is working!");

	});
</script>

<%@ include file="../include/footer.jsp"%>












