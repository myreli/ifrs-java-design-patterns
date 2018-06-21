package model;

public abstract class Documento implements Cloneable<Documento> {

	protected String nome;
	protected String path;
	protected String content;
	
	

	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getContent() {
		return content;
	}



	public void setContent(String content) {
		this.content = content;
	}


	public abstract String info();
	
	public abstract Documento clone();



	public String getPath() {
		return path;
	}



	public void setPath(String path) {
		this.path = path;
	}
	
}
