	<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
	
	<%
	  // 요청파라미터로 체크할 아이디
	  String id = request.getParameter("id");  // id 중복체크
	  String pw = request.getParameter("pw");  // id 중복체크
	  if("".equals(id) || "".equals(pw)){
	    out.print("false");
	  }else if("hgd@korea.com".equals(id) && "1234".equals(pw)){
	    out.print("true");
	  }else{
		  out.print("false");
	  }
	
	%>
