package ejercicios;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		//Creamos las variables del programa
		int num = 0;
		int max = 0;
		int contador = 0;
		int contadorFallo = 0;
		
		//Creamos el escáner del programa
		Scanner sc = new Scanner(System.in);
		
		//Imprimimos el mensaje inicial, pidiendo al usuario que introduzca un número por teclado
		System.out.print("Introduzca un número inicial: ");
		//Leemos y almacenamos el valor introducido en la variable 'max', ya que es el primer y mayor número introducido
		max = sc.nextInt();
		if(max == 0) {
			System.out.print("El número no puede ser 0.");
		}
		else {
			//Creamos un bucle while infinito
			while (true) {
				/*Tras cada iteración, incrementamos el valor del contador en 1. 
				Además, situamos el contador arriba para que cuente el número introducido antes de entrar al bucle while*/
				contador++;
				
				//Pedimos otro número al usuario y lo guardamos en 'num'
				System.out.print("Introduzca otro número: ");
				num = sc.nextInt();
				
				//Si el número introducido es el mismo que el máximo hasta ahora
				if(num == max) {
					System.out.println("Ese número ya es el máximo hasta ahora.");
				}
				//Si el número es 0, salimos del bucle
				else if(num == 0) {
					break;
				}
				//Si el número introducido es mayor al máximo hasta ahora, sustituimos el valor almacenado en 'max'
				else if(num > max) {
					max = num;
				}
				//Si ninguna de estas condiciones se dan, incrementamos el valor de 'contadorFallo' en 1
				else {
					contadorFallo++;
					System.out.println("Fallo, el número es menor al máximo hasta ahora.");
				}
			}
			//Imprimimos los mensajes finales del programa, mostrando los datos recolectados en los contadores
			System.out.println("Total de números introducidos: " + contador);
			System.out.print("Números fallados: " + contadorFallo);
		}
		//Cerramos el escáner
		sc.close();
	}

}

