package com.mycompany.gerenciaBanco.exceptions;

public class SaldoInsuficienteException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public SaldoInsuficienteException(String msg) {
		super(msg);
	}
}
