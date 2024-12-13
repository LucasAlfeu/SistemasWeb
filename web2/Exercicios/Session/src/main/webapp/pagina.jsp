<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="br.session.model.Usuario" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
    Usuario user = (Usuario) session.getAttribute("user"); // Nome consistente
    if (user != null) {
%>
        <p>Bem-vindo, <%= user.getUsuario() %>!</p>
        <p>Sua senha: <%= user.getSenha() %></p>
<%
    } else {
%>
        <p>Usuário não encontrado. Faça login novamente.</p>
        <a href="index.html">Login</a>
<%
    }
%>

<a href="segunda.jsp">segunda</a>
</body>
</html>