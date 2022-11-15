package ejercicios;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		//Creamos las variables del programa
		int num;
		int contador = 0;
		
		//Creamos el escáner del programa
		Scanner sc = new Scanner (System.in);
		
		//Le pedimos al usuario un número entero mayor que 0
		System.out.print("Introduzca un número entero positivo (mayor que 0): ");
		//Almacenamos el valor en la variable 'num'
		num = sc.nextInt();
		
		//Si el número es menor o igual a 0, se acaba el programa
		if(num <= 0) {
			System.out.print("El número introducido no debe ser menor o igual a 0.");
		}
		else {
			//Creamos un bucle while que se repetirá mientras el número introducido sea mayor a 0
			while(num > 0) {
				/*Dividimos el número entre 10 y el resultado de guarda en la propia variable 'num'
				Cuando el valor de 'num' sea 0, no quedarán más cifras que contar*/
				num /= 10;
				//Aumentamos el contador de cifras en 1
				contador++;
			}
			//Imprimimos el resultado del número de cifras del número introducido
			System.out.print("El número tiene " + contador + " cifra(s).");
			//Cerramos el escáner
			sc.close();
		}
	}

}

