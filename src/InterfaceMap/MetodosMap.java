package InterfaceMap;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class MetodosMap {
    public static void main(String[] args) {
         

        System.out.println("\nCrie um dicionario que relacione os modelos de carros e seus respectivos consumos");

        Map<String, Double> carrosPopulares = new HashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};

        System.out.println(carrosPopulares);

        // Substituindo um valor especifico
        System.out.println("\nSubstitua o consumo do gol por 15,2 km/l");

        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares);

        // Consultando se uma key existe no dicionario
        System.out.println("\nConsulte se o modelo tucson esta no dicionario: " + carrosPopulares.containsKey("tucson"));

        // Consultando um value pela key
        System.out.println("\nExiba o consumo do uno: " + carrosPopulares.get("uno"));

        // Consultando um item pela ordem de adicao
        // Não existe metodo para realizar esta consulta

        // Exibindo todas as keys
        System.out.println("\nExiba todos os modelos: ");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);
        //System.out.println(carrosPopulares.keySet());

        // Exibindo todos os values
        System.out.println("\nExiba o consumo de todos os carros: ");
        Collection<Double> consumo = carrosPopulares.values();
        //System.out.println(consumo);
        System.out.println(carrosPopulares.values());

        // Exibindo o maior value do dicionario
        System.out.println("\nExiba o modelo mais economico e seu consumo: ");
        Double melhorConsumo = Collections.max(carrosPopulares.values());
        Set<Entry<String, Double>> entrySet = carrosPopulares.entrySet();
        String modeloMaisEconomico = "";

        for (Entry<String,Double> entry : entrySet) {
            if (entry.getValue().equals(melhorConsumo)) {
                modeloMaisEconomico = entry.getKey();
            }
        }

        System.out.println("Modelo mais economico: " + modeloMaisEconomico + " Consumo: " + melhorConsumo);

        // Exiba o modelo menos economico e seu consumo
        System.out.println("\nExiba o modelo com pior consumo e seu consumo: ");
        Double piorConsumo = Collections.min(carrosPopulares.values());
        String modelosMenosEconomico = "";

        for (Entry<String,Double> entry : entrySet) {
            if (entry.getValue().equals(piorConsumo)) {
                modelosMenosEconomico = entry.getKey();
                System.out.println("Modelo com pior consumo: " + modelosMenosEconomico + " - " + piorConsumo);
            }
        }

        //Exiba a soma dos consumos
        System.out.println("\nExiba a soma do consumo dos modelos: ");
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;

        while (iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println("Soma do consumo dos modelos: " + soma);

        // Exibindo a media do consumo dos modelos
        System.out.println("\nExiba a media do consumo: " + soma/(carrosPopulares.size()));

        // Removendo item pelo value
        System.out.println("\nRemova os veiculos com consumo igual a 15,6 km/l");
        Iterator<Double> iterator2 = carrosPopulares.values().iterator();
        while (iterator2.hasNext()) {
            if (iterator2.next().equals(15.6)) {
                iterator2.remove();
            }
        }
        System.out.println(carrosPopulares);

        //Exibir todos os modelos na ordem de cadastro;
        System.out.println("\nExiba os modelos na ordem de cadastro");
        Map<String, Double> carrosPopulares2 = new LinkedHashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares2.toString());

        // Exiba o dicionario ordenado pelo modelo
        System.out.println("\nExiba os itens do dicionario ordenado pelo modelo");
        Map<String, Double> carrosPopulares3 = new TreeMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares3.toString());
        
        // Apague o dicionario
        System.out.println("\nApague o dicionario de carros");
        carrosPopulares.clear();
    
        // Confirme que o dicionario esta vazio
        System.out.println("\nO dicionario esta vazio: " + carrosPopulares.isEmpty());
        System.out.println(carrosPopulares);
    }
}
