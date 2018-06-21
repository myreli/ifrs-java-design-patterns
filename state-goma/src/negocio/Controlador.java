package negocio;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author Myreli
 * 
 */
public class Controlador {
    
	private Integer gomas;
    private Integer moedas;
    private boolean temMoeda;
    private ControladorState estado;
    private File logFile;

    public Controlador() {
        this.estado = new ControladorSemMoeda();
        this.gomas 	= 10;
        this.moedas = 0;
        log("-----\n--------\ncontrolador criado com " + moedas + " moedas e " + gomas + " gomas.");
    }
    
    
    public void insereMoeda(){
    	log("chamada insereMoeda");
        this.estado = estado.insereMoeda();
        
        if(this.estado.getClass().getSimpleName().equals("ControladorRecebeuMoeda")) 
        	temMoeda = true;
        
        log("inserindo moeda... tem moeda? " + temMoeda);
    }
    
    public void entregaGoma(){
    	log("chamada entregaGoma");
        this.estado = estado.entregaGoma();
        if (this.estado.getClass().getSimpleName().equals("ControladorGomaVendida")){
            System.out.println("Entregando...");
            this.gomas--;
            this.moedas++;
            log("agora tem " + gomas + " gomas e " + moedas + " moedas");
            if (this.gomas > 0){
                this.estado = new ControladorSemMoeda();
                log("controlador no estado inicial");
            } else {
            	this.estado = new ControladorSemGomas();
            	log("fim do estoque de gominhas");
                System.out.println("Essa máquina não tem mais gominhas... :(");
            }
        }
    }
    
    public void ejetaMoeda(){
    	log("chamada ejetaMoeda");
        this.estado = this.estado.ejetaMoeda();
        if(this.estado.getClass().getSimpleName().equals("ControladorSemMoedas"))
        	System.out.println("ejetou a moeda");
        
        log("tentou ejetar moeda. tem moeda? " + temMoeda);
    }
    
    public void acionaAlavanca(){
    	log("chamada acionaAlavanca");
        this.estado = this.estado.acionaAlavanca();
        if(this.estado.getClass().getSimpleName().equals("ControladorSemMoedas")) {
        	System.out.println("Precisa ter uma moedinha... ");
        	log("controlador sem moeda");
        	
        } else if (this.estado.getClass().getSimpleName().equals("ControladorSemGomas")) {
        	System.out.println("não tem como pq não tem gomas :( ");
        	log("controlador sem gomas");
        }
    }


	public Integer getGomas() {
		return gomas;
	}


	public void setGomas(Integer gomas) {
		this.gomas = gomas;
	}


	public Integer getMoedas() {
		return moedas;
	}


	public void setMoedas(Integer moedas) {
		this.moedas = moedas;
	}

	public boolean isTemMoeda() {
		return temMoeda;
	}	
	
	public void setTemMoeda(boolean temMoeda) {
		this.temMoeda = temMoeda;
	}

	public ControladorState getEstado() {
		return estado;
	}


	public void setEstado(ControladorState estado) {
		this.estado = estado;
	}
	
	public String getLogPath() {
		try {
			if(logFile != null)
				return logFile.getCanonicalPath();
			else
				return "o arquivo de logs não foi criado";
		} catch (IOException e) {
			// e.printStackTrace();
			return "não foi possível recuperar o caminho do arquivo";
		}
	}
	
	private void log(String action){
        try {
        	BufferedWriter writer = null;
            String timeLog = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
            logFile = new File("logs");
            writer = new BufferedWriter(new FileWriter(logFile, true));
            writer.write(timeLog + " | " + action + " | " + this.estado.getClass().getSimpleName() + "\n");
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
	@Override
	public String toString() {
		return "Controlador [gomas=" + gomas + ", moedas=" + moedas + ", estado=" + estado + "]";
	}    
    
}
