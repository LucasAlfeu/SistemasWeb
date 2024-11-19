package br.model;

import java.util.ArrayList;
import java.util.List;

public class Turma {
	private String disciplina;
	private int alunoMax;
	private List<Aluno> listaAlunos = new ArrayList();
	
	public Turma() {
		
	}
	
	public Turma(String nome, int num) {
		this.disciplina = nome;
		this.alunoMax = num;
	}
	
	public String getDisciplina() {
		return this.disciplina;
	}
	public int getAlunoMax() {
		return this.alunoMax;
	}
	public List<Aluno> getListaAlunos(){
		return this.listaAlunos;
	}
	
	public void setDisciplina(String nomeD) {
		this.disciplina = nomeD;
	}
	
	public void setAlunoMax(int num) {
		this.alunoMax = num;
	}
	
	public void adicionaAluno(Aluno a) {
		listaAlunos.addLast(a);
		this.setAlunoMax(this.getAlunoMax() - 1);
	}
}
