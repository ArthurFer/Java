public class ContaPoupanca extends Conta{
    public ContaPoupanca(int numero, Conta titular, int agencia, int conta) {
        super(numero, titular, agencia, conta);
    }

    public ContaPoupanca(int numero, Conta titular, int agencia, int conta, double saldo) {
        super(numero, titular, agencia, conta, saldo);
    }
}
