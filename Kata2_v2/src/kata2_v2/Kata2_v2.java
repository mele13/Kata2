package Kata2_v2;

import java.util.*;

/**
 * @author Mele13
 * 
 * Segunda versión de Kata2.
 * Crea un histograma a partir de los enteros de un array dado.
 */
public class Kata2_v2 {
    
    /**
     * @param args
     */
    public static void main(String[] args) {        
        int[] data = new int[]{16, 15, 13, 15, 15, 10, 9, 10, 7, 9, 13, 15, 10, 9, 7};
        //Mapa instanciado con clave y valor enteros
        Map<Integer, Integer> histogram = new HashMap<>(); 
        
        //Recorremos 'data'
        for(int key: data) {
            histogram.put(key, histogram.containsKey(key) ? histogram.get(key) 
                    + 1 : 1);
        }        
        
        for (Map.Entry<Integer,Integer> entry : histogram.entrySet()) {
            System.out.println(entry.getKey() + " ==> " + histogram.get(entry.getKey()));
        } 
    }    
}