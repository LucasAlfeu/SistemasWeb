<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Matricular Aluno</title>
</head>
<body>
	<h1>Matricular Aluno</h1>
	
	<form action="matricularAluno.do" method="POST">
		<label>Nome Aluno</label><br>
		<input type="text" name="nome">
		<br>
		<label>Matricula</label><br>
		<input type="text" name="matricula">
		<br>
		<label>Turma</label><br>
		<input type="text" name="turma">
		<br>
		<input type="submit" value="Enviar">
	</form>
</body>
</html>