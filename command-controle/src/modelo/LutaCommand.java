package modelo;

/**
 *
 * @author Myreli Borba
 */
public class LutaCommand implements Command{
    private Luta luta;

    public LutaCommand(Luta luta) {
        this.luta = luta;
    } 
    
    @Override
    public String executeA() {
        return this.luta.soca();
    }
    
    @Override
    public String executeB() {
        return this.luta.chuta();
    }

}
