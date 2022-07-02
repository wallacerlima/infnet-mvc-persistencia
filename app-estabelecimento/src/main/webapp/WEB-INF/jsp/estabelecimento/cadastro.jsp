<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastramento de Estabelecimentos</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>

	<c:import url="/WEB-INF/jsp/menu.jsp"/>

	<div class="container mt-3">
	  <h2>Cadastramento de Estabelecimentos</h2>
	  
	  <form action="/estabelecimento/incluir" method="post">
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
	      <label>CNPJ:</label>
	      <input type="text" class="form-control" placeholder="Entre com o seu cnpj" name="cnpj">
	    </div>
	    
	    <div class="mb-3 mt-3">
	      <label>Endereço:</label>
	      <input type="text" class="form-control" placeholder="Entre com o seu endereco" name="endereco">
	    </div>
	    
	    <div class="checkbox">
			  <label><input type="checkbox" value="true" name="edtech">Edtech</label>
		</div>
	    <button type="submit" class="btn btn-primary">Cadastrar</button>
	  </form>
	</div>

</body>
</html>