package br.ufrrj.si.servlet;

import java.io.IOException;

import br.ufrrj.si.model.Pessoa;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PaginaPessoa
 */
@WebServlet("/PaginaPessoa")
public class PaginaPessoa extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public PaginaPessoa() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    // Criando o objeto Pessoa
	    Pessoa p = new Pessoa();
	    p.setNome("Lucas Alfeu");
	    p.setIdade(25);
	
	    // Adiciona o objeto ao request
	    request.setAttribute("pessoa", p);
	
	    // Encaminha para a página index.jsp
	    request.getRequestDispatcher("src/main/webapp/index.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		
	}

}
