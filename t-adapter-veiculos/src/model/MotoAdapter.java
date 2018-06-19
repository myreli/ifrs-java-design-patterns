package model;

/**
 *
 * @author Myreli Borba
 */
public class MotoAdapter implements Carro {
    
	Moto moto;
    
    public MotoAdapter(Moto moto){
        this.moto = moto;
    }

    @Override
    public void quatroRodas() {
        this.moto.duasRodas();
    }

    @Override
    public void volante() {
        this.moto.guidao();
    }
    
}
