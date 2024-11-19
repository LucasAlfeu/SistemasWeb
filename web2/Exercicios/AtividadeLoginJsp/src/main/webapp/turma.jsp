<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="br.model.Turma" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <% 
        Turma t = (Turma) session.getAttribute("turma");
    %>
    
	<h1>Turma: 
    <%= t != null ? t.getDisciplina() : "Nenhuma disciplina disponível" %>
	</h1>
	
	<a href="usuario.jsp">Inicio</a>
	
</body>
</html>