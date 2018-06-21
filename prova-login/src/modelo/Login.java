package modelo;

import java.util.List;

/**
 *
 * @author Myreli
 */
public abstract class Login {
	
	protected String login;
	protected String senha;
	private List<Usuario> usuarios;
	
	public Login(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
        
	public final void loga() {
		prompt();
		boolean logou = autentica(getLogin(), getSenha());
		aviso(logou);
	}
	
    public final boolean autentica(String login, String senha){
        
        for (Usuario usuario : usuarios) {
        	if(usuario.getLogin().equals(login.trim()) && usuario.getSenha().equals(senha.trim()))
        		return true;
        }
        
        return false;
    }
    
    protected abstract void prompt();
    protected abstract void aviso(boolean logou);
    protected abstract String getLogin();
    protected abstract String getSenha();
}
