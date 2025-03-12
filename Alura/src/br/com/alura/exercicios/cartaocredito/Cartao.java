package br.com.alura.exercicios.cartaocredito;

import java.util.ArrayList;

public class Cartao {
    private double limite;
    private double saldo;
    private ArrayList<Compras> compras;

    public Cartao(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.compras = new ArrayList<>();
    }

    public boolean lancaCompra(Compras compra){
        if (this.saldo > compra.getValor()){
            this.saldo -= compra.getValor();
            this.compras.add(compra);
            return true;
        }

        return false;
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public ArrayList<Compras> getCompras() {
        return compras;
    }
}
