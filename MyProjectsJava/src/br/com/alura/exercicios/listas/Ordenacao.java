package br.com.alura.exercicios.listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ordenacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;


        ArrayList lista = new ArrayList();

        for (int i = 1; i <= 10; i++){
            System.out.println("Digite o " + i + "º " + "numero:");
            numero = sc.nextInt();
            lista.add(numero);

        }

        System.out.println("Lista na ordem introduzida: ");
        System.out.println(lista);

        Collections.sort(lista);
        System.out.println("Lista ordenada: ");
        System.out.println(lista);

    }
}
