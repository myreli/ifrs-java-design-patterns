package modelo;

public abstract class Jogo {

	private String nome;
	private String descricao;
	private String classificação;
	
	public Jogo(String nome) {
		this.nome = nome;
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
	public String getClassificação() {
		return classificação;
	}
	public void setClassificação(String classificação) {
		this.classificação = classificação;
	}
	
}