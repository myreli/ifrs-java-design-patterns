package apresentacao;

import java.util.ArrayList;
import java.util.List;

import modelo.Login;
import modelo.LoginJO;
import modelo.LoginTerminal;
import modelo.Usuario;

/**
 *
 * @author Myreli
 */
public class Main {

	public static void main(String[] args) {

		// template method

		List<Usuario> usuarios = new ArrayList<Usuario>();

		usuarios.add(new Usuario("igor", "igor"));
		usuarios.add(new Usuario("myreli", "myreli"));
		usuarios.add(new Usuario("admin", "admin"));

		Login terminal = new LoginTerminal(usuarios);

		terminal.loga();
		
		Login bonito = new LoginJO(usuarios);
		
		bonito.loga();

	}
}
