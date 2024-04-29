package com.mycompany.gerenciaBanco;

import java.util.Scanner;

import com.mycompany.gerenciaBanco.entities.Cliente;
import com.mycompany.gerenciaBanco.entities.Conta;
import com.mycompany.gerenciaBanco.entities.ContaCorrente;
import com.mycompany.gerenciaBanco.entities.ContaPoupanca;

public class App 
{
    public static void main( String[] args )
    {	
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("Bem vindo a etapa de criação de conta. Qual seu nome?");
    	Cliente cliente = new Cliente();
    	String nomeCliente = sc.nextLine();
		cliente.setNome(nomeCliente);
		
		Conta cc = new ContaCorrente(cliente);
		Conta cp = new ContaPoupanca(cliente);
		
		System.out.println("Conta poupanca e corrente criadas.");
		
		boolean active = true;
		
		while(active) {
			System.out.println("O que deseja fazer?");
			System.out.println("0. Encerrar");
			System.out.println("1. Depositar");
			System.out.println("2. Sacar");
			System.out.println("3. Transferir");
			
			int agir = sc.nextInt();
			int escolha;
			
			switch (agir) {
				case 0:
					System.out.println("Encerrando.");
					active = false;
					break;
				case 1:
					System.out.println("Qual conta?");
					System.out.println("1. Corrente");
					System.out.println("2. Poupanca");
					escolha = sc.nextInt();
					
					if(escolha == 1) {
						System.out.println("Qual valor?");
						int valor = sc.nextInt();
						cc.depositar(valor);
						System.out.println("Valor: " + valor + " depositado.");
						cc.imprimirExtrato();
					} else if (escolha == 2){
						System.out.println("Qual valor?");
						int valor = sc.nextInt();
						cp.depositar(valor);
						System.out.println("Valor: " + valor + " depositado.");
						cp.imprimirExtrato();
					} else {
						System.out.println("Valor invalido.");
						System.out.println("Encerrando.");
						active = false;
					}
					break;
				case 2:
					System.out.println("Qual conta?");
					System.out.println("1. Corrente");
					System.out.println("2. Poupanca");
					escolha = sc.nextInt();
					
					if(escolha == 1) {
						System.out.println("Qual valor?");
						int valor = sc.nextInt();
						cc.sacar(valor);
						System.out.println("Valor: " + valor + " sacado.");
						cc.imprimirExtrato();
					} else if (escolha == 2){
						System.out.println("Qual valor?");
						int valor = sc.nextInt();
						cp.sacar(valor);
						System.out.println("Valor: " + valor + " sacado.");
						cp.imprimirExtrato();
					} else {
						System.out.println("Valor invalido.");
						System.out.println("Encerrando.");
						active = false;
					}
					break;
					
				case 3:
					System.out.println("De qual conta?");
					System.out.println("1. Corrente");
					System.out.println("2. Poupanca");
					escolha = sc.nextInt();
					
					if(escolha == 1) {
						System.out.println("Qual valor?");
						int valor = sc.nextInt();
						cc.transferir(valor, cp);
						System.out.println("Valor: " + valor + " transferido para conta poupanca.");
						cp.imprimirExtrato();
					} else if (escolha == 2){
						System.out.println("Qual valor?");
						int valor = sc.nextInt();
						cp.transferir(valor, cc);
						System.out.println("Valor: " + valor + " transferido para conta corrente.");
						cc.imprimirExtrato();
					} else {
						System.out.println("Valor invalido.");
						System.out.println("Encerrando.");
						active = false;
					}
					break;
				
				default:
					System.out.println("Valor inválido.");
					break;
			}
			
		}
		System.out.println("Fim.");
		sc.close();
    }
}
