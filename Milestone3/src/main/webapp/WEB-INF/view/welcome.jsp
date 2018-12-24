<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>

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
        </div>
        <div id="navbar" class="collapse navbar-collapse">

        </div>
    </div>
</nav>

<div class="container">
    <ul class="nav navbar-nav">
        <div class="btn-toolbar">
            <a type="button" id="btnSubmit" class="btn btn-primary btn-sm" href="all">List All Employees</a>
            <a type="button" id="btnCancel" class="btn btn-primary btn-sm" href="addEmployee">Add Employee</a>
        </div>

    </ul>
    <div class="starter-template">

        <div align="center" style="margin-top: 50px;">
            <form action="id" method="GET" id="id">
                <legend>Find Employee By ID or Name</legend>
                Employee ID: <input type="text" name="id">
                <input type="submit" itemid="id" class="btn btn-primary btn-sm"/>
            </form>
               <br/>
            OR
                <br/>
                <form action="name" method="GET" id="name">
                Employee Name: <input type="text" name="name">
                    <input type="submit" itemid="name" class="btn btn-primary btn-sm"/>
            </form>

        </div>
    </div>

    <div>
        <c:out value="${result}" />
    </div>
</div>

<script type="text/javascript" src="webjars/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</body>

</html>