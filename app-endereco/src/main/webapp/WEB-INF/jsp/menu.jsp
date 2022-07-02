<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="/">AppEndereco</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="/">Home</a></li>
      
      <c:if test="${not empty user}">
	  	<li><a href="/enderecos">Endere�o</a></li>
	  	<li><a href="/estados">Estados</a></li>
	  </c:if>
	  
    </ul>
    <ul class="nav navbar-nav navbar-right">
    	<c:if test="${empty user}">
	    	<li><a href="/usuario">SignUp</a></li>
	    	
	    	<li><a href="/login">Login</a></li>
    	</c:if>
	  
	  	<c:if test="${not empty user}">
	  		<li><a href="/logout">Logout</a></li>
	  	</c:if>
	  	
    </ul>
  </div>
</nav>