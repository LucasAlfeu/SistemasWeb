package br.servlet;

import java.io.IOException;

import br.model.Aluno;
import br.model.Turma;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class MatricularAluno
 */
@WebServlet("/MatricularAluno")
public class MatricularAluno extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MatricularAluno() {
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
	    HttpSession session = request.getSession();
	    
	    Turma t = (Turma) session.getAttribute("turma");
	    
	    if (t == null) {
	        t = new Turma();
	    }
	    
	    String nome = request.getParameter("nome");
	    String matricula = request.getParameter("matricula");
	    String disci = request.getParameter("turma");
	    
	    Aluno a = new Aluno(nome, matricula);
	    t.adicionaAluno(a);

	    session.setAttribute("turma", t);
	    
	    response.sendRedirect("http://localhost:8080/AtividadeLoginJsp/usuario.jsp");
	}

}
