package ejercicios;

import java.util.Scanner;

public class Ejercicio05 {
	public static void main(String [] args) {
		//Creamos las variables del programa
		int num1, num2, mayor, mcm = 0;
		
		//Creamos el escáner del programa
		Scanner sc = new Scanner (System.in);
		
		//Imprimimos los mensajes iniciales del programa y pedimos al usuario que introduzca dos números
		System.out.print("Introduzca el primer número: ");
		//Guardamos el primer número en la variable 'num1'
		num1 = sc.nextInt();
		System.out.print("Introduzca el segundo número: ");
		//Guardamos el segundo número en la variable 'num2'
		num2 = sc.nextInt();
		
		//Si los dos números son iguales, se imprime un mensaje de error y se acaba el programa
		if(num1 == num2) {
			System.out.print("Los números no pueden ser iguales.");
		}
		else {
			//Si num1 es mayor que num2
			if(num1 > num2) {
				//Guardamos una copia del valor de num1 en 'mayor'
				mayor = num1;
			}
			else {
				//Guardamos una copia del valor de num2 en 'mayor'
				mayor = num2;
			}
			/* Creamos un bucle for para recorrer todos los números desde el mayor de ambos hasta el producto de ambos números
			 * Para ello, creamos e inicializamos una variable contador 'i' con valor 'mayor'
			 * El bucle se repetirá mientras el valor de 'i' sea menor que el producto de ambos números (mcm asegurado)
			 * Tras cada iteración, el valor de 'i' aumentará en 1
			 */
			for(int i = mayor; i <= (num1*num2); i++) {
				//Si el resto de 'i' entre ambos números es = 0
				if (i % num1 == 0 && i % num2 == 0) {
					//El mcm es igual al valor de 'i'
					mcm = i;
					//Salimos del bucle for
					break;
				}
			}
			//Imprimimos el mensaje final, mostrando el valor del mcm
			System.out.print("El mínimo común múltiplo es " + mcm);
			//Cerramos el escáner
			sc.close();
		}
	}
	
}
