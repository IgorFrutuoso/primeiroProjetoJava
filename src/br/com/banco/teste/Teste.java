package br.com.banco.teste;

import br.com.banco.Conta;
import br.com.banco.ContaCorrente;

public class Teste {
	
	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(2, 593, 23.7, "Corrente");
		
		System.out.println(cc.getSaldoDisponivel());
		cc.retirar(3.7);
		System.out.println(cc.getSaldoDisponivel());
		cc.depositar(70.0);
		System.out.println(cc.getTipo());
		System.out.println(cc.verificarDataAbertura());
		System.out.println(cc.getChequeEspecial());
		cc.setChequeEspecial(700.0);
	}
}
