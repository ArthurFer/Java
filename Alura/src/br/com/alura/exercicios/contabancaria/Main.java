package br.com.alura.exercicios.contabancaria;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria(101, 1500.0);
        ContaBancaria conta2 = new ContaBancaria(102, 2500.0);
        ContaBancaria conta3 = new ContaBancaria(103, 1800.0);

        ArrayList<ContaBancaria> listaContas = new ArrayList<>();
        listaContas.add(conta1);
        listaContas.add(conta2);
        listaContas.add(conta3);

        //Atribui o primeiro valor da lista a uma variável através do construtor ContaBancaria
        ContaBancaria contaMaiorSaldo = listaContas.get(0);
        for (ContaBancaria conta : listaContas) {
            // Verifica se o saldo na posição atual do for é maior que a posição inicial, se sim guarda na variável e verifica comparando com o próximo.
            if (conta.getSaldo() > contaMaiorSaldo.getSaldo()) {
                contaMaiorSaldo = conta;
            }
        }

        System.out.println("Conta com o maior saldo - Número: " + contaMaiorSaldo.getNumeroConta() +
                ", Saldo: " + contaMaiorSaldo.getSaldo());
    }
}
