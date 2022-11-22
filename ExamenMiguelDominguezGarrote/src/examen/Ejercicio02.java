package examen;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		/*
		 * Pruebas: 
		 * 0
		 * 1 : hay 0 numeros pares hay 1 numero impar
		 * 12: hay 1 numero par hay 1 numeros impar
		 * 22:hay 2 numeros pares hay 0 numeros impares
		 * 33 : hay 0 numeros pares hay 2 numeros impares
		 * 2324 : hay 2 numeros pares hay 2 numeros impares
		 */
		//bloque de variables
		int numeroriginal; 					// se guarda el numero introducido
		int numero;								// se guarda el numero con el que vamos a trabajar
		int contadorpar=0;						// será el contador de los numeros pares
		int contadorimpar=0;						// contador de los numero impares
		int cifra;								// se guardará cifra por cifra para comparar
		
		// creamos el scanner
		Scanner sc=new Scanner(System.in);
		
		// preguntamos al usuario por un numero mayor o igual que cero
		System.out.println("Introduzca un numero mayor o igual que 0: ");
		numeroriginal= sc.nextInt();
		
		// ponemos los limites para que el usuario no escriba un numero menor que 0
		if (numeroriginal<0) {
			System.out.println("ERROR, Debe introducir un numero MAYOR O IGUAL QUE 0");
		}else {						// si el numero es correcto empieza a comprobar
			numero=numeroriginal;	// primero igualamos la variable numero a numeroriginal para poder trabajar con ella y no perder la original
			for (int i=1;i<=numeroriginal;i++) {
				cifra=numero%10;					// lo primero que haremos será sacar la ultima cifra del numero
				if (cifra%2==0) {					// comprobamos si la cifra al hacer el modulo de 2 es 0 , si lo es contador par suma 1
					contadorpar++;
				}else {
					contadorimpar++;				// si al hacer el modulo de 2 el resultado no es 0 contador impar suma 1
				}
				numero=numero/10;					// ahora dividimos el numero entre 10 para quitarle la ultima cifra
				if (numero<=0) {					// cuando el numero sea menor que 0 se saldrá del bucle 
					break;
				}
			
			}
			}
		System.out.println("En el numero " + numeroriginal+ " hay :");			//mostramos el resultado
		
				System.out.println("hay " + contadorpar + " numeros pares");
				System.out.println("hay " + contadorimpar + " numeros impares");
		
		//cerramos scanner
		sc.close();
			
		}
	}


