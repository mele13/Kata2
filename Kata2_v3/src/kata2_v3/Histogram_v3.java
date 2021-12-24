package Kata2_v3;

import java.util.*;

public class Histogram_v3 {
    
    private final int[] data;
    
    /**
     * Constructor que recibe un array como parámetro llamado data.
     * 
     * @param data array de valores
     */    
    public Histogram_v3(int[] data) {
        this.data = data;
    }
    
    /**
     * Método que devuelve un array de valores.
     * 
     * @return array de valores
     */
    public int[] getData() {
        return data;
    }
    
    /**
     * Método que devuelve un mapa con clave y valor enteros. Este mapa no 
     * tiene parámetros.
     * 
     * @return mapa con claves y valores
     */
    public Map<Integer, Integer> getHistogram() {
        Map<Integer, Integer> histogram = new HashMap<>();
        
        //Recorremos los valores de 'data'
        for(int key: data) {
            histogram.put(key, histogram.containsKey(key) ? histogram.get(key) + 1 : 1);
        }
        
        return histogram;       
    }    
}