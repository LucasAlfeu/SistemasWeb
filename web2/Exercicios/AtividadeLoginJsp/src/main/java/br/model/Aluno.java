package br.model;

public class Aluno {
	private String nome;
	private String matricula;
	
	public Aluno() {
		
	}
	
	public Aluno(String nome, String matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}
	
	public String getNome(){
		return this.nome;
	}
	public String getMatricula(){
		return this.matricula;
	}
	
	public void setNome(String name) {
		this.nome = name;
	}
	
	public void setMatricula(String matri) {
		this.matricula = matri;
	}
}
