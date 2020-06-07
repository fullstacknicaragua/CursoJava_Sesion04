package PracticaSesion4;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class DemoStreamFilter {

public static void main(String[] args) {
		
		List<Persona> personas = Arrays.asList(
				new Persona("Ana", "L�pez", "F", 1.70, 65.00),
				new Persona("Jes�s", "P�rez", "M", 1.68, 67.00),
				new Persona("Miguel", "Castillo", "M", 1.75, 73.50),
				new Persona("Sim�n", "Cruz", "M", 1.68, 82.70),
				new Persona("Luisa", "L�pez", "F", 1.69, 66.70),
				new Persona("Antonio", "Padilla", "M", 1.78, 87.90),
				new Persona("Alicia", "Alonso", "F", 1.85, 96.80),
				new Persona("�ngel", "L�pez", "M", 1.77, 83.20),
				new Persona("Alberto", "Lugo", "M", 1.91, 99.50),
				new Persona("Maria", "Alonso", "F", 1.82, 79.80)
				);

				// Obtener todas las personas con altura mayor o igual a 1.70 mts
				System.out.println("PERSONAS QUE SU ALTURA ES MAYOR O IGUAL A 1.70 MTS");
				personas
					.stream()
					.filter(p -> p.getAltura() >= 1.70)
					.map(Persona::getApellido)
					.forEach(System.out::println);
				System.out.println("");
				//*/

				// Obtener todas las personas con altura mayor o igual a 1.80mts y peso menor o igual a 80kg
				System.out.println("PERSONAS CON ALTURA MAYOR A 1.80MTS Y PESO MENOR O IGUAL A 80 KG");
				personas
					.stream()
					.filter(p -> p.getAltura() >= 1.60 && p.getPeso() <= 80)
					.forEach(persona -> System.out.printf("%s (%f altura) (%f peso)%n", persona.getNombre(), persona.getAltura(), persona.getPeso()));
				System.out.println("");

				// Obtener el n�mero de personas que cumplen una condici�n
				long nPersonas = personas
						.stream()
						.filter(p -> p.getApellido() == "L�pez")
						.count();
				System.out.printf("N� PERSONAS QUE TIENEN EL APELLIDO L�PEZ: %d%n", nPersonas);

				// Agrupar las personas que cumplen una condici�n
				System.out.println("PERSONAS QUE NO TENGAN EL APELLIDO ALONSO, AGRUPADOS POR SEXO");
				personas
						.stream()
						.filter(p -> p.getApellido() != "Alonso")
						.collect(Collectors.groupingBy(Persona::getSexo, Collectors.counting()))
						.forEach((sexo, numero) -> System.out.printf("sexo %s: %d personas%n", sexo, numero));

				Predicate<Persona> predicate = (Persona p) -> p.getNombre().toLowerCase().contains("i") && (p.getSexo() == "F" && p.getPeso() <= 90);

				Persona p2 = personas
								.stream()
								.filter(predicate)
								.findAny()
								.orElse(new Persona());

				System.out.println(p2.getNombre());

	}

}
