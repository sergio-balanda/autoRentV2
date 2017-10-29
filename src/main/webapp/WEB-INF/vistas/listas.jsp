<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listas</title>
<!-- Bootstrap core CSS -->
<link href="css/bootstrap.min.css" rel="stylesheet">
<!-- Bootstrap theme -->
<link href="css/bootstrap-theme.min.css" rel="stylesheet">
</head>
<body>
	<h1>Listas</h1>
	
	<!-- lista de vehiculos -->
	<div class="row">
	<div class="col-md-6">
		<c:forEach items="${v}" var="vh">
				<p>ID:<c:out value="${vh.id}"/></p>
				<p>Patente:<c:out value="${vh.patente}"/></p>
				<p>marca:<c:out value="${vh.marca}"/></p>
				<p>pasajeros:<c:out value="${vh.capacidadPasajeros}"/></p>
		</c:forEach>
	</div>
	</div>
	<!-- lista de vehiculos -->
	<a href="registrar-vehiculo" class="btn btn-danger">Crear</a>
	
</body>
</html>