package br.atividade01;

public class Aluno {
	private String nome;
	private String matricula;
	private String email;
	
	public String getNome() {
		return this.nome;
	}
	
	public String getMatricula() {
		return this.matricula;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setMatricula(String matricula) {
		boolean confirma = true;
		while(confirma) {
			if(matricula.length() == 11) {
				this.matricula = matricula;
				confirma = false;
			} else {
				System.out.println("Matricula incorreta insira novamente");
			}
		}
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString() {
		return this.nome + " - " + this.matricula + " - " + this.email;
	}
}
