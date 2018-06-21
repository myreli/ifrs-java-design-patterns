package modelo;

/**
 *
 * @author Myreli Borba
 */
public class GuerraCommand implements Command{
    private Guerra guerra;

    public GuerraCommand(Guerra guerra) {
        this.guerra = guerra;
    } 
    
    @Override
    public String executeA() {
        return this.guerra.atira();
    }
    
    @Override
    public String executeB() {
        return this.guerra.esconde();
    }

}
