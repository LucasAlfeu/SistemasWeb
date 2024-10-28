package br.model;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
	private String nomeDisciplina;
	private String professor;
	private int numAlunos;
	private int maxAluno;
	private List<Aluno> listaAlunos = new ArrayList<Aluno>();
	
	public Disciplina() {
		
	}
	
	public Disciplina(String nome, String professor,Integer maxAlunos) {
		this.nomeDisciplina = nome;
		this.professor = professor;
		this.maxAluno = maxAlunos;
	}
	
	public String getNomeDisciplina() {
		return nomeDisciplina;
	}
	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}
	public int getNumAlunos() {
		return numAlunos;
	}
	public void setNumAlunos(int numAlunos) {
		this.numAlunos = numAlunos;
	}
	
	public int getMaxAluno() {
		return maxAluno;
	}
	public void setMaxAluno(int maxAluno) {
		this.maxAluno = maxAluno;
	}
	
	public String getProfessor() {
		return professor;
	}

	public void setProfessor(String professor) {
		this.professor = professor;
	}

	public boolean adicionaAluno(Aluno a) {
		if(this.numAlunos <= this.maxAluno) {
			listaAlunos.add(a);
			this.setNumAlunos(this.getNumAlunos()+1);
			return true;
		} else {
			return false;
		}
	}

	public List<Aluno> getListaAlunos() {
		return listaAlunos;
	}	
}
