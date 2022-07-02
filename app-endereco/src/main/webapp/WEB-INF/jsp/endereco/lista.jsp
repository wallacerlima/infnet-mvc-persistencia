<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="security" %>
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
	 <security:authorize access="hasRole('ADMIN')">
	  <h2>Cadastramento de Endere�os</h2>

	  <c:if test="${not empty mensagem}">
		<div class="alert alert-success">
		  <strong>Confirma��o!</strong> ${mensagem}
		</div>	  
	  </c:if>

	  <form action="/endereco" method="get">
	    <button type="submit" class="btn btn-primary">Nova</button>
	  </form>
	  
	  <hr>
	  </security:authorize>
	<c:if test="${not empty lista}">		
		<h2>Total de Endere�os: ${lista.size()}</h2>
		  
		<table class="table table-striped">
		    <thead>
		      <tr>
		        <th>ID</th>
		        <th>Logradouro</th>
		        <th>Complemento</th>
		        <th>Bairro</th>
		        <th>Localidade</th>
		        <th>UF</th>
		        <th>CEP</th>
		        <security:authorize access="hasRole('ADMIN')">
		        <th></th>
		        </security:authorize>
		      </tr>
		    </thead>
		    <tbody>
		      <c:forEach var="e" items="${lista}">
			      <tr>
			        <td>${e.id}</td>
			        <td>${e.logradouro}</td>
			        <td>${e.complemento}</td>
			        <td>${e.bairro}</td>
			        <td>${e.localidade}</td>
			        <td>${e.uf}</td>
			        <td>${e.cep}</td>
			        <security:authorize access="hasRole('ADMIN')">
		        	<td><a href="/endereco/${e.id}/excluir">excluir</a></td>
		        	</security:authorize>
			      </tr>
		      </c:forEach>		      
		    </tbody>
	  	</table>
    </c:if>	  	  

	<c:if test="${empty lista}">		
	  <h2>N�o existem endere�os cadastrados!!!</h2>
	</c:if>

	</div>
</body>
</html>