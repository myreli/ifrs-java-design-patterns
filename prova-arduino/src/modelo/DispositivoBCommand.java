package modelo;

/**
 *
 * @author Myreli Borba
 */
public class DispositivoBCommand implements Command{
    private DispositivoB db;

    public DispositivoBCommand(DispositivoB db) {
        this.db = db;
    } 
    
    @Override
    public String execute() {
        return this.db.hibernate();
    }
}
