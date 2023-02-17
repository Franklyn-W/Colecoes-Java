package InterfaceList;

import java.util.ArrayList;
import java.util.List;

public class exercicio1 {
    public static void main(String[] args) {
        /*
        Faça um programa que receba a temperatura media dos 6 primeiros meses do ano e armazene em uma lista.
        Apos isto, calcule a media semestral das temperaturas e mostre todas as temperaturas acima dessa media, e em que mes elas ocorreram.
        Mostrar o mes por extenso: 1 - Janeiro, 2 - Fevereiro
        */


        List<Temperaturas> temperaturas = new ArrayList<>(){{
            add(new Temperaturas(1, "Janeiro", 19.0));
            add(new Temperaturas(2, "Fevereiro", 18.0));
            add(new Temperaturas(3, "Março", 18.0));
            add(new Temperaturas(4, "Abril", 17.0));
            add(new Temperaturas(5, "Maio", 15.0));
            add(new Temperaturas(6, "Junho", 12.0));
        }};

        //Media das temperaturas
        double soma = 0d;
        double mediaTemperaturas;
        for (Temperaturas temperaturas2 : temperaturas) {
            soma += temperaturas2.getTemperatura();
        }
        mediaTemperaturas = soma / temperaturas.size();
        System.out.println("Temperatura media dos ultimos 6 meses > " + mediaTemperaturas + "°C");

        // Meses acima da media de temperatura
        System.out.println("\nTemperatura dos ultuimos 6 meses acima da media");
        for (Temperaturas temperaturas2 : temperaturas) {
            if (temperaturas2.getTemperatura() > mediaTemperaturas) {
                System.out.println(temperaturas2);
            }
        }

    }
    
}

class Temperaturas {
    private int numeroMes;
    private String mes;
    private double temperatura;
    
    public Temperaturas(int numeroMes, String mes, double temperatura) {
        this.numeroMes = numeroMes;
        this.mes = mes;
        this.temperatura = temperatura;
    }

    public int getNumeroMes() {
        return numeroMes;
    }

    public String getMes() {
        return mes;
    }

    public double getTemperatura() {
        return temperatura;
    }

    @Override
    public String toString() {
        return  mes + " > " + temperatura + "°C.";
    }
}
