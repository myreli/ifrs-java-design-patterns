package test;

import model.BancoUsuariosProxy;

/**
 *
 * @author Myreli Borba
 */
public class Main {
    
    public static void main(String[] args) {
        
    	System.out.println("Testing proxy design pattern...");
    	
    	
    	System.out.println("\nmust pass:");
    	
    	BancoUsuariosProxy bancoUsuariosProxy = new BancoUsuariosProxy("test", "test");
        System.out.println(bancoUsuariosProxy.getNumeroDeUsuarios());
        System.out.println(bancoUsuariosProxy.getUsuariosConectados());
        
        
        System.out.println("\nmust fail:");
        bancoUsuariosProxy = new BancoUsuariosProxy("test", "wrong");
        System.out.println(bancoUsuariosProxy.getNumeroDeUsuarios());
        System.out.println(bancoUsuariosProxy.getUsuariosConectados());
    }
    
}
