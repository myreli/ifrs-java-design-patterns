package apresentacao;

import negocio.Controlador;

/**
 *
 * @author Myreli
 * 
 */
public class Main {

    public static void main(String[] args) {
        Controlador maquinaGomas = new Controlador();
        maquinaGomas.insereMoeda();

        maquinaGomas.acionaAlavanca();
        
        maquinaGomas.entregaGoma();
        
        System.out.println("Estado final: " + maquinaGomas.getEstado().getClass().getSimpleName());
        
        System.out.println("log disponível em: " + maquinaGomas.getLogPath());
    }
    
}
