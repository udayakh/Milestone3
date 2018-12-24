<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Search Employee</title>
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
</div>
<div>

    <div align="center" style="margin-top: 50px;">
    <div class="row">
        <div class="col-xs-6">

            <table id="table_id" class="display" style="alignment: center">
                <thead>
                <tr style="alignment: center;color: #FF0000">
                    <th>ID</th>
                    <th></th>
                    <th>Name</th>
                </tr>
                </thead>
                <tbody>
                    <tr>
                        <th> <c:out value="${employee.id}" /></th>
                        <th/>
                        <th> <c:out value="${employee.name}"/></th>

                    </tr>
                </tbody>
            </table>

        </div>
    </div>
    </div>

</div>

</body>
</html>
