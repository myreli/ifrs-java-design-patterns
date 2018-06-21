package modelo;

/**
 *
 * @author Myreli Borba
 */
public class DispositivoACommand implements Command{
    DispositivoA dispositivo;

    public DispositivoACommand(DispositivoA da) {
        this.dispositivo = da;
    }
    
    @Override
    public String execute() {
        return this.dispositivo.ligar();
    }
}
