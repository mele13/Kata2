package Kata2_v5;

import java.util.*;

public class Histogram_v5<T> {
    
    private final T[] data;
    
    /**
     * Constructor que recibe un array como parámetro llamado data.
     * 
     * @param data array de valores
     */    
    public Histogram_v5(T[] data) {
        this.data = data;
    }
    
    /**
     * Método que devuelve un array de valores.
     * 
     * @return array de valores
     */
    public T[] getData() {
        return data;
    }
    
    /**
     * Método que devuelve un mapa con clave y valor enteros. Este mapa no 
     * tiene parámetros.
     * 
     * @return mapa con claves y valores
     */
    public Map<T, Integer> getHistogram() {
        Map<T, Integer> histogram = new HashMap<>();
        
        //Recorremos los valores de 'data'
        for(T key: data) {
            histogram.put(key, histogram.containsKey(key) ? histogram.get(key) + 1 : 1);
        }
        
        return histogram;       
    }    
}