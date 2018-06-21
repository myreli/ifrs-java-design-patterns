package modelo;

import java.util.List;

import javax.swing.JOptionPane;

/**
 *
 * @author Myreli
 */
public class LoginJO extends Login {

	public LoginJO(List<Usuario> usuarios) {
		super(usuarios);
	}

	@Override
	protected void prompt() {
		login = JOptionPane.showInputDialog("Bem Vindo! digite o usuário: ");
		senha = JOptionPane.showInputDialog("agora a senha: ");
	}

	@Override
	protected void aviso(boolean logou) {
		if(logou)
			JOptionPane.showMessageDialog(null, "Logado! :D");
		else
			JOptionPane.showMessageDialog(null, "Dados incorretos :(");
	}

	@Override
	protected String getLogin() {
		return login;
	}

	@Override
	protected String getSenha() {
		return senha;
	}
}
