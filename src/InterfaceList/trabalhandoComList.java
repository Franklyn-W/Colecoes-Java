package InterfaceList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class trabalhandoComList {
    public static void main(String[] args) {
        
        List<Double> notas = new ArrayList<>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);

        // Exibição dos itens da lista
        System.out.println(notas);
        System.out.println(notas.toString());

        // Consultando a posição de um item na lista
        System.out.println("\nExibindo a posição da nota 5.0: " + notas.indexOf(5d)); // 5d reprensenta 5.0 (double)
        
        // Adição de item na lista em determinada posição
        System.out.println("\nAdicione na lista a nota 8.0 na posição 4: ");
        notas.add(3,8d); // 8d reprensenta 8.0 (double)
        System.out.println(notas);

        // Substituição de item da lista
        System.out.println("\nSubstitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d), 6.0); // Consulta a posição do item 5d(5.0) e substitui por 6.0
        System.out.println(notas);

        // Verificação de existencia de item na lista
        System.err.println("\nConfira se o numero 5.0 esta na lista: " + notas.contains(5d));

        // Informar o valores contidos na lista, de acordo com sua ordem
        System.out.println("\nValores contidos na lista, de acordo com a sua ordem");
        for (Double nota : notas)  System.out.println( + nota);

        // Consultando item em determinada posição
        System.out.println("\nExiba a nota da posição 3: " + notas.get(2)); // contagem do indice inicia em 0
        System.out.println(notas);

        // Exibindo o menor valor da lista
        System.out.println("\nO menor valor da lista: " + Collections.min(notas));

        // Exibindo a maior nota da lista
        System.out.println("\nO maior valor da lista: " + Collections.max(notas));

        // Somando os valores da lista
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("\nSoma dos valores da lista: " + soma);

        // Exibindo a media dos itens
        System.out.println("\nMedia dos valores da lista: " + (soma/notas.size()));

        // Excluindo um item especifico
        // notas.remove(0); se nao incluir o d apos o 0, sera considera o valor do indice
        notas.remove(0d);
        System.err.println("\nRemovendo nota 0.0: " + notas.toString());

        // Excluido um item de acordo com a posição
        notas.remove(0);
        System.out.println("\nRemovendo item da posição 0: " + notas);

        // Remover valores abaixo de um valor especifico
        Iterator<Double> iterator2 = notas.iterator();
        while (iterator2.hasNext()) {
            Double next = iterator2.next();
            if (next < 7) {
                iterator2.remove();
            }
        }
        System.out.println("\nRemovendo os valores abaixo de 7.0: " + notas);

        // Apagando toda a lista
        notas.clear();
        System.out.println("\nRemovendo os itens da lista: " + notas);
        System.out.println("Confirmando a lista vazia: " + notas.isEmpty());



    }
}
