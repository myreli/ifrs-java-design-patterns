package negocio;

/**
 *
 * @author Myreli
 * 
 */
public class ControladorSemGomas implements ControladorState {

    public ControladorSemGomas() {
    }

    @Override
    public ControladorState insereMoeda() {
        return this;
    }

    @Override
    public ControladorState entregaGoma() {
        return this;
    }

    @Override
    public ControladorState ejetaMoeda() {
        return this;
    }

    @Override
    public ControladorState acionaAlavanca() {
        return this;
    }
    
}
