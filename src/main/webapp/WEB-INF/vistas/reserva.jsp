<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Vehiculos</title>
<!-- Bootstrap core CSS -->
<link href="css/bootstrap.min.css" rel="stylesheet">
<!-- Bootstrap theme -->
<link href="css/bootstrap-theme.min.css" rel="stylesheet">
</head>
<body>
	<div class="container">
		<header class='page-header'>
		<div class="container-fluid bg-1">
			<img src="img/logo.jpg" class="img-responsive"
				style="display: inline" alt="" width="100" height="100">
			<h1 class="margin" style="display: inline; margin-left: 100px">Auto
				Rent</h1>
		</div>
		</header>
		<div class="panel-group">
			<div class="panel panel-default">
				<div class="panel-heading">Reserva Generada con exito. Detalles</div>
				<div class="panel-body">
					<p> Reserva generada para dia ${fdsd} hasta ${fhst} </p>
					<p> Retira de Sucursal: ${suc} </p>
					<p> IdVehiculo Reservado: ${idVehiculo}</p>
					<hr>
								<div class="row">
									<div class="col-md-4">
										<img src="${vehiculo.imagen}" alt="imagen" class="img-responsive"/>
									</div>
									<div class="col-md-5">
										<div class="page-header">
											<h2>${vehiculo.nombre}</h2>
										</div>
										<p>${vehiculo.marca}</p>
										<p><span class="glyphicon glyphicon-briefcase" aria-hidden="true"></span> ${vehiculo.capacidadPasajeros} plazas</p>
										<p><span class="glyphicon glyphicon-user" aria-hidden="true"></span> ${vehiculo.capacidadValijas} equipaje</p>
									</div>
									<div class="col-md-3">
										<h1>
											<span class="label label-success">costo</span>
										<h1>
										<a href="pasajeros" class="btn btn-danger">volver</a>
									</div>
								</div>
								
				</div>
			</div>
		</div>
	</div>
</body>
</html>