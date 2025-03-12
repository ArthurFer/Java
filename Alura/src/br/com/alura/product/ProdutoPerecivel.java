package br.com.alura.product;

import java.text.DateFormat;
import java.util.Date;

public class ProdutoPerecivel extends Produto{
    private int dataValidade;
    public ProdutoPerecivel(String nome, double preco, int quantidade, int dataValidade) {
        super(nome, preco, quantidade);
    }

    public int getDataValidade() {
        return this.dataValidade;
    }

    @Override
    public String toString() {
        return super.toString() + getDataValidade();
    }
}
