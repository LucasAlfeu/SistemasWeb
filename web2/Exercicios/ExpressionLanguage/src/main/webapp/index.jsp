<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Index</title>
</head>
<body>
	<jsp:useBean id="pessoa" class="br.ufrrj.si.model.Pessoa"/>
	<% 
		pessoa.setNome("Lucas");
		pessoa.setIdade(25);
	%>
    <h1>Dados da Pessoa</h1>
    <p>O nome é: ${pessoa.nome}</p>
    <p>A idade é: ${pessoa.idade}</p>
    
</body>
</html>