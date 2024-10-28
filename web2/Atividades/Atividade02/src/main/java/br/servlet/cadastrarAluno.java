package br.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import br.model.Aluno;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class cadastrarAluno
 */
@WebServlet("/cadastrarAluno.do")
public class cadastrarAluno extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	List<Aluno> alunosCadastrados = new ArrayList<Aluno>();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public cadastrarAluno() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		String matricula = request.getParameter("matricula");
		
		Aluno a = new Aluno(nome, matricula);
		
		PrintWriter out = response.getWriter();
		out.println("<h2>Novo aluno cadastrado</h2>Nome: "+a.getNome()+"<br/>Idade: "+a.getMatricula());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		String matricula = request.getParameter("matricula");
		
		Aluno a = new Aluno(nome, matricula);
		
		alunosCadastrados.add(a);
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		out.println("<h2>Novo aluno cadastrado</h2>Nome: "+a.getNome()+"<br/>Matrícula: "+a.getMatricula());
		
		out.println("<h3> Lista de alunos já cadastrados</h3>");
		for(Aluno aux : alunosCadastrados) {
			out.println("Nome: "+aux.getNome()+"<br/>");
		}
		out.println("<br/> <a href='index.html'>Inicio</a> <br/> <a href=\"cadastrarAluno.html\">Cadastrar ALuno</a>");
		
	}
	
	public Aluno procuraAluno(String matricula) {
		Aluno a = new Aluno();
		for(Aluno al: alunosCadastrados) {
			if(matricula.equals(al.getMatricula())) {
				a.setNome(al.getNome());
				a.setMatricula(al.getMatricula());
			}
		}
		return a;
	}

}
