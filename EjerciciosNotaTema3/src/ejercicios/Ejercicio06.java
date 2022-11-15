package ejercicios;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		//Creamos las variables del programa
		int num;
		
		//Creamos el escáner del programa
		Scanner sc = new Scanner (System.in);
		
		//Imprimimos el primer mensaje del programa, pidiéndole al usuario un número entre 0 y 20
		System.out.print("Dime un número entre 0 y 20: ");
		//Guardamos el valor en la variable asignada
		num = sc.nextInt();
		
		//Si el número no está dentro del intervalo permitido, mostramos un mensaje de error
		if(num > 20 || num < 0) {
			System.out.print("Ese número se sale del rango. Inténtelo de nuevo.");
		}
			else {
			/* Creamos un primer bucle for que servirá como contador para el bucle for interno e imprimirá saltos de línea antes de cada iteración
			 * Para ello, creamos una variable contador 'i' y la inicializamos a 1
			 * El bucle se repetirá mientras el valor de 'i' sea menor o igual al número introducido por el usuario
			 * Tras cada iteración, el valor de 'i' aumentará en 1
			 */
			for(int i = 1; i<=num; i++) {
				/* Creamos un segundo bucle for anidado dentro del primero, que va a imprimir los valores necesarios por pantalla
				 * Para ello, creamos una variable contador 'j' y la inicializamos a 1 (valor mínimo)
				 * El bucle se repetirá mientras el valor de 'j' sea menor o igual al valor de 'i'
				 * Tras cada iteración, el valor de 'j' aumentará en 1
				 */
				for(int j = 1; j <= i; j++) {
					//Imprimimos el valor actual de 'i'
					System.out.print(i);
				}
				//Imprimimos un salto de línea
				System.out.println("");
			}
		}
		//Cerramos el escáner
		sc.close();
	}

}
