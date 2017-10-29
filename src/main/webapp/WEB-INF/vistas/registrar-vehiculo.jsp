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
<title>Insert title here</title>
</head>
<body>
<h1>Formulario</h1>
<hr>
<div class="container">
			<form:form action="registrar-vehiculo" method="POST">
				<div class="col-sm-6">
					<div class="form-group">
						<label for="nombre" class="cols-sm-2 control-label">Patente</label>
						<div class="cols-sm-10">
							<input type="text" class="form-control" name="patente" id="patente" placeholder="patente" required="required"/>
						</div>
					</div>
					<div class="form-group">
						<label for="email" class="cols-sm-2 control-label">marca</label>
						<div class="cols-sm-10">
							<input type="text" class="form-control" name="marca" id="marca" placeholder="marca" required="required"/>
						</div>
					</div>
					<div class="form-group">
						<label for="fechaDeNacimiento" class="cols-sm-2 control-label">nombre</label>
						<div class="cols-sm-10">
							<input type="text" class="form-control birthdate" name="nombre" id="nombre" placeholder="nombre" required="required"/>
						</div>
					</div>
					<div class="form-group">
						<label for="imagenFile" class="cols-sm-2 control-label">kilometraje</label>
						<div class="cols-sm-10">
							<input type="number" class="form-control required" id="kilometraje" name="kilometraje"/>
						</div>
					</div>
				</div>
				<div class="col-sm-6">
					<div class="form-group">
						<label for="password" class="cols-sm-2 control-label">imagen</label>
						<div class="cols-sm-10">
							<input type="text" class="form-control" name="imagen" id="imagen" placeholder="imagen" required="required"/>
						</div>
					</div>
					<div class="form-group">
						<label for="confirm" class="cols-sm-2 control-label">capacidadPasajeros</label>
						<div class="cols-sm-10">
							<input type="number" class="form-control" name="capacidadPasajeros" id="capacidadPasajeros" placeholder="capacidadPasajeros" required="required"/>
						</div>
					</div>
					<div class="form-group">
						<label for="imagenFile" class="cols-sm-2 control-label">capacidadValijas</label>
						<div class="cols-sm-10">
							<input type="number" class="form-control required" id="capacidadValijas" name="capacidadValijas"/>
						</div>
					</div>
				</div>
				<div class="col-sm-12">
					<div class="form-group ">
						<a href="#" class="btn btn-danger"><span class="glyphicon glyphicon-remove"></span>&nbsp;Cancelar</a>
						<button type="submit" class="btn btn-success"><span class="glyphicon glyphicon-ok"></span>&nbsp;Confirmar</button>
					</div>
				</div>
			</form:form>
		</div>
</body>
</html>