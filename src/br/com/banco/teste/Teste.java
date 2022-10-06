package br.com.banco.teste;

public class Teste {
	
	public static void main(String[] args) {
		
		Conta cc = new Conta(2, 593, 23.7);
		
		System.out.println(cc.verificarSaldo());
	}
}
