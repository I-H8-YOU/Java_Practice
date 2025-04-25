<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<style>
  body {
    font-family: 'Segoe UI', sans-serif;
    background-color: #f7f7f7;
    margin: 0;
    padding: 0;
  }

  #container {
    display: flex;
    justify-content: center;
    align-items: center;
    height: 100vh;
  }

  #wrapper {
    background-color: white;
    padding: 40px;
    border-radius: 12px;
    box-shadow: 0 0 15px rgba(0, 0, 0, 0.1);
    width: 300px;
  }

  #wrapper h1 {
    text-align: center;
    color: #333;
    margin-bottom: 20px;
  }

  label.block-label {
    display: block;
    margin-top: 10px;
    font-weight: bold;
    color: #555;
  }

  input[type="text"],
  input[type="password"] {
    width: 100%;
    padding: 10px;
    margin-top: 5px;
    box-sizing: border-box;
    border: 1px solid #ccc;
    border-radius: 6px;
    outline: none;
    transition: border 0.3s ease;
  }

  input[type="text"]:focus,
  input[type="password"]:focus {
    border-color: #007bff;
  }

  input[type="button"] {
    width: 100%;
    margin-top: 15px;
    padding: 10px;
    border: none;
    background-color: #007bff;
    color: white;
    font-weight: bold;
    border-radius: 6px;
    cursor: pointer;
    transition: background-color 0.3s ease;
  }

  input[type="button"]:hover {
    background-color: #0056b3;
  }

  .form-error {
    font-size: 13px;
    margin-top: 8px;
    color: red;
    text-align: center;
    min-height: 1em;
  }
</style>
<meta http-equiv="content-type" content="text/html; charset=utf-8">
<link href="/mysite/assets/css/user.css" rel="stylesheet"
	type="text/css">
<title>ajax test</title>
<script src="http://code.jquery.com/jquery-latest.js"></script>
<script>
	$(document).ready(function() {
		$("#btn-checkid").on("click", function() {

			// json 형식으로 데이터 set
			//var params = {
			//email : $("[name=email]").val()
			//}
			var pw = $("[name=pw]").val().trim();
			var id = $("[name = name]").val().trim();
			var params = {
				id : id,
				pw : pw,
			};

			$.ajax({
				url : "loginCheck.jsp",
				type : "post",
				data : params,
				dataType : "json",
				success : function(isExist) {
					console.log(isExist);
					if (isExist) {
						$("#checkid-msg").text("로그인 가능")
						$("#checkid-msg").css("color", "green")
					} else {
						if (id === "" || pw === "") {
							$("#checkid-msg").text("아이디, 비밀번호 공백")
							$("#checkid-msg").css("color", "red")
						}else if(id.length != 0 && pw.length != 0){
							$("#checkid-msg").text("아이디 또는 비밀번호 오류")
							$("#checkid-msg").css("color", "red")
						}

					}
				},
				error : function(XHR, status, error) {
					console.error(status + " : " + error);
				}
			});//ajax
		});//#btn-checkid.onclick

		$("#btn-login").on("click", function() {
			var id = $("[name=name]").val().trim();
			var pw = $("[name=pw]").val().trim();

			if (id === "" || pw === "") {
				alert("아이디와 비밀번호를 모두 입력해주세요.");
				return;
			}

			var params = {
				id : id,
				pw : pw
			};

			$.ajax({
				url : "loginCheck.jsp",
				type : "post",
				data : params,
				dataType : "text", // "true" / "false"는 텍스트임
				success : function(result) {
					console.log("서버 응답:", result);

					if (result === "true") {
						location.href = "success.jsp";
					} else {
						location.href = "fail.jsp";
					}
				},
				error : function(XHR, status, error) {
					console.error("에러 발생:", status, error);
				}
			});
		});
	});//ready
</script>

</head>
<body>
	<div id="container">
		<div id="wrapper">
			<div id="content">
				<div id="user">

					<form id="join-form" name="joinForm" method="post"
						action="/mysite/user">
						<label class="block-label" for="name">아이디</label> <input id="name"
							name="name" type="text" value="" /> <label class="block-label"
							for="pw">비밀번호</label> <input id="pw" name="pw" type="password"
							value="" /> <input id="btn-checkid" type="button"
							value="id pw 체크">
						<p id="checkid-msg" class="form-error">&nbsp;</p>

						<input id = "btn-login" type="button" value="로그인">
					</form>

				</div>
				<!-- /user -->
			</div>
			<!-- /content -->
		</div>
		<!-- /wrapper -->

	</div>
	<!-- /container -->
</body>
</html>

