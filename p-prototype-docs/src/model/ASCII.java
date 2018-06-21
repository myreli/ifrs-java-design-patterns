package model;

public class ASCII extends Documento {

	public ASCII() {
		this.nome  		= "arquivoascii";
		this.content	= "content ascii";
		this.path	    = "/path/to/";
	}
	
	protected ASCII(ASCII ascii) {
		this.nome  = ascii.getNome();
		this.content   = ascii.getContent();
		this.path   = ascii.getPath();
	}
	
	@Override
	public String info() {
		return "CLONE: " + getNome() + " | " + getContent() + " | " + getPath() + "\n";
	}

	@Override
	public ASCII clone() {
		return new ASCII(this);
	}
}