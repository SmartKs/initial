<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>

<script src="<c:url value="/scripts/jquery-1.11.2.min.js" />"></script>
<link rel="stylesheet" type="text/css" href="<c:url value="/styles/bootstrap-3.2.0/css/bootstrap.min.css" />">
<script type="text/javascript">
	jQuery(function(){
		$('#test').click(function(){
			alert('555');
		});
	});
	
</script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Stock</title>
</head>
<body>
	Welcome to Home Stock
 	Language : <a href="?lang=en">English</a> | <a href="?lang=th_TH">Thailand</a>
 	welcome.springmvc : <spring:message code="welcome.springmvc" text="default text" />
</body>
</html>