package com.mycompany.gerenciaBanco.entities;

public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}
	
	@Override
	public void sacar(double valor) {
			saldo -= valor; // contas corrente não tem limite de saque, mas o saldo pode ficar negativo.
	}
	
	@Override
	public void imprimirExtrato() {
		System.out.println();
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
		System.out.println();
	}
}
