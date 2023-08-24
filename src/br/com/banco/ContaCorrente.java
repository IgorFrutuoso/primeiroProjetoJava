package br.com.banco;

public class ContaCorrente extends Conta {
    private String tipo;

    private double chequeEspecial = 0.0;

    public ContaCorrente(int numero, int agencia, double saldo, String tipo) {
        super(numero, agencia, saldo);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    public double getSaldoDisponivel() {
        return verificarSaldo() + this.chequeEspecial;
    }

    @Override
    public void retirar(double valor) {
        valor += 10;
        super.retirar(valor);
    }
}
