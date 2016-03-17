<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page session="false" %>

<%@include file="../include/header.jsp"%>

<!-- Main content -->
<section class="content">
	<div class="row">
<!-- left column -->
<div class="col-md-12">
	<!-- general form elements -->

	<div class="box">
		<div class="box-header with-border">
			<h3 class="box-title">Read PAGE</h3>
		</div>



		<!--  다음 컨트롤러로 넘어가는 변수값들 hidden으로 넘김------------------------------------------>		
		<form role="form" action="modifyPage" method="post">
			<input type='hidden' name='bno' value="${boardVO.bno}">
			<input type='hidden' name='page' value="${cri.page}">
			<input type='hidden' name='perPageNum' value="${cri.perPageNum}">
		</form>
		
		
		<!-- 메인 들어가는 부분 시작----------------------------------------------------------------->
		<div class="box-body">
			<div class="form-group">
				<label for="exampleInputEmail1">Title</label>
				<input type="text" name='title' class="form-control" value="${boardVO.title}" readonly="readonly">
			</div>
			<div class="form-group">
				<label for="exampleInputPassword1">Content</label>
				<textarea class="form-control" name="content" rows="3" readonly="readonly">${boardVO.content}</textarea>
			</div>
			<div class="form-group">
				<label for="exampleInputEmail1">Writer</label>
				<input type="text" name="writer" class="form-control" value="${boardVO.writer}" readonly="readonly">
			</div>			
		</div>
		<!-- /.box-body -->
		<!-- 메인 들어가는 부분 종료----------------------------------------------------------------->
		
		<!-- Footer 들어가는 부분 -->
		<div class="box-footer">
			<button type="submit" class="btn btn-warning">MODIFY</button>
			<button type="submit" class="btn btn-danger">REMOVE</button>
			<button type="submit" class="btn btn-primary">LIST ALL</button>
		</div>
		<!-- /.box-footer-->

		<script>
		$(document).ready(function(){
			
			var formObj = $("form[role='form']");
			
			console.log(formObj);
			
			$(".btn-warning").on("click", function(){
				formObj.attr("action", "/board/modifyPage");
				formObj.attr("method","get");
				formObj.submit();
			});
			
			$(".btn-danger").on("click", function(){
				formObj.attr("action", "/board/removePage");
				formObj.attr("method","get");
				formObj.submit();
			});
			
			$(".btn-primary").on("click", function(){
				//self.location="/board/listAll";
				formObj.attr("method", "get");
				formObj.attr("action", "/board/listPage");
				formObj.submit();
			});
		});
		</script>


	</div>
</div>
<!--/.col (left) -->

	</div>
	<!-- /.row -->
</section>
<!-- /.content -->



<%@include file="../include/footer.jsp"%>