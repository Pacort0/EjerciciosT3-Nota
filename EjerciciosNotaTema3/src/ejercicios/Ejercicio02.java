package ejercicios;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		//Creamos la variable 'num', en la que guardaremos el número introducido por el usuario
		int num;
		//Creamos la variable 'contador', que contará todos los números primos existentes entre 1 y 'num'
		int contador = 0;
		//Creamos la variable 'candidato', para guardar el resultado del resto de la división entre i y j más tarde
		int candidato;
		//Creamos la variable booleana 'primo', que determinará si el número es primo o no
		Boolean primo;
		
		//Creamos el escáner del programa
		Scanner sc = new Scanner (System.in);
		//Imprimimos el mensaje inicial del programa y esperamos a la introducción de datos por teclado.
		System.out.print("Introduzca un número entero positivo: ");
		//Guardamos el valor introducido en la variable designada
		num = sc.nextInt();
		
		if(num <= 0) {
			System.out.print("El número introducido es incorrecto");
		}
		else if(num == 1) {
			System.out.print("El 1 no es un número primo");
		}
		else {
			/* Creamos el primer bucle for del programa
			 * Este bucle recorrerá todos los números entre 1 y el número introducido por el usuario
			 * Para ello, creamos una variable contador 'i' a la que le asignamos como valor inicial 'num'
			 * El bucle se repetirá mientras el valor de 'i' sea mayor que 1
			 * Tras cada vuelta, el valor de 'i' disminuirá en 1
			 */
			for (int i = num; i > 1; i--) {
				//Tras cada vuelta, se 'resetea' el valor de la variable primo a 'true'
				primo = true;
				
				/* Creamos el segundo bucle for del programa.
				 * Este bucle recorrerá todos los números por los que es divisible cada número 'i' en cada vuelta del 1 hasta num.
				 * Por ejemplo, si 'i' vale 10, compruebará las divisiones de todos los números del 2 al 9 para determinar si es primo
				 * Para ello, creamos el bucle DENTRO del bucle for anterior, creamos una variable contador 'j' y le damos 
				 * el valor de 'i - 1'(para que no se divida por sí mismo y dé 0 en todos los casos)
				 * El bucle se repetirá mientras 'j' sea mayor o igual que 2
				 * Tras cada vuelta, el valor de 'j' disminuirá en 1
				 */
				for(int j = i - 1; j >= 2; j--) {
					//Calculamos el valor del resto de 'i' entre 'j' y lo guardamos en 'candidato'
					candidato = i%j;
					//Si el valor de algún resto es 0, el número NO PUEDE SER PRIMO
					if(candidato == 0) {
						primo = false;
						//Como el número no puede ser primo, no hace falta seguir comprobando, así que cortamos la iteración
						break;
					}
				}
				//Si al salir del bucle interno el valor de primo no ha cambiado, es porque ES PRIMO
				if(primo != false) {
					//Incrementamos el valor el contador en 1
					contador++;
					//Imprimimos que el número en cuestión es primo
					System.out.println(i + " es primo.");
				}
			}
			//Imprimimos el mensaje final del programa, con todos los datos pertinentes
			System.out.print("Existen " + contador + " números primos entre 1 y " + num);
		}
		//Cerramos el escáner
		sc.close();
	}

}

