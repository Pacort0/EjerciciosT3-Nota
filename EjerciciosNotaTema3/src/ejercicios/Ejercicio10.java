package ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		//Creamos las
		int num;
		int inverso = 0;
		int aux = 1;
		int cifra = 0;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Introduzca un número entero por teclado: ");
		num = sc.nextInt();
		if(num < 0) {
			System.out.print("El número no es válido.");
		}
		else if (num < 10) {
			System.out.print("El número introducido es capicúa.");
		}
		else {
			aux = num;
			while(aux != 0){
				cifra = aux % 10;
				aux /= 10;
				inverso = (inverso * 10) + cifra;
			}
			if(inverso == num) {
				System.out.print("El número introducido es capicúa.");
			}
			else {
				System.out.print("El número introducido no es capicúa.");
			}
		}
		sc.close();
	}

}
