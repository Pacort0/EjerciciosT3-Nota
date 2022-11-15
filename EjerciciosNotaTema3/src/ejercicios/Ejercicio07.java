package ejercicios;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		//Creamos la variable para leer el valor que el usuario introduzca por teclado
		int num;
		
		//Creamos el escáner del programa
		Scanner sc = new Scanner(System.in);
		
		//Imprimimos el mensaje inicial del programa, pidiendo al usuario que introduzca un valor y almacenándolo en 'num'
		System.out.print("Introduzca un número entero positivo: ");
		num = sc.nextInt();
		
		//Si el número es 0 o negativo, imprimimos un mensaje de error y se acaba el programa
		if(num <= 0) {
			System.out.print("El número debe ser mayor que 0.");
		}
		else{
			/* Creamos un primer bucle for que recorra todos los númerosdesde el 1 hasta el introducido por el usuario
			 * Para ello creamos una variable contador 'i' inicializada a 1
			 * Mientras el valor de 'i' sea menor o igual que el valor introducido por el usuario, el bucle seguirá corriendo
			 * Tras cada vuelta aumentamos el valor de 'i' en uno
			 */
			for(int i = 1; i <= num; i++) {
				/* Creamos un segundo bucle for que imprima todos los números desde 1 hasta el introducido por el usuario
				 * Para ello creamos una variable contador 'j' inicializada a 1
				 * El bucle seguirá dando vueltas mientras el valor de 'j' sea menor o igual al de 'i'
				 * Tras cada vuelta, el valor de 'j' aumenta en 1
				 */
				for(int j = 1; j <= i ; j++) {
					//Imprimimos el valor de 'j'
					System.out.print(j);
				}
				/* Creamos un tercer bucle for, también anidado dentro del primero pero ajeno al segundo.
				 * Este bucle imprimirá todos los números entre 'i-1' y 1
				 * Para ello, creamos una variable contador 'k' y la inicializamos a 'i-1'
				 * El bucle dará vueltas mientras 'k' sea menor o igual a 1
				 * Tras cada vuelta, el valor de 'k' decrementa en 1
				 */
				for(int k = i-1; k >= 1; k--) {
					//Imprimimos el valor de 'k'
					System.out.print(k);
				}
				//Antes de regresar al primer bucle for, saltamos de línea
				System.out.println();
			}
		}
		//Cerramos el escáner
		sc.close();
	}

}
