/*
List a = new ArrayList();
List b = new LinkedList();
List c = new Vector(); 
List d = new Stack(); 
*/
package ejecucion;

import java.util.*;

public class EjemploList {
	public static void main(String[] args) 
    { 
		List<String> l = new ArrayList<String>(); 
        System.out.println("...........................................");
        System.out.println("Lista 1");
        System.out.println("-------------------------------------------");
        System.out.println("Elementos de la lista: " + l.size());
        if(l.isEmpty()) {
        	System.out.println("La lista est� vac�a!!!");
        }
        //Agregando elementos a la lista...
        l.add("Manzana"); 
        l.add("Pera"); 
        l.add("Uva"); 
        l.add("Cereza"); 
        l.add("Banano"); 
        l.add("Naranja"); 
        l.add("Pera");  //Registro duplicado...
        l.add("Mango");
        System.out.println("Elementos de la lista: " + l.size()); //Comprobando cantidad de elementos de la lista...
        System.out.println(l); 
        
  
        // Using indexOf() and lastIndexOf() 
        System.out.println("Primera Ubicaci�n de Pera: " + l.indexOf("Pera")); 
        System.out.println("�ltima Ubicaci�n de Pera: " + l.lastIndexOf("Pera")); 
        System.out.println("Ubicaci�n de elemento 'Ballena', no incluido en la lista: " + l.indexOf("Ballena")); 
        
        if(l.contains("Banano")) {
        	System.out.println("Ubicaci�n de Banano: " + l.indexOf("Banano")); 
        }
        
        //////////
        System.out.println("...........................................");
        System.out.println("Lista 2");
        System.out.println("-------------------------------------------");
        List<String> l2 = new ArrayList<>(); 
        //Agregando elementos a la lista...
        l2.add("Perro"); 
        l2.add("Delf�n"); 
        l2.add("Loro"); 
        l2.add("Ballena"); 
        System.out.println(l2);  //Imprimiendo lista completa...
        System.out.println(l2.get(2));  //Obteniendo el elemento de la posici�n 2
        l2.remove(2); //Eliminando elemento de la posici�n 2
        System.out.println(l2); //Imprimiendo lista completa (No debe salir el elemento de la posici�n 2)
        l2.add(2, "Loro"); //Agregando elemento a la posici�n 2
        System.out.println(l2); //Imprimiendo lista completa (Debe mostrarse nuevamente el elemento que estaba en la posici�n 2)
        
        //////////
        System.out.println("...........................................");
        System.out.println("Lista 3");
        System.out.println("-------------------------------------------");
        List<String> l3 = new ArrayList<String>(); //Va a almacenar un rango de la lista l
        l3 = l.subList(1, 7); 
        
        System.out.println(l3); 
        System.out.println("Reemplazando el elemento 5...");
        l3.set(5, "Mel�n");
        System.out.println(l3); 
        System.out.println("Limpiando lista...");
        l3.clear();
        System.out.println(l3); 
        
    } 
}
