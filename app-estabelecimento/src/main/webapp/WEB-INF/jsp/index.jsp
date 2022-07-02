<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
	  <h2>App-Estabelecimento: aplicativo de gestão de estabelecimentos</h2>
	  
	  
	  <c:if test="${empty usuario}">
	  <form action="/usuario/validar" method="post">
	    <div class="mb-3 mt-3">
	      <label>Login:</label>
	      <input type="text" class="form-control" placeholder="Entre com o seu login" name="login">
	    </div>

	    <div class="mb-3 mt-3">
	      <label>Senha:</label>
	      <input type="password" class="form-control" placeholder="Entre com a sua senha" name="senha">
	    </div>
	    
	    <button type="submit" class="btn btn-primary">Ok</button>
	  </form>
	  </c:if>
	  
	  <c:if test="${not empty mensagem}">
	  <div class="alert alert-success">
		  ${mensagem}
		</div>	
	  </c:if>
	  
	</div>
	
	
	
	
</body>
</html>