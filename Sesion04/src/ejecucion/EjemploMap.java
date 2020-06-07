package ejecucion;

import java.util.*;

public class EjemploMap {
	public static void main(String[] args) {
		HashMap<Integer, String> m=new HashMap<Integer, String>();

		m.put(1, "Manzana"); 
        m.put(2, "Pera"); 
        m.put(3, "Uva"); 
        m.put(4, "Cereza"); 
        m.put(5, "Banano"); 
        m.put(6, "Naranja"); 
        m.put(7, "Pera");  //Registro duplicado...
        m.put(8, "Mango");
		
        System.out.println(m);
        
        if( m.containsKey(7)) {System.out.println("La clave 7 corresponde a: " + m.get(7));}
        
        m.remove(7);
        System.out.println(m);
        
        if( !m.containsKey(7)) {System.out.println("El objeto no contiene una elemento con clave 7!");}
        

      
	}
}
