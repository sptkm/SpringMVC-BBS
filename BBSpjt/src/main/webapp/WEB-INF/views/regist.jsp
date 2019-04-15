<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
<form method="post">
<body>
<%@ include file="include/menu.jsp" %>
	<div class = "container">
		<div class="row">

				<table class="table table-striped" style="text-align: center; border: 1px solid #dddddd">
					<thead>
						<tr>
							<th colspan="2" style="background-color: #eeeeee; text-align: center;">記事作成テンプレート</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td><input type="text" class="form-control" placeholder="タイトル" name="bdTitle" maxlength="50"></td>
						</tr>
						<tr>
							<td><textarea class="form-control" placeholder="内容" name="bdContent" maxlength="2048" style="height: 350px;"></textarea></td>
						</tr>
					</tbody>
				</table>
				<input type="submit" class="btn btn-primary pull-right" value="記事登録">
		</div>
	</div>
</body>
</form>
</html>