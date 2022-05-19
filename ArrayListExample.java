/**
 * @(#)ArrayListExample.java
 *
 * ArrayListExample application
 *
 * @author 
 * @version 1.00 2021/4/29
 */


/**
 * hola
 *hola
 * 
 */
import java.util.ArrayList;

public class ArrayListExample {
    
    public static void main(String[] args) {
    	
    	// TODO, add your application code
    	System.out.println("Hello World! Array list");
    	System.out.println("Programa para manejo de la clase ArrayList");

    	ArrayList<String> autos = new ArrayList<String>();
    	autos.add("Volvo");
    	autos.add("BMW");
    	autos.add("Ford");
    	autos.add("Mazda");
    	System.out.println(autos);
    	System.out.println("Elemento 2: " + autos.get(2));
    	
    	ArrayList<Integer> numeros = new ArrayList<Integer>();
    	numeros.add(1);
    	numeros.add(3);
    	numeros.add(2);
    	numeros.add(5);
    	numeros.add(4);
    	System.out.println(numeros);
    	System.out.println("Tamaño de lista de números: " + numeros.size());
    	numeros.remove(2);
    	System.out.println(numeros);
    	System.out.println("Tamaño de lista de números: " + numeros.size());
    }
}
