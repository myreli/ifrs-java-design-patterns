package modelo;

public class Configuracao {
	
	private static Configuracao uniqueInstance = new Configuracao();
	
	private Configuracao() { }
	
	public static Configuracao getUniqueInstance() {
		return uniqueInstance;
	}

	private String nome;
	private String titulo;
	private String frase;
	private Integer tamanhoTituloMax;
	private Integer tamanhoTituloMin;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getFrase() {
		return frase;
	}

	public void setFrase(String frase) {
		this.frase = frase;
	}

	public Integer getTamanhoTituloMax() {
		return tamanhoTituloMax;
	}

	public void setTamanhoTituloMax(Integer tamanhoTituloMax) {
		this.tamanhoTituloMax = tamanhoTituloMax;
	}

	public Integer getTamanhoTituloMin() {
		return tamanhoTituloMin;
	}

	public void setTamanhoTituloMin(Integer tamanhoTituloMin) {
		this.tamanhoTituloMin = tamanhoTituloMin;
	}
	
}
