<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Página do usuario</title>
</head>
<body>
	<h1>Usuário</h1>
	<% 
		String usuario = (String) session.getAttribute("usuario");
		boolean isLogado = (boolean) session.getAttribute("isLogado");
	%>
	
	<h2>Bem vindo <%= usuario %></h2>
	
	<a href="cadastrarAluno.jsp">Adicionar Aluno</a>
	</br>
	<a href="cadastrarTurma.jsp">Cadastrar Turma</a>
	</br>
	<a href="matricularAluno.jsp">Matricular Aluno</a>
	</br>
		<a href="turma.jsp">Acessar Turma</a>
	</br>
	

	<form action="logout.do" method="POST">
		<input type="submit" value="Sair" name="sair">
	</form>	 	
	 
</body>
</html>