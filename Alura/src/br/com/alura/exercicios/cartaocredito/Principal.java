package br.com.alura.exercicios.cartaocredito;

import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Locale.setDefault(new Locale("en", "US"));

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o limite do cartão: ");
        double limite = sc.nextDouble();

        Cartao cartao = new Cartao(limite);

        int sair = 1;

        while (sair != 0){
            System.out.println("Digite a descrição da compra: ");
            String descricao = sc.next();

            System.out.println("Digite o valor da compra: ");
            double valor = sc.nextDouble();

            Compras compra = new Compras(descricao, valor);

            boolean compraRealizada = cartao.lancaCompra(compra);

            if(compraRealizada){
                System.out.println("Compra realizada!");
                System.out.println("Digite 1 para continuar ou 0 para sair");
                sair = sc.nextInt();
            } else {
                System.out.println("Saldo insuficiente!");
                sair = 0;
            }

            System.out.println("-------------------");
            System.out.println("COMPRAS REALIZADAS: \n");

            Collections.sort(cartao.getCompras());

            for (Compras c : cartao.getCompras()){
                System.out.println(c.getDescricao() + " - " + c.getValor());
            }

            System.out.println("-------------------");
            System.out.println("Saldo do cartão: " + cartao.getSaldo());
        }
    }
}
