package Kata2_v4;

import java.util.*;

/**
 * @author Mele13
 * 
 * Cuarta versión de Kata2.
 * Crea un histograma a partir de los enteros de un array dado.
 */
public class Kata2_v4 {
   
    /**
     * @param args
     */
    public static void main(String[] args) {  
    
        Integer[] data = new Integer[]{16, 15, 13, 15, 15, 10, 9, 10, 7, 9, 13, 15, 10, 9, 7};
        Histogram_v4 histo = new Histogram_v4(data);
        Map<Integer,Integer> histogr = histo.getHistogram();

        for (Map.Entry<Integer,Integer> entry : histogr.entrySet()) {
            System.out.println(entry.getKey() + " ==> " + histogr.get(entry.getKey()));
        }        
    }    
}