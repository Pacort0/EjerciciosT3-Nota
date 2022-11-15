package ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		//Creamos las variables del programa
		int num;
		int inverso = 0;
		int aux;
		int cifra = 0;
		
		//Creamos el escáner del programa
		Scanner sc = new Scanner (System.in);
		
		//Pedimos al usuario un número entero positivo
		System.out.print("Introduzca un número entero positivo por teclado: ");
		//Leemos y almacenamos el número en la variable 'num'
		num = sc.nextInt();
		
		//Si el número introducido es menor que 0, el programa se cierra
		if(num < 0) {
			System.out.print("El número no es válido.");
		}
		//Si el número es menor que 10, es capicúa
		else if (num < 10) {
			System.out.print("El número introducido es capicúa.");
		}
		//Si el número no es menor que 0 ni menor que 10
		else {
			//El valor de 'num' se guarda en 'aux'
			aux = num;
			//Creamos un bucle while que se repetirá mientras 'aux' sea diferente de 0
			while(aux != 0){
				//El resto de 'aux' entre 10 se guarda en 'cifra', este resto es la última cifra del número introducido
				cifra = aux % 10;
				//Cambiamos el valor de la variable 'aux' para que sea acorde a las cifras que le hemos quitado
				aux /= 10;
				/*El número inverso es igual a él mismo multiplicado por 10 y sumada la cifra que acabamos de obtener
				 Está inicializado a 0 para que la primera suma sea 0 + cifra y nos dé una unidad*/
				inverso = (inverso * 10) + cifra;
			}
			//Si al salir del bucle el número inverso es igual al número original, el número es capicúa
			if(inverso == num) {
				System.out.print("El número introducido es capicúa.");
			}
			//Si no, no es capicúa
			else {
				System.out.print("El número introducido no es capicúa.");
			}
		}
		//Cerramos el escáner
		sc.close();
	}

}
