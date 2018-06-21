package negocio;

/**
 *
 * @author Myreli
 * 
 */
public class ControladorSemMoeda implements ControladorState {

    public ControladorSemMoeda() { }

    @Override
    public ControladorState insereMoeda() {
    	System.out.println("Moedinha inserida! :D");
        return new ControladorRecebeuMoeda();
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
