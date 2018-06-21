package model;

public class PDF extends Documento {

	public PDF() {
		this.nome  		= "arquivoPDF";
		this.content	= "content pdf";
		this.path	    = "/path/to/";
	}
	
	protected PDF(PDF pdf) {
		this.nome  = pdf.getNome();
		this.content   = pdf.getContent();
		this.path   = pdf.getPath();
	}
	
	@Override
	public String info() {
		return "CLONE: " + getNome() + " | " + getContent() + " | " + getPath() + "\n";
	}

	@Override
	public PDF clone() {
		return new PDF(this);
	}
}