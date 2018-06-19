package test;

import model.MotoAdapter;
import model.cg125;

/**
 *
 * @author Myreli Borba
 */
public class Main {

    public static void main(String[] args) {
        
    	System.out.println("testing adapter design pattern...");
    	
        cg125 cg125 = new cg125();
        MotoAdapter motoAdapter = new MotoAdapter(cg125);
        motoAdapter.volante();
        motoAdapter.quatroRodas();
    }
        
}
