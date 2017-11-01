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
<title>Reserva</title>
</head>
<body>
<form:form action="guardar-reserva" method="POST">
<div class="row">

	<div class="col-md-6">
		<input type="hidden" name="id" id="id" value="<c:out value="${reserva.idReserva}"/>"/>
		
		<div class="form-group">
			<label for="coleccion">Sucursales</label>
			<select id="sucursal" name="sucursal" class="form-control" required="required">
				<option value="">Seleccione sucursal</option>
				<c:forEach items="${sucursales}" var="sucursal">
					<option value="<c:out value="${sucursal.idSucursal}"/>" <c:if test="${comic.fkSucursalR.idSucursal eq sucursal.idSucursal}">selected='selected'</c:if>><c:out value="${sucursal.ciudad}"/></option>
				</c:forEach>
			</select>
		</div>
		
		<div class="form-group">
			<label for="numero">costo</label>
			<input type="text" class="form-control" name="costoOrigen" id="numero" placeholder="N&uacute;mero" required="required" value="<c:out value="${reserva.costoOrigen}"/>"/>
		</div>
		
		<div class="form-group">
			<label for="autor">Vehiculo</label>
			<select id="vehiculo" name="vehiculo" class="form-control" required="required">
				<option value="">Vehiculo</option>
				<c:forEach items="${vehiculos}" var="vehiculo">
					<option value="<c:out value="${vehiculo.idVehiculo}"/>" <c:if test="${reserva.vehiculo.idVehiculo eq vehiculo.idVehiculo}">selected='selected'</c:if>><c:out value="${vehiculo.nombre}"/></option>
				</c:forEach>
			</select>
		</div>
	
		
	<div class="form-group">
		<a href="administrar-comics" class="btn btn-danger">Cancelar</a>
		<button class="btn btn-success" name="submit" type="submit" value="guardar">Guardar</button>  			
	</div>
</form:form>
</body>
</html>