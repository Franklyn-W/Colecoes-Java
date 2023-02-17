package InterfaceMap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Map.Entry;

public class OrdenaçãoMap {
    public static void main(String[] args) {

        System.out.println("--\tOrdem aleatoria\t--");

        Map<String, Livro> meusLivros = new HashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma Breve Historia do Tempo", 256));
            put("Dulhigg, Charles", new Livro("O Poder do Habito", 488));
            put("Harari, Yuval Naah", new Livro("21 Licoes Para o Seculo 21", 432));
        }};

        
        for(Entry<String, Livro> livro : meusLivros.entrySet()){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println("\n--\tOrdem aleatoria\t--");

        Map<String, Livro> meusLivros1 = new LinkedHashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma Breve Historia do Tempo", 256));
            put("Dulhigg, Charles", new Livro("O Poder do Habito", 488));
            put("Harari, Yuval Naah", new Livro("21 Licoes Para o Seculo 21", 432));
        }};

        
        for(Entry<String, Livro> livro : meusLivros1.entrySet()){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println("--\tOrdem alfabetica autores\t--");

        Map<String, Livro> meusLivros2 = new TreeMap<>(){{
            put("Hawking, Stephen", new Livro("Uma Breve Historia do Tempo", 256));
            put("Dulhigg, Charles", new Livro("O Poder do Habito", 488));
            put("Harari, Yuval Naah", new Livro("21 Licoes Para o Seculo 21", 432));
        }};

        
        for(Entry<String, Livro> livro : meusLivros2.entrySet()){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println("--\tOrdem alfabetica nome dos livros\t--");

        Set<Entry<String, Livro>> meusLivros3 = new TreeSet<>(new comparatorNome());
        meusLivros3.addAll(meusLivros.entrySet());
        for(Entry<String, Livro> livro : meusLivros3){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }
        







    }
}







class Livro{
    private Integer paginas;
    private String nome;

    public Livro(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public Integer getPaginas() {
        return paginas;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, paginas);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Livro livro = (Livro) obj;
        if (paginas == null) {
            if (livro.paginas != null)
                return false;
        } else if (!paginas.equals(livro.paginas))
            return false;
        if (nome == null) {
            if (livro.nome != null)
                return false;
        } else if (!nome.equals(livro.nome))
            return false;
        return nome.equals(livro.nome) && paginas.equals(livro.paginas);
    }

    @Override
    public String toString() {
        return "paginas=" + paginas + ", nome=" + nome;
    }
    
    
}

class comparatorNome implements Comparator<Entry<String, Livro>>{

    @Override
    public int compare(Entry<String, Livro> l1, Entry<String, Livro> l2) {
        return l1.getValue().getNome().compareTo(l2.getValue().getNome());
    }

}