<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
  <form action="">
             用户名：  <input type="text" id="username" name="username">
    </br>
           密码 ：<input type="password" id="userpass" name="userpass">
    </br>
    <button type="button" id="submit">登录</button>
  </form>
   <script type="text/javascript" src="/js/jquery-3.4.1.min.js"></script>
   <script type="text/javascript">
       $("#submit").click(function(){
    	   var username=$("#username").val();
    	   var userpass=$("#userpass").val();
    	   $.post(
    		  "/user/loginAjax",
    		  {"username":username,"userpass":userpass},
    		  function(data){
    			  if(data==0){
    				  alert("用户名密码错误")
    			  }else{
    				  alert("登录")
    			  }
    		  },
    		  "text"
    	   );
    	      
       });
   
   </script>
</body>
</html>