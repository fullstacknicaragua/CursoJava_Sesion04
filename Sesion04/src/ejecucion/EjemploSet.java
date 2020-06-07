/*
HashSet
LinkedHashSet
TreeSet
 */

package ejecucion;

import java.util.*;

public class EjemploSet {
	public static void main(String[] args) 
	{ 
		Set<String> s = new HashSet<String>(); 
		s.add("Manzana"); 
		s.add("Pera"); 
		s.add("Uva"); 
		s.add("Cereza"); 
		s.add("Banano"); 
		s.add("Naranja"); 
		s.add("Pera");  //Registro duplicado...
		s.add("Mango");
		System.out.println("Imprimiendo contenido de HashSet...");
		System.out.println("Cantidad de elementos: " +s.size() + " : " + s); 

		System.out.println("Utilizando TreeSet..."); 
		Set<String> t = new TreeSet<String>(s); 
		System.out.println("Cantidad de elementos: " +t.size() + " : " + t); 
		
		System.out.println("*********"); 
		System.out.println("Segundo Set"); 
		Set<String> s2 = new HashSet<String>(); 
		s2.add("Perro"); 
		s2.add("Manzana"); 
		s2.add("Delfín"); 
		s2.add("Cereza"); 
		s2.add("Loro"); 
		System.out.println("Cantidad de elementos: " +s2.size() + " : " + s2); 
		
		System.out.println("*********"); 
		System.out.println("La Unión"); 
		Set<String> laUnion = new HashSet<String>(s); 
		laUnion.addAll(s2);
		System.out.println(laUnion); 
		
		System.out.println("*********"); 
		System.out.println("Lo Común"); 
		Set<String> loComun = new HashSet<String>(s);  
		loComun.retainAll(s2);
		System.out.println(loComun); 
		
		System.out.println("*********"); 
		System.out.println("Lo Distinto 1"); 
		Set<String> loDistinto1 = new HashSet<String>(s); 
		loDistinto1.removeAll(s2);
		System.out.println(loDistinto1); 
		
		System.out.println("*********"); 
		System.out.println("Lo Distinto 2"); 
		Set<String> loDistinto2 = new HashSet<String>(s2); 
		loDistinto2.removeAll(s);
		System.out.println(loDistinto2); 
	}
}
