package com.modelo;

public class Programa {

	private String nome;
	private String descricao;
	
	public Programa(String nome, String descricao) {
		this.nome = nome;
		this.descricao = descricao;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "Programa [nome=" + nome + ", descricao=" + descricao + "]";
	}
	
 
}
