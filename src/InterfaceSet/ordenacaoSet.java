package InterfaceSet;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class ordenacaoSet{
    public static void main(String[] args) {
        
        System.out.println("--\tOrdem aleatorioa\t--");
        Set<Serie> minhaSeries = new HashSet<>(){{
            add(new Serie("GoT", "Fantasia", 60));
            add(new Serie("Dark", "drama", 60));
            add(new Serie("Thats 70's Show", "Comedia", 25));
        }};

        for (Serie serie : minhaSeries) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());

        }

        System.out.println("\n--\tOrdem de inserçao\t--");
        Set<Serie> minhaSeries1 = new LinkedHashSet<>(){{
            add(new Serie("GoT", "Fantasia", 60));
            add(new Serie("Dark", "drama", 60));
            add(new Serie("70's Show", "Comedia", 25));
        }};

        for (Serie serie : minhaSeries1) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }
        System.out.println("\n--\tOrdem de tempoEpisodio\t--");
        Set<Serie> minhaSeries2 = new TreeSet<>(minhaSeries1);
        for (Serie serie : minhaSeries2) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());    
        }

        System.out.println("\n--\tOrdem de tempoEpisodio\t--");
        Set<Serie> minhaSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempo());
        minhaSeries3.addAll(minhaSeries);
        for (Serie serie : minhaSeries3) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());    
        }
    }
}












class Serie implements Comparable<Serie>{

    private String nome;
    private String genero;
    private Integer tempoEpisodio;
    
    public Serie(String nome, String genero, Integer tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

    @Override
    public String toString() {
        return "[nome=" + nome + ", genero=" + genero + ", tempoEpisodio=" + tempoEpisodio + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEpisodio);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Serie serie = (Serie) obj;
        return nome.equals(serie.nome) && genero.equals(serie.genero) && tempoEpisodio.equals(serie.tempoEpisodio);
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }

    @Override
    public int compareTo(Serie serie) {

        int tempoEpisodio =  Integer.compare(this.getTempoEpisodio(), serie.tempoEpisodio);
        if (tempoEpisodio != 0) {
             return tempoEpisodio;
        }
        return this.getGenero().compareTo(serie.getGenero());
    }
}

class ComparatorNomeGeneroTempo implements Comparator<Serie>{


    @Override
    public int compare(Serie s1, Serie s2) {
        int nome = s1.getNome().compareTo(s2.getNome());
        if (nome != 0) return nome;

        int genero = s1.getGenero().compareTo(s2.getGenero());
        if (genero != 0) return genero;

        return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());
    }
}

