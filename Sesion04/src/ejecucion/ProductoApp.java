package ejecucion;

import java.util.Scanner;
import clases.Producto;


public class ProductoApp {
	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		Producto p = new Producto();
		
		int cantidad=0;
		short opcion=0;

		System.out.print("Digite el código del producto: ");
		p.setCodigo(entrada.next());
		System.out.print("Digite la descripción del producto: ");
		p.setDescripcion(entrada.next());
		System.out.print("Digite la existencia actual: ");
		p.setExistencia(entrada.nextInt());
		System.out.print("Seleccione una opción: 1 Comprar 2 Vender: ");
		opcion=entrada.nextShort();
		if (opcion==1) {
			System.out.print("Digite la cantidad de productos a comprar: ");
			cantidad=entrada.nextInt();
			System.out.println("El producto " + p.getDescripcion() + ", código " + p.getCodigoProducto() + " tiene " + p.aumentarInventario(cantidad) + " existencias en inventario.");
		}
		else if (opcion==2) {
			System.out.print("Digite la cantidad de productos a vender: ");
			cantidad=entrada.nextInt();
			System.out.println("El producto " + p.getDescripcion() + ", código " + p.getCodigoProducto() + " tiene " + p.disminuirInventario(cantidad) + " existencias en inventario.");
		}
		else System.out.println("No ha seleccionado ninguna opción.");
		
		entrada.close();
		
		System.out.println("----------------------------------------------");
		System.out.print("Fin de la aplicación.");	
	}
}