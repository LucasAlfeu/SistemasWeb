package br.servlet;

import java.io.IOException;
import java.util.List;

import br.model.Sistema;
import br.model.Turma;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CadastraTurma
 */
@WebServlet("/cadastraTurma.do")
public class CadastraTurma extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CadastraTurma() {
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
		String disciplina = request.getParameter("disciplina");
		int qtd = Integer.parseInt(request.getParameter("quantidade"));
		
		Turma t = new Turma(disciplina, qtd);
		
		request.setAttribute("turma", t);
		response.sendRedirect("http://localhost:8080/AtividadeLoginJsp/usuario.jsp");
	}

}
