package Kata2_v1;

import java.util.*;

/**
 * @author Mele13
 * 
 * Primera versión de Kata2.
 * Crea un histograma a partir de los enteros de un array dado.
 */
public class Kata2_v1 {
    
    /**
     * @param args
     */
    public static void main(String[] args) {        
        int[] data = new int[]{16, 15, 13, 15, 15, 10, 9, 10, 7, 9, 13, 15, 10, 9, 7};
        //Mapa instanciado con clave y valor enteros
        Map<Integer, Integer> histogram = new HashMap<>(); 
        
        //Recorremos 'data', guardamos si histograma contiene una clave data[i]
        for (int i = 0; i < data.length; i++) {
            if (histogram.containsKey(data[i])) {
                histogram.put(data[i], histogram.get(data[i]) + 1);
            } else histogram.put(data[i], 1);
        }
        
        //Método 1 - si se necesita en cada iteración las claves y los valores del mapa
        for (Map.Entry<Integer,Integer> entry : histogram.entrySet()) {
            System.out.println(entry.getKey() + " ==> " + histogram.get(entry.getKey()));
        } 
        //-------Fin método 1-------
        
//        //Método 2 - solo si se necesita claves o valores del mapa
//        for(Integer key: histogram.keySet()) { //Iterar solo sobre claves
//            System.out.println("Key = " + key);
//        }
//        
//        for(Integer value: histogram.values()) {//Iterar solo sobre valores
//            System.out.println("Value = " + value);
//        }        
//        //-------Fin método 2-------
//        
//        /** Método 3 - única forma de iterar sobre un mapa en versiones anteriores
//         * de java. Único método que permite eliminar entradas del mapa durante 
//         * la iteración (iterator.remove()). 
//         * Dos opciones: con Generics y sin Generics.
//         */
//        
//        //Con Generics
//        Iterator<Map.Entry<Integer, Integer>> entries = histogram.entrySet().iterator();
//        while (entries.hasNext()) {
//            Map.Entry<Integer, Integer> entry = entries.next();
//            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
//        }
//        
//        //Sin Generics
//        Map map = new HashMap();
//        Iterator entries = histogram.entrySet().iterator();
//        while (entries.hasNext()) {
//            Map.Entry entry = (Map.Entry) entries.next();
//            Integer key = (Integer)entry.getKey();
//            Integer value = (Integer)entry.getValue();
//            System.out.println("Key = " + key + ", Value = " + value);
//        }        
//        //-------Fin método 3-------
//        
//        
//        //Método 4 - iteración sobre claves y búsqueda de valores (ineficaz)        
//        for (Integer key : histogram.keySet()) {
//            Integer value = histogram.get(key);
//            System.out.println("Key = " + key + ", Value = " + value);
//        } 
//        //-------Fin método 4-------
    }    
}