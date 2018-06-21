package modelo;

/**
 *
 * @author Myreli Borba
 */
public class FutebolCommand implements Command{
    Futebol futebol;

    public FutebolCommand(Futebol futebol) {
        this.futebol = futebol;
    }
    
    @Override
    public String executeA() {
        return this.futebol.chutar();
        
    }

    @Override
    public String executeB() {
        return this.futebol.passar();
    }
}
