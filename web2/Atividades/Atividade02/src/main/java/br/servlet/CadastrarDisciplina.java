package br.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import br.model.Disciplina;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CadastrarDisciplina
 */
@WebServlet("/cadastrarDisciplina.do")
public class CadastrarDisciplina extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	List<Disciplina> listaDisciplina = new ArrayList<Disciplina>();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CadastrarDisciplina() {
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
		String nome = request.getParameter("nomeDisciplina");
		String professor = request.getParameter("professor");
		Integer numMaxAlunos = Integer.parseInt(request.getParameter("numMaxAlunos"));
		
		Disciplina d = new Disciplina(nome, professor, numMaxAlunos);
		listaDisciplina.add(d);
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		out.println("<h2>Nova disciplina cadastrada</h2>Nome: "+d.getNomeDisciplina()+"<br/>Docente: "+d.getProfessor());
		
		out.println("<h3> Lista de Disciplinas já cadastradas</h3>");
		for(Disciplina aux : listaDisciplina) {
			out.println(aux.getNomeDisciplina()+"<br/>");
		}
		out.println("<br/> <a href='index.html'>Inicio</a> <br/> <a href=\"cadastrarDisciplina.html\">Cadastrar Disciplina</a>");
		
	}
	
	public Disciplina procuraDisciplina(String nome) {
		Disciplina d = new Disciplina();
		for(Disciplina dp: listaDisciplina) {
			if(nome.equals(dp.getNomeDisciplina())) {
				d.setNomeDisciplina(dp.getNomeDisciplina());
				d.setProfessor(dp.getProfessor());
				d.setMaxAluno(dp.getMaxAluno());
				d.setNumAlunos(dp.getNumAlunos());
			}
		}		
		return d;
	}

}
