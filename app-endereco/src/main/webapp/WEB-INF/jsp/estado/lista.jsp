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
	  <h2>Lista de Estados</h2>
		  
		<table class="table table-striped">
		    <thead>
		      <tr>
		        <th>UF</th>
		        <th>Nome</th>
		        <th></th>
		      </tr>
		    </thead>
		    <tbody>
		      <c:forEach var="e" items="${lista}">
			      <tr>
			        <td>${e.sigla}</td>
			        <td>${e.nome}</td>
			        <td><a href="/municipio/${e.sigla}">municípios</a></td>
			      </tr>
		      </c:forEach>		      
		    </tbody>
	  	</table>
	  

	<c:if test="${empty lista}">		
	  <h2>Não existem endereços cadastrados!!!</h2>
	</c:if>

	</div>
</body>
</html>