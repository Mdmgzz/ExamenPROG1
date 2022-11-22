package examen;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		/*
		 * Pruebas:
		 * He probado con un numero fuera del rango (0) : debe salir : Introduce un numero apto para realizar un cuadrado.
		 * con el (1)	: debe salir: *
		 *  y con el (9): debe salir un cuadrado de 9x9
		 */
		//bloque de variables
		int estrellas;				// se guardan el numero de estrellas introducidos por el usuario para realizar el ejercicio
		
		// creamos el scanner
		Scanner sc=new Scanner(System.in);
		
		// preguntamos al usuario
		System.out.println("Introduzca un numero para realizar un cuadrado con asteriscos: ");
		estrellas=sc.nextInt();
		
		// comprobamos que el numero introducido es apto para realizar un cuadrado
		// en este caso el numero minimo para realizar un cuadradro es un 2 pero si el usuario introduce 1 se hará un cuadrado de 1 estrella
		if(estrellas<=0) {
			System.out.println("Introduce un numero apto para realizar un cuadrado.");
			}
		else if(estrellas==1) {
				System.out.println("*");
		}else {															// si el numero es apto para realizar el cuadrado no ponemos a ello 
		
		// creamos el bucle para empezar a realizar el cuadrado
		for (int j=1; j<=estrellas ; j++) {								// escribimos la primera fila de estrellas
			System.out.print("*");										// se escribe hasta llegar al numero que nos ha indicado
																		// el usuario
		}
		System.out.println();											// escribimos un salto de linea para pasar a la siguiente
		for (int i=2; i<=estrellas-1 ; i++) {																
			System.out.print("*");								// con este bucle vamos a escribir las estrellas de los laterales 
			for (int x=1; x<estrellas-1;x++) {					// contando con que la primera y ultima fila se van a escrbir fuera de este bucle
				System.out.print(" ");							// este tercer bucle escribe los espacios entre asteriscos en el centro
			}													
			System.out.print("*");	
			System.out.println();								// salto de linea para no superponer asteriscos

		}
		for (int p=1; p<=estrellas ; p++) {				// esto funciona igual que el primer for ya que escribe una linea de asteriscos
			System.out.print("*");						//igual al numero introducido
				}
			
		}
		// cerramos Scanner
				sc.close();
	}
}
