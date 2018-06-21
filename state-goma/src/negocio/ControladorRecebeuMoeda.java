package negocio;

/**
 *
 * @author Myreli
 * 
 */

public class ControladorRecebeuMoeda implements ControladorState {

    public ControladorRecebeuMoeda() { }

    @Override
    public ControladorState insereMoeda() {
        System.out.println("já está com moeda...");
        return this;
    }

    @Override
    public ControladorState entregaGoma() {
    	System.out.println("ops... precisa acionar a alavanca.");
        return this;
    }

    @Override
    public ControladorState ejetaMoeda() {
        return new ControladorSemMoeda();
    }

    @Override
    public ControladorState acionaAlavanca() {
        return new ControladorGomaVendida();
    }
    
}
