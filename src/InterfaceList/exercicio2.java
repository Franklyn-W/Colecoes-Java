package InterfaceList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class exercicio2 {
public static void main(String[] args) {
    /* Utilizando listas, faca um programa que faça 5 perguntas para uma pessoa sobre um crime.
     * As perguntas são:
     * 1. "Telefonou para a vitima?"
     * 2. "Esteve no local do crime?"
     * 3. "Mora perto da vitima?""
     * 4. "Devia para a vitima?"
     * 5. "Ja trabalhou para a vitima?"
     * 
     * Se a pessoa responder positivamente a 2 questoes, ela dever classificada como "Suspeita", entre 3 e 4 como "Cumplice" e 5 como "Assassina". Caso contrario, ela sera classificada como "Inocente".
    */

    int contadorSuspeito = 0;

    Scanner entrada = new Scanner(System.in);

    List<String> perguntas = new ArrayList<>();
    perguntas.add("Telefonou para a vitima? ");
    perguntas.add("Esteve no local do crime? ");
    perguntas.add("Mora perto da vitima? ");
    perguntas.add("Devia para a vitima? ");
    perguntas.add("Ja trabalhou para a vitima? ");

    System.out.println("Responda apenas com sim ou não\n");
    Collections.shuffle(perguntas);
    for (String pergunta : perguntas) {
        System.out.print(pergunta);
        String resposta = entrada.nextLine().toUpperCase();
        if (resposta.equalsIgnoreCase("SIM")) {
            contadorSuspeito += 1;
        }
    }
    if (contadorSuspeito < 2) System.out.println("Inocente");
    if (contadorSuspeito == 2) System.out.println("Suspeito");
    if (contadorSuspeito == 3 | contadorSuspeito == 4) System.out.println("Cumplice");
    if (contadorSuspeito == 5) System.out.println("Assassino");

    entrada.close();
}
    
}