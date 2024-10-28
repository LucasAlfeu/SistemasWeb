<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Páginda de Login</title>
</head>
<body>
	<%! 
		String validUsuario = "lucas" ;
		String validSenha = "12345" ;
		boolean logado = false;
	%>
	
	<h1> Páginda de Login</h1>
	<form action="Login.jsp" method="POST">
		<label>Usuário:</label></br>
		<input type="text" name="user">
		</br>
		<label>Senha:</label></br>
		<input type="password" name="pass">
		</br>
		<input type="submit">
	</form>
	
	<%
		String usuario = request.getParameter("user");
		String senha = request.getParameter("pass");
		
		if(usuario != null && senha != null){
			if(usuario.equals(validUsuario) && senha.equals(validSenha)){
				
			}
		} else {
			
		}
	%>
</body>
</html>