package negocio;

/**
 *
 * @author Myreli
 * 
 */
public interface ControladorState {
    ControladorState insereMoeda();
    ControladorState ejetaMoeda();
    ControladorState acionaAlavanca();
    ControladorState entregaGoma();
}
