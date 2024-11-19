<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastrar Turma</title>
</head>
<body>
	<h1>Cadastro de Turma</h1>
	
	<form action="cadastraTurma.do" method="POST">
		<label>Disciplina</label><br>
		<input type="text" name="disciplina">
		<br>
		<label>Quantidade de Alunos</label><br>
		<input type="text" name="quantidade">
		<br>
		<input type="submit" value="Enviar">
	</form>
</body>
</html>