package br.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
@WebServlet("/login.do")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String validUsuario = "lucas" ;
	private String validSenha = "12345" ;
	boolean logado = false;

    /**
     * Default constructor. 
     */
    public Login() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String usuario = request.getParameter("user");
		String senha = request.getParameter("pass");
		HttpSession session = request.getSession();
		
		if(usuario != null && senha != null){
			if(usuario.equals(validUsuario) && senha.equals(validSenha)){
				if(session.isNew()) {
					logado = true;
					session.setAttribute("usuario", usuario);
					session.setAttribute("logado", logado);
					response.sendRedirect("http://localhost:8080/LoginJsp/Login.jsp");
				} 
			} else {
				session.invalidate();
				response.sendRedirect("http://localhost:8080/LoginJsp/");
			}
		} else {
			response.sendRedirect("http://localhost:8080/LoginJsp/");
		}
	}

}
