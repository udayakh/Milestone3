<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">


<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Display Employee</title>
    <!-- Access the bootstrap Css like this,
    Spring boot will handle the resource mapping automcatically -->
    <script type="text/javascript" src="webjars/datatables/1.10.5/js/jquery.dataTables.min.js"></script>
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
    <div class="row">
    <div class="col-xs-6">

        <table id="table_id" class="display">
            <thead>
            <tr style="color: red">
                <th>ID</th>
                <th>Name</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${employees}" var="employee">
            <tr>
                <th>${employee.id}</th>
                <th>${employee.name}</th>
            </tr>
            </c:forEach>
            </tbody>
        </table>

    </div>
    </div>




</div>
</div>

</body>
</html>