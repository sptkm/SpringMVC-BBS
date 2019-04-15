<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width",initial-scale="1">
<link rel="stylesheet" href="resources/bootstrap/css/bootstrap.min.css">
<title>BBS Project</title>
</head>
<form action = "listAll" method="get">
<body>
<%@ include file="include/menu.jsp" %>

<P> 
	<c:if test="${msg == 'success'}">
    <span style="font-weight:bold;">　${sessionScope.memID}様 こんにちわ。</span>
    </c:if>
</P>
	<div class="container">
		<div class="jumbotron">
			<div class="container">
			<h1>BBS project</h1>
			<p>本サイトはJAVA Spring mvcを基盤に最低限のロジックを利用して作成しています。</p>
			<P>■機能</P>
			<P>・会員登録</P>	
			<P>・ログイン、ログアウト</P>
			<P>・掲示板：記事登録、削除、修正(会員専用)</P>		
			<p>■使用スキル・ツール</p>
			<p>JAVA 、Spring、JSP、JDBC(Eclipse)、mySQL(Workbench/CURD)、bootstrap、javascript</p>
			</div>
		</div>
	</div>


</body>
</form>
</html>
