package InterfaceSet;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class metodosSet {
    public static void main(String[] args) {
        
        System.out.println("Crie um conjunto e adicione as notas: ");

        Set<Double> notas = new HashSet<>(Arrays.asList(7d,8.5,9.3,5d,7d,0d,3.6));
        System.out.println(notas);

        // Exibindo a posição da nota 5.0(5d)
        // Set nao permite busca via indice, pois nao possui GET

        // Adicione item em posicao especifica
        // Set nao permite trabalhar com posições especificas, pois nao possui indice

        // Substituindo item especifico por outro
        // Tambem nao é possivel realizar essa ação com SET

        // Buscando item especifico
        System.out.println("\nA nota 5.0 esta no conjunto? " + notas.contains(5d));

        // Exibir item em posição especifica
        // Não é possivel realizar esta ação com SET

        // Exibir o menor valor do conjunto
        System.out.println("\nExibindo o menor valor do conjunto: " + Collections.min(notas));
        
        // Exibir o maior valor do conjunto
        System.out.println("\nExibindo o maior valor do conjunto: " + Collections.max(notas));
   
        // Somando os valores do conjunto
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("\nSoma dos valores do conjunto: " + soma);
        
        // Media dos valores do conjunto
        System.out.println("\nMedia dos valores: " + soma/(notas.size()));
   
        // Removendo item especifico
        System.out.println("\nRemovendo a nota 0.0 ");
        notas.remove(0d);
        System.out.println(notas);
   
        // Removendo item de posição especifica
        // Impossivel realizar pois SET nao possui indice

        // Remover itens menor que determinado valor
        Iterator<Double> iterator2 = notas.iterator();
        while (iterator2.hasNext()) {
            Double next = iterator2.next();
            if (next < 7) {
                iterator2.remove();
            }
        }
        System.out.println("\nRetirando os valores menor que 7 " + notas);

        // Exibindo os valores na ordem que foram informados
        // Para essa funcao deve ser utilizado a implementação LinkedHashSet
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);
        System.out.println("\nNotas2 " + notas2);

        // Exibir itens na ordem crescente
        // Deve ser usado a implementação TreeSet
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println("\nExibindo na ordem crescente " + notas3);

        // Apagando todo o conjunto
        System.out.println("\nApagando todo o conjunto ");
        notas.clear();;
        System.out.println("Conferindo se o conjunto notas esta vazio: " + notas.isEmpty());
        System.out.println(notas);
    }
    
}
