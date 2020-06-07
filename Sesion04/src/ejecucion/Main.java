//Ejemplo de funciones lambda...
package ejecucion;

import interfaces.OperacionDe2Num;

public class Main {
	public static void main(String[] args) {
		int[] numeros= {1,2,3,4,5,6,7,8,9};
		System.out.println("La suma total es: " + reducir(numeros, (a,b) -> a+b, 0));
		System.out.println("La multiplicación total es: " + reducir(numeros, (a,b) -> a*b, 1));
	}
	static int reducir(int[] numeros, OperacionDe2Num operacion, int inicial) {
		int acumulador=inicial;
		for (int numero:numeros) {
			acumulador=operacion.aplicar(numero, acumulador);
		}

		return acumulador;
	}
}
