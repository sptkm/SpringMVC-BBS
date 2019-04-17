<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
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
        $("#btnJoin").click(function(){
            var memID = $("#memID").val();
            var memPW = $("#memPW").val();
            var memName = $("#memName").val();
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
            if(memName == ""){
                alert("お名前を入力してください");
                $("#memName").focus();
                return;
            }
            document.form2.action="${path}/insert"
            document.form2.submit();
        });
    });
</script>
</head>
<body>
<%@ include file="include/menu.jsp" %>
<form name="form2" method="post">
  <div class="container">
           <div class="col-lg-4"></div>
           <div class="col-lg-4">
               <div class="jumbotron" style="padding-top: 20px;">
                       <h3 style="text-align:center;">会員登録</h3>
            <div class="form-group">
                           <input type="text" class="form-control" placeholder="ID" ID="memID" name="memID" maxlength="20">
                       </div>
                       <div class="form-group">
                           <input type="password" class="form-control" placeholder="パスワード" id="memPW" name="memPW" maxlength="20">
                       </div>
                       <div class="form-group">
                           <input type="text" class="form-control" placeholder="名前" id="memName" name="memName" maxlength="20">
                       </div>
                       <div class="form-group" style="text-align: center;">
                          <div class="btn-group" data-toggle="buttons">
                            <label class="btn btn-primary active">
                              <input type="radio" name ="memGender" autocomplete="off" value="男子" cheked>男子
                            </label>
                            <label class="btn btn-primary">
                              <input type="radio" name ="memGender" autocomplete="off" value="女子" cheked>女子
                            </label>
                          </div>
                       </div>
                       <div class="form-group">
                           <input type="email" class="form-control" placeholder="E-mail" name="memMail" maxlength="20">
                       </div>
                      <input type="submit" id="btnJoin" class="btn btn-primary form-control" value="会員登録">
               </div>
           </div>
           <div class="col-lg-4"></div>
       </div>
</form>
</body>
</html>