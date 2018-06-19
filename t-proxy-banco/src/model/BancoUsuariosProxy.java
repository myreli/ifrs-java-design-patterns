package model;

/**
 *
 * @author Myreli Borba
 */
public class BancoUsuariosProxy extends BancoUsuarios {
	
    private final String username;
    private final String password;
    
    private final static String VALID_USERNAME		  = "test";
    private final static String VALID_PASSWORD		  = "test";
    private final static String MSG_PERMISSION_DENIED = "Sorry, friend. Permission denied.";
    
    public BancoUsuariosProxy(String username, String password) {
        super();
        this.username = username;
        this.password = password;        
    }
    
    @Override
     public String getNumeroDeUsuarios() {
        if (!this.isAllowed()) 
        	return MSG_PERMISSION_DENIED;
        
        return super.getNumeroDeUsuarios();
    }

    @Override
    public String getUsuariosConectados() {
        if (!this.isAllowed()) 
        	return MSG_PERMISSION_DENIED;
        
        return super.getUsuariosConectados();
    }

    private boolean isAllowed(){
    	return VALID_USERNAME.equals(this.username) && VALID_PASSWORD.equals(this.password);
    }
    
}
