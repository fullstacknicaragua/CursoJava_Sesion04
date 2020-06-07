package PracticaSesion4;

import java.util.Arrays;
import java.util.List;

public class Index {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		List<String> departamentos = Arrays.asList("Chinandega"
												  ,"León"
												  ,"Managua"
												  ,"Masaya"
												  ,"Granada"
												  ,"León"
												  ,"Managua"
												  ,"Rivas"
												  ,"Matagalpa"
												  ,"Estelí"
												  ,"Jinotega"
												  ,"Madriz"
												  ,"Nueva Segovia"
												  ,"Boaco"
												  ,"Carazo"
												  ,"Chontales"
												  ,"Rio San Juan"
												  ,"RAAM"
												  ,"RAAS");
		
		
		// TRADICIONAL 
		for(String d : departamentos) { //Nueva notación para imprimir arrays.
			System.out.println(d);
		}
		
		//// Tratarlo como un stream y poder usar metodos de manera concatenados
		
		departamentos
					.stream() 
					.map(String::toUpperCase)
					.forEach(a -> System.out.println(a));
		
		// Limitar el número de datos retornados
		departamentos
		.stream()
		.limit(10)
		.forEach(System.out::println);
		
		// Distintos
		
		  departamentos 
						  .stream() 
						  .map((s) -> String.format("%s (%d caracteres)",s,s.length())) 
						  //.filter(s -> s.endsWith("S") && s.startsWith("R")) 
						  //.distinct() 
						  .sorted()
						 // .skip()
						  //.limit(5)
						  .forEach(System.out::println);
		 				
			
		
		  departamentos.stream() .map((s) -> String.format("%s (%d caracteres)", s,
		  s.length())) .distinct() .forEach(System.out::println);
		 
	}

}