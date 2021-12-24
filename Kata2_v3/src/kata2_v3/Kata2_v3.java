package Kata2_v3;

import java.util.*;

/**
 * @author Mele13
 * 
 * Tercera versión de Kata2.
 * Crea un histograma a partir de los enteros de un array dado.
 */
public class Kata2_v3 {
   
    /**
     * @param args
     */
    public static void main(String[] args) {  
    
        int[] data = new int[]{16, 15, 13, 15, 15, 10, 9, 10, 7, 9, 13, 15, 10, 9, 7};
        Histogram_v3 histo = new Histogram_v3(data);
        Map<Integer,Integer> histogr = histo.getHistogram();

        for (Map.Entry<Integer,Integer> entry : histogr.entrySet()) {
            System.out.println(entry.getKey() + " ==> " + histogr.get(entry.getKey()));
        }         
    }    
}