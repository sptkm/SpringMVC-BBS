<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width",initial-scale="1">
<link rel="stylesheet" href="resources/bootstrap/css/bootstrap.min.css">
<title>BBS Project</title>
<style type="text/css">
	a, a:hover{
		color : #000000;
		text-decoration: none;
	}
</style>
</head>
<form action = "regist" method="get">
<body>
<%@ include file="include/menu.jsp" %>
	<div class = "container">
		<div class="row">
			<table class="table table-striped" style="text-align: center; border: 1px solid #dddddd">
				<thead>
					<tr>
						<th style="background-color: #eeeeee; text-align: center;">No.</th>
						<th style="background-color: #eeeeee; text-align: center;">タイトル</th>
						<th style="background-color: #eeeeee; text-align: center;">ID</th>
						<th style="background-color: #eeeeee; text-align: center;">作成日</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${list}" var="boardVO">
					<tr>
						<td>${boardVO.bdID}</td>
						<td><a href='/read?bdID=${boardVO.bdID}'>${boardVO.bdTitle}</a></td>
						<td>${boardVO.bdWriter}</td>
						<td><fmt:formatDate pattern="yyyy-MM-dd" value="${boardVO.bdDate}" /></td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
			<c:if test="${sessionScope.memID != null}">
				<input type="submit" class="btn btn-primary pull-right" value="記事作成">
			</c:if>
		</div>
	</div>
</body>
</form>
</html>