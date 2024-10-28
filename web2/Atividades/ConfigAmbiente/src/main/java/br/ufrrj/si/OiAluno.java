package br.ufrrj.si;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import br.ufrrj.si.model.Aluno;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class OiAluno
 */
@WebServlet("/oi.do")
public class OiAluno extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	List<Aluno> alunosCadastrados = new ArrayList<Aluno>();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OiAluno() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		Integer idade = Integer.parseInt(request.getParameter("idade"));
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		out.println("Nome: "+nome+"<br/>Idade: "+idade);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		Integer idade = Integer.parseInt(request.getParameter("idade"));
		
		Aluno a = new Aluno(nome,idade);
		
		alunosCadastrados.add(a);
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		out.println("<h2>Novo aluno cadastrado</h2>Nome: "+a.getNome()+"<br/>Idade: "+a.getIdade());
		
		out.println("<h3> Lista de alunos já cadastrados</h3>");
		for(Aluno aux : alunosCadastrados) {
			out.println("Nome: "+aux.getNome()+"<br/>");
		}
	}

}
