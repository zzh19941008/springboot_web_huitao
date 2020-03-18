<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- jstl  核心 C标签 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- 格式标签fmt -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/jquery-3.4.1.min.js"></script>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/bootstrap.min.js"></script>
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/css/bootstrap.min.css" />
<!-- 这个插件依托于jquery，先引入jq再引该插件依赖 -->	
<script type="text/javascript" src="/js/cypager.min.js" ></script>
<link href="/css/cypager.min.css" rel="stylesheet">
</head>

<body>
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-10 col-md-offset-1">
				<table class="table table-condensed">
					<caption>
						<h3>
							<strong>
								<center>商品信息维护</center>
							</strong>
						</h3>
						<button type="button" class="btn btn-success btn-sm">添加新商品</button>

					</caption>
					<thead>
						<tr>
							<th>序号</th>
							<th>商品名</th>
							<th>商品编号</th>
							<th>商品净重</th>
							<th>添加时间</th>
							<th>商品单价</th>
							<th>操作</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${list}" var="s">
							<tr>
								<td>${s.sid}</td>
								<td>${s.sname }</td>
								<td>${s.scode }</td>
								<td>${s.sweight }</td>
								<td><fmt:formatDate type="both" dateStyle="long"
										timeStyle="long" value="${s.saddtime }" /></td>
								<td><fmt:setLocale value="en_US" /> <fmt:formatNumber
										value="${s.sprice}" type="currency" /></td>
								<td>
									<button type="button" class="btn btn-primary btn-sm">修改</button>
									<button type="button" class="btn btn-danger btn-sm">删除</button>
								</td>
							</tr>
						</c:forEach>


					</tbody>
				</table>

			</div>
		</div>
		<div class="row">
			<div class="col-md-6 col-md-offset-3">
			   <!-- 分页的html部分，粘贴到需要的位置 -->
			   <div id="pagerArea" unselectable="on" onselectstart="return false;" style="-moz-user-select:none;"></div>		
			</div>
		</div>

	</div>
	<script type="text/javascript">
    $(function() {				
	    $("#pagerArea").cypager({
	    	pg_count:${page},
	    	pg_size:${pagesize},
	    	pg_nav_count: 6, //分页按钮块最大个数
	    	pg_total_count:${counts},
	    	pg_call_fun: function(count) {
	    		//count:选中页数
	            window.location.href="/shop/showAll?page="+count;			          
	        }});
	});
	</script>
</body>

</html>