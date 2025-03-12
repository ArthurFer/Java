public class ContaCorrente extends Conta {
    public ContaCorrente(int numero, Conta titular, int agencia, int conta) {
        super(numero, titular, agencia, conta);
    }

    public ContaCorrente(int numero, Conta titular, int agencia, int conta, double saldo) {
        super(numero, titular, agencia, conta, saldo);
    }
}
