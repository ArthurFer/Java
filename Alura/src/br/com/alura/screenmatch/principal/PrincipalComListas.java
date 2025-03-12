package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.setDuracaoEmMinutos(200);
        meuFilme.avalia(10);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.setDuracaoEmMinutos(180);
        outroFilme.avalia(7);
        Filme terceiroFilme = new Filme("Clube da luta", 1998);
        terceiroFilme.avalia(10);
        terceiroFilme.setDuracaoEmMinutos(190);
        Serie lost = new Serie("Lost", 2000);
        lost.avalia(7);
        lost.setDuracaoEmMinutos(100);
        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(terceiroFilme);
        lista.add(lost);

        for (Titulo item: lista){
            System.out.println(item.getNome());
            if (item instanceof Filme filme) {
                //Verifica se o item é uma instancia da classe filme, se sim, classifica (o método só existe em Filme)
                System.out.println("Classificação " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Tom Cruise");
        buscaPorArtista.add("Christian Bale");
        buscaPorArtista.add("Antonio Fagundes");
        buscaPorArtista.add("Wagner Moura");

        System.out.println(buscaPorArtista);

        // Para comparar uma lista de Strings basta chamar o método Collections.sort
        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação:");
        System.out.println(buscaPorArtista);

        /* Para comparar uma lista que não é de String é preciso implementar uma interface na classe Titulo
        implements Comparable<Titulo>
            @Override
            // CompareTo vai comparar o nome de um titulo com o outro
            public int compareTo(Titulo outroTitulo) {
                return this.getNome().compareTo(outroTitulo.getNome());
            }

        */

        Collections.sort(lista);
        System.out.println(lista);

        // Outra forma de comparar é utilizando o .sort(Comparator.comparing), com esse método é possível escolher qual o parâmetro da comparação
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano");
        System.out.println(lista);
    }

}
