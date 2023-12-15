package edu.arthur.primeirasemana;

public class MinhaClasse {

    public static void main (String [] args){
        String primeiroNome = "Arthur";
        String segundoNome = "Fernando";
        int n1 = 10;
        int n2 = 20;

        int soma = somar(n1,n2);
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
        System.out.println(soma);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }

    public static int somar (int n1, int n2){
        return n1 + n2;

    }
}

