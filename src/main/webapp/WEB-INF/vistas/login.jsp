<%@include file='../../includes/head.jsp' %>
	<title>Login</title>
</head>
<body>
<div class="container">
		<br>
		<div class="card">
		<div class="page-header text-center">
			<h1>AutoRent Login</h1>
		</div>
		<div class="row">
		
			<div class="col-md-4 col-md-offset-4">
				
						<form:form action="confimar-login" method="POST" modelAttribute="usuario">      
							<div class="form-group">
								<label for="email">E-Mail</label>
								<form:input path="email" id="email" type="email" class="form-control"/>
							</div>
							<div class="form-group">
								<label for="password">Password</label>
								<form:input path="password" type="password" id="password" class="form-control"/>
							</div>
							<div class="form-group text-center">
								<a href="index" class="btn btn-lg btn-danger">Cancelar</a>
								<button class="btn btn-lg btn-primary" name="submit" type="submit" value="login">Ingresar</button> 
								 			
							</div>
						</form:form>
			</div>
		</div>
		</div>
</div>		
</body>
</html>