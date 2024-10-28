package br.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import br.model.Aluno;
import br.model.Disciplina;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CadastrarAlunoEmDisciplina
 */
@WebServlet("cadastrarAlunoEmDisciplina.do")
public class CadastrarAlunoEmDisciplina extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CadastrarAlunoEmDisciplina() {
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
		String matriculaInserida = request.getParameter("matricula");
		String nomeDisciplina = request.getParameter("disciplina");
		
		response.setContentType("text/html");		
		PrintWriter out = response.getWriter();
		
		cadastrarAluno cA = new cadastrarAluno();		
		Aluno a = cA.procuraAluno(matriculaInserida);
		
		CadastrarDisciplina cd = new CadastrarDisciplina();
		Disciplina d = cd.procuraDisciplina(nomeDisciplina);
		
		if(a!=null && d!=null) {
			d.adicionaAluno(a);
			out.println("<p>Aluno cadastrado com sucesso</p>");
		} else {
			out.println("<p>Erro ao cadastrar aluno</p>");
		}
		
		out.println("<h2>"+d.getNomeDisciplina()+"</h2><br/>");
		for(Aluno al: d.getListaAlunos()) {
			out.println("<p>"+al.getNome()+"</p><br/>");
		}
		
		out.println("<br/><a href='index.html>Inicio</a>'");
	}

}
