<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
<script src="resources/bootstrap/js/bootstrap.js"></script>
<nav class="navbar navbar-default">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="${path}/">BBS Project</a>
		</div>
		<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
			<ul class="nav navbar-nav">
				<li><a href="${path}/">トップ</a></li>
				<li class="active"><a href="${path}/listAll">BBS</a></li>
			</ul>
			<c:choose>
				<c:when test="${sessionScope.memID == null}">
				<ul class="nav navbar-nav navbar-right">
	                   <li class="dropdown">
	                   	<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">アカウント<span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="${path}/login">ログイン</a></li>
							<li><a href="${path}/join">会員登録</a></li>
						</ul>
	                   </li>
	            </ul>
				</c:when>
				<c:otherwise>
				<ul class="nav navbar-nav navbar-right">
	                   <li class="dropdown">
	                   	<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">会員管理<span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="${path}/logout">ログアウト</a></li>
						</ul>
	                   </li>
	             </ul>
	             </c:otherwise>
	          </c:choose>
		</div>
	</nav>