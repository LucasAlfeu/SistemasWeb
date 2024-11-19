package br.model;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
	private List<Turma> listaTurma = new ArrayList();
	
	public Sistema() {
		
	}
	
	public List<Turma> getListaTurma() {
		return this.listaTurma;
	}
	
	public void setListaTurma(Turma t) {`
		listaTurma.addLast(t);
	}
}
