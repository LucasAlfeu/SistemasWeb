package br.session.model;

public class Usuario {
	private String usuario;
	private String senha;
	
	public Usuario(String user, String password) {
		this.usuario = user;
		this.senha = password;
	}
	
	public String getUsuario() {
		return this.usuario;
	}
}