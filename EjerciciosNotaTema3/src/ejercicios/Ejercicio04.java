package ejercicios;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		//Creamos las variables del programa
		int a, b;
		int mcd = 0;
		int menor = 0;
		
		//Creamos el escáner del programa
		Scanner sc = new Scanner(System.in);
		
		//Imprimimos los mensajes iniciales del programa y pedimos al usuario que introduzca dos números
		System.out.print("Introduzca el primer número: ");
		//Guardamos el primer número en la variable 'a'
		a = sc.nextInt();
		System.out.print("Introduzca el segundo número: ");
		//Guardamos el segundo número en la variable 'b'
		b = sc.nextInt();
		if(a < 0 || b < 0) {
			System.out.print("No se pueden introducir números negativos.");
		}
		//Si los dos números son iguales, se imprime un mensaje de error y se acaba el programa
		else if (a == b) {
			System.out.print("Los dos números son iguales.");
		}
		else {
			//Si a es menor que b
			if (a > b){
				//Guardamos en 'menor' el valor de 'b'
				menor = b;
			}
			else {
				//Guardamos en 'menor' el valor de 'a'
				menor = a;
			}
			/* Creamos un bucle for que reecorra todos los números entre el menor de ambos números y 1
			 * Para ello, creamos una variable contador 'i' inicializada a 1
			 * El bucle se repetirá mientras el valor de 'i' sea menor o igual a 1
			 * Tras cada vuelta, decrementamos el valor de 'i' en 1
			 */
			for(int i = menor; i >= 1; i--){
				//Si 'a' y 'b' divididos por el valor actual de 'i' es igual a 0, ese valor es el MCD
				if (a % i == 0 && b % i == 0) {
					//Guardamos el valor de i en la variable mcd
					mcd = i;
					//Como ya hemos encontrado el MCD, salimos del bucle for
					break;
				}
			}
			//Imprimimos el mensaje final con los valores correspondientes
			System.out.print("El Máximo Común Divisor de " + a + " y " + b + " es: " + mcd);
			//Cerramos el escáner
			sc.close();
		}
	}
}
