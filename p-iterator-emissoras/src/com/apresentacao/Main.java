package com.apresentacao;

import com.modelo.Cliente;
import com.modelo.EmissoraAberta;
import com.modelo.EmissoraEspecialista;

public class Main {

	public static void main(String [] args) {
		
		EmissoraEspecialista esp = new EmissoraEspecialista();
		EmissoraAberta aberta	 = new EmissoraAberta();
		
		Cliente cliente = new Cliente(esp, aberta);
		
		System.out.println("testando emissoras...\n");
		
		System.out.println("\nlistando todas as programacoes atraves da interface simples...\n");
		
		cliente.programacao();
		
		System.out.println("\nremovendo tudo utilizando a interface...\n");
		
		cliente.limpaProgramacao();
		
		System.out.println("\ne tentando listar novamente, mas tudo vazio...\n");
		
		cliente.programacao();
		
		System.out.println("\nfim da execução.");
	}
	
}
