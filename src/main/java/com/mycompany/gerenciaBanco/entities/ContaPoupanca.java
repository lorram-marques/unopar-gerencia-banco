package com.mycompany.gerenciaBanco.entities;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}
	
	@Override
	public void imprimirExtrato() {
		System.out.println();
		System.out.println("=== Extrato Conta Poupanca ===");
		super.imprimirInfosComuns();
		System.out.println();
	}
}
