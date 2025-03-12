public abstract class Conta {

    private int numero;
    private Conta titular;
    private double saldo;
    private int agencia;
    private int conta;

    public Conta(int numero, Conta titular, int agencia, int conta) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0;
        this.agencia = agencia;
        this.conta = conta;
    }

    public Conta(int numero, Conta titular, int agencia, int conta, double saldo) {}

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Conta getTitular() {
        return titular;
    }

    public void setTitular(Conta titular) {
        this.titular = titular;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public void deposito(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
        }
    }

    public void transfere(Conta destino, double valor) {
        this.deposito(valor);
        destino.deposito(valor);
    }
}
