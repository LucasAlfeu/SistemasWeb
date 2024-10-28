package br.atividade01;

import java.util.Scanner;

public class Atividade01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Cadastro de Aluno");
		Aluno al = new Aluno();
		
		System.out.println("Insira os dados necessários");
		System.out.println("Nome: ");
		String nomeAl = sc.next();
		
		System.out.println("Email: ");
		String emailAl = sc.next();
		
		System.out.println("Matricula: ");
		String matriculaAl = sc.next();
		
		al.setNome(nomeAl);
		al.setMatricula(matriculaAl);
		al.setEmail(emailAl);
		
		System.out.println(al.toString());
		
		System.out.println("Cadastro de Disciplina");
		System.out.println("Numero de disciplinas: ");
		int numD = sc.nextInt();
		if(numD < 1) {
			System.out.println("Nenhuma disciplina a ser cadastrada!!!");
		} else {
			for(int i = 0; i <= numD; i++) {
				Disciplina d = new Disciplina();
				
				System.out.println("Nome: ");
				String nomeD = sc.next();
				
				System.out.println("Periodo: ");
				int periodoD = sc.nextInt();
				
				System.out.println("Nota: ");
				float notaD = sc.nextFloat();
				
				d.setNome(nomeD);
				d.setNota(notaD);
				d.setPerido(periodoD);
				
				System.out.println(d.toString());
			}
		}
	}
}
