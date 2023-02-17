package InterfaceList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ordenacaoDeList {
    public static void main(String[] args) {
        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("Safira", 8, "amarela"));
            add(new Gato("Dinha", 10, "branco"));
            add(new Gato("kira", 5, "cinza"));
        }};

        // Ordem de inserção
        System.out.println("--\tOrdem de inserção\t--");
        System.out.println(meusGatos);

        // Ordem aleatoria
        System.out.println("\n--\tOrdem aleatoria\t--");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        // Ordem alfabetica (nome)
        System.out.println("\n--\tOrdem natural (nome)\t--");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);

        // Ordem numerica (idade)
        System.out.println("\n--\tOrdem natural (idade)\t--");
        Collections.sort(meusGatos,new ComparetorIdade());
        // meusGatos.sort(new ComparetorIdade());
        System.out.println(meusGatos);

        // Ordem de cor
        System.out.println("\n--\tOrdem natural (cor)\t--");
        meusGatos.sort(new ComparetorCor());
        System.out.println(meusGatos);

        // Odem por nome/cor/idade
        System.out.println("\n--\tOrdem por nome/cor/idade\t--");
        Collections.sort(meusGatos, new ComparetorNomeCorIdade());
        System.out.println(meusGatos);

    }
}


 class Gato implements Comparable<Gato>{
    private String nome;
    private Integer idade;
    private String cor;
    
    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "[nome=" + nome + ", idade=" + idade + ", cor=" + cor + "]";
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}

class ComparetorIdade implements Comparator<Gato>{

    @Override
    public int compare(Gato g1, Gato g2) {
        return Integer.compare(g1.getIdade() , g2.getIdade());
    }
    
}

class ComparetorCor implements Comparator<Gato>{

    @Override
    public int compare(Gato g1, Gato g2) {
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }

}

class ComparetorNomeCorIdade implements Comparator<Gato>{

    @Override
    public int compare(Gato g1, Gato g2) {
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if (nome != 0) return nome;

        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
        if (cor != 0) return cor;

        return Integer.compare(g1.getIdade(), g2.getIdade());
    }

}