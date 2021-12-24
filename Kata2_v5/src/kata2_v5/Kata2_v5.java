package Kata2_v5;

import java.util.*;

/**
 * @author Mele13
 * 
 * Quinta versión de Kata2.
 * Crea un histograma a partir de los enteros de un array dado.
 */
public class Kata2_v5 {
   
    /**
     * @param args
     */
    public static void main(String[] args) {  
    
        String[] data = new String[]{"Rosa", "Pepe", "María", "Pepe", "Pepe", "Rosa"};
        Histogram_v5 histo = new Histogram_v5(data);
        Map<String, Integer> histogr = histo.getHistogram();

        for (Map.Entry<String, Integer> entry : histogr.entrySet()) {
            System.out.println(entry.getKey() + " ==> " + histogr.get(entry.getKey()));
        }        
    }    
}