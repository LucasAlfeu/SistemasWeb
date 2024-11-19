<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastrar Aluno</title>
</head>
<body>
	<h1>Cadastro de Aluno</h1>
	
	<form action="cadastroAluno.do" method="POST">
		<label>Nome Aluno</label><br>
		<input type="text" name="nome">
		<br>
		<label>Matricula</label><br>
		<input type="text" name="matricula">
		<br>
		<input type="submit" value="Enviar">
	</form>
</body>
</html>