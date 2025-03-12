package br.com.alura.product;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Produto prod1 = new Produto("Arroz", 4.58, 100);
        Produto prod2 = new Produto("Feijão", 6.99, 300);
        Produto prod3 = new Produto("Macarrão", 3.59, 50);
        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(prod1);
        produtos.add(prod2);
        produtos.add(prod3);



        ProdutoPerecivel perecivel = new ProdutoPerecivel("Iogurte", 2.99, 30, 20);
        produtos.add(perecivel);

        System.out.println("Tamanho lista: " + produtos.size());
        System.out.println("Produto 2: " + produtos.get(1));
        System.out.println(produtos);
    }
}
