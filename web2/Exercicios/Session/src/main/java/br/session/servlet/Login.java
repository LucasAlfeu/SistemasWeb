package br.session.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import br.session.model.Usuario;
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
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String usuarioValido = "alfeu";
		String senhaValida = "Lucas123";
		
		String user = request.getParameter("usuario");
		String password = request.getParameter("senha");
		
		HttpSession session = request.getSession();
		Usuario u = new Usuario(user, password);
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		if(user.equals(usuarioValido) && password.equals(senhaValida)) {
			session.setAttribute("user", u);
			response.sendRedirect("http://localhost:8080/Session/pagina.jsp");
		} else {
			//String url = "http://localhost:8080/Session/index.html";
			//response.sendRedirect(url);
			session.invalidate();
			return;
		}
		out.write("<p>Login efetuado com sucesso</p>");
		out.write("<a href='index.html'> Voltar <a/>");
		out.write("<p>"+session.getId()+"</p>");
		out.write("<p>"+session.getAttribute("Usuario")+"</p>");
	}

}
