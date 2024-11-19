<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Páginda do usuario</title>
</head>
<body>
	<h1>Página do Usuário</h1>
	<% 
		String user = (String) session.getAttribute("usuario");
		boolean logado = (boolean) session.getAttribute("logado");
	%>
	
	<p>Bem vindo <%= user %> </p>
	<p>Você está <%= logado %> </p>
	
	<form action="logout.do" method="POST">
		<input type="submit" value="Sair" name="sair">
	</form>
</body>
</html>

