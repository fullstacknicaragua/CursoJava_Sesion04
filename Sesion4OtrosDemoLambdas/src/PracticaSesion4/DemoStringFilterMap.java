package PracticaSesion4;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class DemoStringFilterMap {

	public static void main(String[] args) {

		Map<Integer, Persona> personas = new HashMap<>();
		personas.put(1, new Persona("Ana", "López", "F", 1.70, 65.00));
		personas.put(2, new Persona("Jesús", "Pérez", "M", 1.68, 67.00));
		personas.put(3, new Persona("Miguel", "Castillo", "M", 1.75, 73.50));
		personas.put(4, new Persona("Simón", "Cruz", "M", 1.68, 82.70));
		personas.put(5, new Persona("Luisa", "López", "F", 1.69, 66.70));
		personas.put(6, new Persona("Antonio", "Padilla", "M", 1.78, 87.90));
		personas.put(7, new Persona("Alicia", "Alonso", "F", 1.85, 96.80));
		personas.put(8, new Persona("Ángel", "López", "M", 1.77, 83.20));
		personas.put(9, new Persona("Alberto", "Lugo", "M", 1.91, 99.50));
		personas.put(10, new Persona("Maria", "Alonso", "F", 1.82, 79.80));
		
		System.out.println("PERSONAS CON ID >= 5");
		personas.entrySet()
			.stream()
			.filter(map -> map.getKey() >= 5)
			.collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue()))
			.forEach((key, value) -> System.out.printf("%d: %s%n", key, value.getNombre()));
		System.out.println("");

	}
	
}
