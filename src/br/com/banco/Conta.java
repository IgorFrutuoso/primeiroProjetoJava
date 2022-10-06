package br.com.banco;

public class Conta {
	
	public int numero; 
	
	public int agencia; 
	
	public double saldo;
	
	Cliente cliente = new Cliente();
	
	public Conta() {
		
	}
	public Conta(int numero, int agencia, double saldo) {
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = saldo;
	}
	
	public void retirar(int valor) {
		this.saldo -= valor;
	}
	
	public void depositar(int valor) {
		this.saldo += valor;
	}
	
	public double verificarSaldo() {
		return saldo;
	}
}