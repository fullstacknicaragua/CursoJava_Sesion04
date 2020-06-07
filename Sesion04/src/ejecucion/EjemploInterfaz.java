package ejecucion;

import java.util.Scanner;
import clases.*;

public class EjemploInterfaz {
	public static void main(String[] args) {
		int seleccion=0;
		Scanner entrada;
		entrada=new Scanner(System.in);

		try {
			System.out.print("Escoja un animal: 1. Perro 2. Delfin 3. Loro.");
			seleccion=entrada.nextInt();
			switch (seleccion) {
			case 1:
				Perro p=new Perro();
				System.out.println("El perro tiene las siguiente características: ");
				p.comunicar();
				p.trasladar();
				p.alimentar();
				break;
			case 2:
				Delfin d=new Delfin();
				System.out.println("El delfín tiene las siguiente características: ");
				d.comunicar();
				d.trasladar();
				d.alimentar();	
				break;
			case 3:	
				Loro l=new Loro();
				System.out.println("El loro tiene las siguiente características: ");
				l.comunicar();
				l.trasladar();
				l.alimentar();
				break;
			default:
				System.out.println("No ha seleccionado ninguna opción.");
			}	
		}
		catch(Exception e) {
			System.out.println("Ha sucedido el siguiente error: " + e);
		}
		finally {
			entrada.close();
			System.out.println("----------------------------------");
			System.out.print("Programa Finalizado...");
		}	
	}
}