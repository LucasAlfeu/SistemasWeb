package br.atividade01;

public class Disciplina {
	private String nome;
	private int periodo;
	private float nota;
	
	public Disciplina() {
		
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public int getPeriodo() {
		return this.periodo;
	}
	
	public String getResultado(float notaFinal) {
		if(notaFinal > 5) {
			return "Aprovado";
		} else {
			return "Reprovado";
		}
	}
	
	public void setNome(String nomeDisciplina) {
		this.nome = nomeDisciplina;
	}
	
	public void setPerido(int p) {
		this.periodo = p;
	}
	
	public void setNota(float notaFinal) {
		this.nota = notaFinal;
	}
	
	public String toString() {
		return this.nome+" - " + this.periodo + " período - " + this.getResultado(this.nota);
	}
}
