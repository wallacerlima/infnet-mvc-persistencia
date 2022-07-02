<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AppMIT</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>

	<c:import url="/WEB-INF/jsp/menu.jsp"/>

	<div class="container mt-3">
		<form action="/funcionarios/estabelecimento" method="post">
	
			<div class="form-group">
			  	<c:if test="${not empty estabelecimentos}">
			  	<label>Estabelecimento:</label>
			  	<select class="form-control" name="id">
			    	<c:forEach var="e" items="${estabelecimentos}">
			    	<option value="${e.id}">${e.nome}</option>
			    	</c:forEach>
			  	</select>
			  	</c:if>
			  
				<c:if test="${empty estabelecimentos}">
					<c:set var="botao" value="disabled"/>
			  		<label>Não existem estabelecimentos cadastrados!!!</label>
			  	</c:if>
			  	<button type="submit" class="btn btn-primary">Buscar</button>
			</div>

		</form>
	
	
	
	
	<c:if test="${not empty id}">
		<c:if test="${not empty lista}">		
			<h2>Total de Funcionários: ${lista.size()}</h2>
			  
			<table class="table table-striped">
			    <thead>
			      <tr>
			        <th>ID</th>
			        <th>Nome</th>
			        <th>Login</th>
			        <th>Senha</th>
			        <th>CPF</th>
			        <th>Email</th>
			        <th>Telefone</th>
			        <th>Estabelecimento</th>
			      </tr>
			    </thead>
			    <tbody>
			      <c:forEach var="f" items="${lista}">
				      <tr>
				        <td>${f.id}</td>
				        <td>${f.nome}</td>
				        <td>${f.login}</td>
				        <td>${f.senha}</td>
				        <td>${f.cpf}</td>
				        <td>${f.email}</td>
				        <td>${f.telefone}</td>
				        <td>${f.estabelecimento.nome}</td>
				      </tr>
			      </c:forEach>		      
			    </tbody>
		  	</table>
	    </c:if>	  	  
	
		<c:if test="${empty lista}">		
		  <h2>Não existem funcionários cadastrados!!!</h2>
		</c:if>
	</c:if>

	</div>
</body>
</html>