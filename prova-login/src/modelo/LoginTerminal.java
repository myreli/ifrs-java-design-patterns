package modelo;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Myreli
 */
public class LoginTerminal extends Login {

	public LoginTerminal(List<Usuario> usuarios) {
		super(usuarios);
	}

	@Override
	protected void prompt() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bem vindo...\n");
		System.out.print("Digite o login: ");
		login = scanner.nextLine();
		System.out.print("Digite a senha: ");
		senha = scanner.nextLine();
		
		System.out.println("tentando login para " + login);
	}

	@Override
	protected void aviso(boolean logou) {
		if(logou)
			System.out.println("logado!");
		else
			System.out.println("login ou senha incorretos...");
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
