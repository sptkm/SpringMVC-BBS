<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width",initial-scale="1">
<link rel="stylesheet" href="resources/bootstrap/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
<title>BBS Project</title>
<style type="text/css">
	a, a:hover{
		color : #000000;
		text-decoration: none;
	}
</style>
<script>
    $(document).ready(function(){ 	
        $("#btnLogin").click(function(){
            var memID = $("#memID").val();
            var memPW = $("#memPW").val();
            if(memID == ""){
                alert("IDを入力してください");
                $("#memID").focus();
                return;
            }
            if(memPW == ""){
                alert("パスワードを入力してください");
                $("#memPW").focus();
                return;
            }
            document.form1.action="${path}/loginCheck"
            document.form1.submit();
        });
    });
</script>
</head>
<body>
<%@ include file="include/menu.jsp" %>
<form name="form1" method="post">
	<div class="container">
           <div class="col-lg-4"></div>
           <div class="col-lg-4">
               <div class="jumbotron" style="padding-top: 20px;">
                <h3 style="text-align:center;">ログイン</h3>
				<div class="form-group">
					<input type="text" class="form-control" placeholder="ID" id="memID" name="memID" maxlength="20">
                </div>
                <div class="form-group">
                    <input type="password" class="form-control" placeholder="パスワード" id="memPW" name="memPW" maxlength="20">
                </div>                       
                     <input type="submit" id="btnLogin" class="btn btn-primary form-control" value="ログイン">                     	
				<c:if test="${msg == 'failure'}">
                	<div style="color: red; text-align: center;" >IDもしくはパスワードが一致しません。</div>
              	</c:if>
			</div>
           </div>
		<div class="col-lg-4"></div>
	</div>
</form>
</body>
</html>