<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width",initial-scale="1">
<link rel="stylesheet" href="resources/bootstrap/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
<script>
$(document).ready(function(){
	var formObj = $("form[role='form']");
	
	console.log(formObj);
	
	$(".btn-modify").on("click", function(){
		formObj.attr("action","modify");
		formObj.attr("method","get");
		formObj.submit();
	});

	$(".btn-delete").on("click", function(){
		formObj.attr("action","remove");
		formObj.attr("method","post");
		formObj.submit();
	});
	
	$(".btn-write").on("click", function(){
		self.location ="regist";
	});
	
	$(".btn-list").on("click", function(){
		self.location ="listAll";
	});
	
});
</script>
<title>BBS Project</title>
<style type="text/css">
	a, a:hover{
		color : #000000;
		text-decoration: none;
	}
</style>
</head>
<form role="form" method="post">
	<input type="hidden" name="bdID" value="${boardVO.bdID}">
</form>
<body>
<%@ include file="include/menu.jsp" %>
	<div class = "container">
		<div class="row">
			<table class="table table-striped" style="text-align: center; border: 1px solid #dddddd">
				<thead>
					<tr>
						<th colspan="3" style="background-color: #eeeeee; text-align: center;">記事</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td style="width: 20%;">タイトル</td>
						<td colspan="2">${boardVO.bdTitle}</td>
					</tr>
					<tr>
						<td>作成者</td>
						<td colspan="2">${boardVO.bdWriter}</td>
					</tr>
					<tr>
						<td>作成日</td>
						<td colspan="2"><fmt:formatDate pattern="yyyy-MM-dd" value="${boardVO.bdDate}" /></td>
					</tr>
					<tr>
						<td>内容</td>
						<td colspan="2" style="height: 200px; text-align: left;">${boardVO.bdContent}</td>
					</tr>
				</tbody>
			</table>
			<input type="submit" form action="listAll" class="btn btn-primary btn-list" value="リスト"> </a>
			<c:if test="${sessionScope.memID == boardVO.bdWriter}">
			<input type="submit" class="btn btn-primary btn-modify" value="修正"></a>
			<input type="submit" class="btn btn-primary btn-delete" value="削除"></a>
			</c:if>
		<c:if test="${sessionScope.memID != null}">
			<input type="submit" class="btn btn-primary pull-right btn-write" value="記事作成">
		</c:if>
		</div>
	</div>
</body>
</html>