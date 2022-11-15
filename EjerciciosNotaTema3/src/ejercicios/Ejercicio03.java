package ejercicios;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		//Creamos las variables del programa
		int num;
		
		//Creamos el escáner del programa
		Scanner sc = new Scanner (System.in);
		
		//Imprimimos el mensaje inicial, pidiendo al usuario un valor que sirva como lado para el triángulo y lo guardamos en la variable 'num'
		System.out.print("Introduzca un lado del triángulo equilátero: ");
		num = sc.nextInt();
		
		if(num <= 0) {
			System.out.print("No se puede hacer un triángulo con esa medida como lado");
		}
		else {
			/* Creamos un primer bucle for que va a recorrer todos los valores del 1 hasta el introducido por el usuario
			 * Para ello, creamos una variable contador 'i' inicializada a 1
			 * El bucle se repetirá mientras 'i' sea menor o igual al valor introducido por el usuario
			 * Tras cada vuelta, aumentamos el valor de 'i' en 1
			 */
			for(int i = 1; i <= num; i++) {
				/* Creamos un segundo bucle for anidado dentro del primero que va a imprimir todos los espacios necesarios a la izquierda de los '*'
				 * Para ello, creamos una variable contador 'i' inicializada a 1
				 * El bucle se repetirá mientras el valor del contador sea menor o igual a 'num'
				 * Tras cada vuelta, incrementamos el valor de 'j' en 1
				 */
				for(int j = i; j <= num; j++) {
					//Imprimimos un espacio
					System.out.print(" ");
				}
				/* Creamos otro bucle for anidado dentro del primero, pero ajeno al segundo. Nos servirá para imprimir los '*'
				 * Para ello, creamos una variable contador 'k' con valor igual a 'i'
				 * El bucle se repetirá mientras el valor de 'k' sea mayor que 0
				 * Tras cada vuelta, el valor de 'k' decrementará en 1
				 */
				for(int k = i ; k > 0; k--) {
					//Imprimimos un asterisco con un espacio (sin el espacio no sale)
					System.out.print("* ");
				}
				//Antes de volver al primer bucle imprimimos un salto de línea
				System.out.println();
			}
		}
		//Cerramos el escáner
		sc.close();
	}

}
