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
	private String validUser = "lucas";
	private String validPass = "12345";
	public boolean isLogado = false;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
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
		String senha = request.getParameter("password");
		
		HttpSession session = request.getSession();
		
		if(usuario != null && senha != null && usuario.equals(validUser) && senha.equals(validPass)) {
			isLogado = true;
			
			session.setAttribute("isLogado", isLogado);
			session.setAttribute("usuario", usuario);
			response.sendRedirect("http://localhost:8080/AtividadeLoginJsp/usuario.jsp");
		} else {
			session.invalidate();
			response.sendError(403, "Usuário ou senha incorretos");
			response.sendRedirect("http://localhost:8080/AtividadeLoginJsp/");
			
		}
	}

}
