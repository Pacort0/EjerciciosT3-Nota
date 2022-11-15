package ejercicios;

import java.util.Scanner;

public class Ejercicio01 {
		public static void main(String[] args) {
			//Creamos las variables del programa
			int incremento, segundos, minutos, horas;
			
			//Creamos el escáner del programa
			Scanner sc = new Scanner (System.in);
			
			/*Imprimimos tres mensajes al comienzo del programa: 
			 * El primero pedirá al usuario un valor inicial para las horas del reloj, y las guarda en la variable 'horas'
			 * El segundo pedirá al usuario un valor inicial para los minutos del reloj, y los guarda en la variable 'minutos'
			 * El tercero pedirá al usuario un valor inicial para los segundos del reloj, y los guarda en la variable 'segundos'
			 */
			System.out.print("Introduzca una hora inicial: ");
			horas = sc.nextInt();
			System.out.print("Introduzca unos minutos iniciales: ");
			minutos = sc.nextInt();
			System.out.print("Introduzca unos segundos iniciales: ");
			segundos = sc.nextInt();
			
			//Si los valores para el reloj introducidos por el usuario no son correctos, imprimimos un mensaje de error y se acaba el programa
			if(horas > 23 || horas < 0 || minutos > 59 || minutos < 0 || segundos > 59 || segundos < 0) {
				System.out.print("Los datos introducidos no son correctos o no existen");
			}
			else {
				/*Imprimimos dos mensajes más, el primero imprime la hora que ha introducido el usuario
				 * y el segundo pide al usuario un valor en segundos para incrementar la hora introducida y los guarda en la variable 'incremento'
				 */
				System.out.println("Usted ha introducido las " + horas + ":" + minutos + ":" + segundos);
				System.out.print("Por último, introduzca la cantidad de segundos que le desea sumar a la hora introducida: ");
				incremento = sc.nextInt();
				
				/*Creamos un bucle for para incrementar el valor de la hora
				 * Para ello, creamos e inicializamos una variable 'i' con valor 'incremento' introducido por el usuario
				 * El bucle se repetirá mientras 'i' sea mayor a 0
				 * Tras cada vuelta, el valor de'i' disminuirá en 1
				 */
				for(int i = incremento; i > 0; i--) {
					//Tras cada vuelta al bucle, le sumamos 1 segundo al valor almacenado en la variable 'segundos'
					segundos++;
					//Comprobamos si el valor en 'segundos' ahora es mayor a 59
					if(segundos > 59) {
						//De ser así, incrementamos en 1 el valor almacenado en 'minutos'
						minutos++;
						//Reiniciamos el contador de 'segundos' a 0
						segundos = 0;
					}
					//Comprobamos si el valor en 'minutos' supera 59
					if(minutos > 59) {
						//De ser así, incrementamos en 1 el valor almacenado en 'horas'
						horas++;
						//Reiniciamos el contador de 'minutos' a 0
						minutos = 0;
					}
					//Por último, comprobamos si el contador de 'horas' supera 23
					if (horas>23) {
						//De ser así, reiniciamos el valor de 'horas' a 0
						horas = 0;
					}
				}
				//Imprimimos el nuevo valor del reloj
				System.out.print("La hora incrementada es: " + horas + ":" + minutos + ":" + segundos);
			}
			//Cerramos el escáner
			sc.close();
		}

	}
