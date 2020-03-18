<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
    <input type="text" name="scode" id="code"><button id="but" type="button">商品编号验证</button>
    <script type="text/javascript" src="/js/jquery-3.4.1.min.js"></script>
    
    <script type="text/javascript">
      $("#but").click(function(){
    	 $.post(
    	    "/shop/showByCodeAjax",
    	    "code=56669585&username=admin",
    	    function(data){
    	    	alert(data)
    	    },
    	    "text"
    	 ); 
      });
    
    </script>
</body>
</html>