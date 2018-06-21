package negocio;

/**
 *
 * @author Myreli
 * 
 */
public class ControladorGomaVendida implements ControladorState {

    public ControladorGomaVendida() { }

    @Override
    public ControladorState insereMoeda() {
        System.out.println("Ainda não entregou a goma vendida...");
        return this;
    }

    @Override
    public ControladorState entregaGoma() {
    	return this;
    }

    @Override
    public ControladorState ejetaMoeda() {
        return new ControladorSemMoeda();
    }

    @Override
    public ControladorState acionaAlavanca() {
        return this;
    }
    
}
