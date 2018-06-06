package com.modelo;

public class MenuItem {

	private String nome;
	private String descricao;
	private double preco;
	private boolean isVegetariano;
	
	public MenuItem(String nome, String descricao, double preco, boolean isVegetariano) {
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
		this.isVegetariano = isVegetariano;
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
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public boolean isVegetariano() {
		return isVegetariano;
	}
	public void setVegetariano(boolean isVegetariano) {
		this.isVegetariano = isVegetariano;
	}

	@Override
	public String toString() {
		return "MenuItem [nome=" + nome + ", descricao=" + descricao
				+ ", preco=" + preco + ", isVegetariano=" + isVegetariano + "]";
	}
	
 
}
