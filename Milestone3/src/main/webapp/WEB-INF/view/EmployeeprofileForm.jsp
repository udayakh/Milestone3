<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Register Employee Here</title>
    <!-- Access the bootstrap Css like this,
    Spring boot will handle the resource mapping automcatically -->
    <link rel="stylesheet" type="text/css" href="webjars/bootstrap/3.3.7/css/bootstrap.min.css" />

    <!--
	<spring:url value="/css/main.css" var="springCss" />
	<link href="${springCss}" rel="stylesheet" />
	 -->
    <c:url var="cssUrl" value="/css/main.css"/>
    <link rel="stylesheet" type="text/css" href="${cssUrl}" />

</head>
<body>
<nav class="navbar navbar-inverse">
    <div class="container">
        <div class="navbar-header">
            <a class="navbar-brand" href="#">Spring Boot Desktop App</a>
            <a class="navbar-brand" href="/">Home</a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
            <ul class="nav navbar-nav">
            </ul>
        </div>
    </div>
</nav>
<div>
    <div align="center" style="margin-top: 50px;">
        <form method="post" action="/save">
            ID : <input type="text" name="id" />
            Name : <input type="text" name="name" />
            empContactNumbers : <input type="text" name="empContactNumbers" />
            <input type="submit" />
        </form>
    </div>
</div>
</body>
</html>
