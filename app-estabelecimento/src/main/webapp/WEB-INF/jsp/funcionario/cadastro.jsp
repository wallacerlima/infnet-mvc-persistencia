<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastramento de Funcionários</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>

	<c:import url="/WEB-INF/jsp/menu.jsp"/>

	<div class="container mt-3">
	  <h2>Cadastramento de Funcionários</h2>
	  
	  <form action="/funcionario/incluir" method="post">
	    <div class="mb-3 mt-3">
	      <label>Nome:</label>
	      <input type="text" class="form-control" placeholder="Entre com o seu nome" name="nome">
	    </div>
	    
	    <div class="mb-3 mt-3">
	      <label>Login:</label>
	      <input type="text" class="form-control" placeholder="Entre com o seu login" name="login">
	    </div>

	    <div class="mb-3 mt-3">
	      <label>Senha:</label>
	      <input type="password" class="form-control" placeholder="Entre com a sua senha" name="senha">
	    </div>

	    <div class="mb-3 mt-3">
	      <label>CPF:</label>
	      <input type="text" class="form-control" placeholder="Entre com o seu cpf" name="cpf">
	    </div>
	    
	    <div class="mb-3 mt-3">
	      <label>Email:</label>
	      <input type="text" class="form-control" placeholder="Entre com o seu email" name="email">
	    </div>
	    
	    <div class="mb-3 mt-3">
	      <label>Telefone:</label>
	      <input type="text" class="form-control" placeholder="Entre com o seu telefone" name="telefone">
	    </div>
	    
	    <div class="form-group">
		  	<c:if test="${not empty estabelecimentos}">
		  	<label>Estabelecimento:</label>
		  	<select class="form-control" name="estabelecimento.id">
		    	<c:forEach var="e" items="${estabelecimentos}">
		    	<option value="${e.id}">${e.nome}</option>
		    	</c:forEach>
		  	</select>
		  	</c:if>
		  
			<c:if test="${empty estabelecimentos}">
				<c:set var="botao" value="disabled"/>
		  		<label>Não existem estabelecimentos cadastrados!!!</label>
		  	</c:if>
		</div>
	    
		<button type="submit" class="btn btn-primary">Cadastrar</button>
	  </form>
	</div>

</body>
</html>