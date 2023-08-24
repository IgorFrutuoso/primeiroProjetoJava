package br.com.banco;
import java.time.LocalDateTime;

public class Conta {
	
	private int numero; 
	
	private int agencia; 
	
	private double saldo;

	public LocalDateTime dataAbertura = LocalDateTime.now();
	
	Cliente cliente = new Cliente();
	
	public Conta() {
		
	}
	public Conta(int numero, int agencia, double saldo) {
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = saldo;
	}
	
	public void retirar(double valor) {
		this.saldo -= valor;
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public double verificarSaldo() {
		return saldo;
	}

	public LocalDateTime verificarDataAbertura() {
		return dataAbertura;
	}
}