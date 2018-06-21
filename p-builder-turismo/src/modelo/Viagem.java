package modelo;

import java.util.Calendar;

public class Viagem {
	
	private Calendar inicio;
	private Calendar fim;
	private Double 	 valor;
	private String	 RG;
    private boolean  onibus;
    private boolean  parcelado;
    private boolean  dinheiro;
   
    public Viagem(Calendar inicio, Calendar fim, Double valor, String rG, boolean onibus, boolean parcelado,
			boolean dinheiro) {
		super();
		this.inicio = inicio;
		this.fim = fim;
		this.setValor(valor);
		RG = rG;
		this.onibus = onibus;
		this.parcelado = parcelado;
		this.dinheiro = dinheiro;
	}
    
    public static class Builder {
    	private Calendar inicio;
    	private Calendar fim;
    	private Double 	 valor;
    	private String	 RG;
        private boolean  onibus;
        private boolean  parcelado;
        private boolean  dinheiro;
        
        public Builder(Calendar inicio, Calendar fim, String RG){
            this.inicio = inicio;
            this.fim = fim;
            this.valor = 2000.0;
            this.RG = RG;
            this.onibus = false;
            this.parcelado = false;
            this.dinheiro = false;
        }
        
        public Builder onibus(){
            this.onibus = true;
            return this;
        }
        
        public Builder parcelado(){
            this.parcelado = true;
            return this;
        }
        
         public Builder dinheiro(){
            this.dinheiro = true;
            return this;
        }   
         
         public Viagem build() {
             return new Viagem(this);
         }
        
    }
    
    private Viagem(Builder builder){
    	this.inicio = builder.inicio;
		this.fim = builder.fim;
		this.setValor(builder.valor);
		RG = builder.RG;
		this.onibus = builder.onibus;
		this.parcelado = builder.parcelado;
		this.dinheiro = builder.dinheiro;
    }

	public Calendar getInicio() {
		return inicio;
	}

	public void setInicio(Calendar inicio) {
		this.inicio = inicio;
	}

	public Calendar getFim() {
		return fim;
	}

	public void setFim(Calendar fim) {
		this.fim = fim;
	}

	public String getRG() {
		return RG;
	}

	public void setRG(String rG) {
		RG = rG;
	}

	public boolean isOnibus() {
		return onibus;
	}

	public void setOnibus(boolean onibus) {
		this.onibus = onibus;
	}

	public boolean isParcelado() {
		return parcelado;
	}

	public void setParcelado(boolean parcelado) {
		this.parcelado = parcelado;
	}

	public boolean isDinheiro() {
		return dinheiro;
	}

	public void setDinheiro(boolean dinheiro) {
		this.dinheiro = dinheiro;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Viagem [inicio=" + inicio.getTime() + ", fim=" + fim.getTime() + ", valor=" + valor + ", RG=" + RG + ", onibus=" + onibus
				+ ", parcelado=" + parcelado + ", dinheiro=" + dinheiro + "]";
	}
    
}
