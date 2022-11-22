package examen;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		/*
		 * pruebas: 
		 * nombre pepe
		 * notas 2,2,2
		 * nombre mara 
		 * notas 3,3,3
		 * 
		 * opcion del menu 1 , 2 y 3
		 * 
		 * LA NOTA MÁXIMA LA HA CONSEGUIDO mara CON UN TOTAL DE: 3.0 PUNTOS.
			LA NOTA MÍNIMA LA HA CONSEGUIDO pepe CON UN TOTAL DE: 2.0 PUNTOS.
			LA MEDIA DE LAS NOTAS ES: 2.5
			
			si escribes una nota que este fuera del rango, aparecerá lo siguiente
			Introduce una nota que esté entre 0 y 10
			
		 */
		//bloque de variables
		String nombre;			// se guarda el nombre
		String nombremax="";	// se guardará el nombre de la persona con mas nota
		String nombremin="";	// se guardará el nombre de la persona con menos nota
		int nombre0=1;				// guarda el valor de nombre para terminar el for
		int notapractica;		// nota de practica
		int notaproblemas;		// nota de los problemas 
		int notateoria;			//la nota de la teoria
		double notafinal;		//se guarda la nota final
		double notamax=0;		// se guarda la nota más alta
		double notamin=10;		// se guardará la nota más baja, se inicia en 10 para que si o si la primera nota se ponga en la variable 
		double sumanotas=0;		// irá sumando todas las notas
		int contador=0;			// el contador para luego hacer la media
		int seleccion=0;			//se guarda la opcion seleccionada por el usuario en el menú
		
		double medianotas=0;

		try (// creamos el scanner
		Scanner sc = new Scanner(System.in)) {
			// preguntamos por el nombre y las notas
			System.out.println("Para salir del programa coloca 0 en el nombre y notas");
			System.out.println("Introduzca su nombre: ");
			nombre= sc.next();
			System.out.println("Introduzca la nota de las practicas");
			notapractica=sc.nextInt();
			System.out.println("Introduzca la nota de los problemas");
			notaproblemas=sc.nextInt();
			System.out.println("Introduzca la nota de la teoría");
			notateoria=sc.nextInt();
			
			// comprobamos que ningunna nota es menor que 0 ni mayor que 10
				switch (nombre) {
				case "0" :
					System.out.println("Introduce un nombre valido.");		// si el nombre es 0 no entraá en el bucle 
					nombre0=0;
					break;
				default:
				}
				if (notapractica<0 || notapractica>10 || notaproblemas<0 || notaproblemas>10 || notateoria<0 || notateoria>10) {
					System.out.println("Introduce una nota que esté entre 0 y 10");	
}else {
				for (contador=0; nombre0!=0;contador++){	
					notafinal=(notapractica*0.1)+(notaproblemas*0.5)+(notateoria*0.4);		// calcula la nota final segun las ponderaciones
					if (notafinal>notamax) {				// pone la mayor nota en notamax y el nombre de esas persona en nombremax
					notamax=notafinal;
					nombremax=nombre;
					}
					
					if (notafinal<notamin) {		// pone la menor nota en  notamin y el nombre en nombremin
					notamin=notafinal;
					nombremin=nombre;
					}
					
					sumanotas+=notafinal;			// suma las notas 
					
					// vuelve a pedir el nombre y notas
					System.out.println("Para salir del programa coloca 0 en el nombre y notas");
					System.out.println("Introduzca su nombre: ");
					nombre= sc.next();
					System.out.println("Introduzca la nota de las practicas");
					notapractica=sc.nextInt();
					System.out.println("Introduzca la nota de los problemas");
					notaproblemas=sc.nextInt();
					System.out.println("Introduzca la nota de la teoría");
					notateoria=sc.nextInt();
					
					// vuelve a comprobar si el nombre es correcto y las notas son correctas
					switch (nombre) {						
					case "0" :
							System.out.println("Ha terminado");
							nombre0=0;
							break;
					default:
					}
					if (notapractica<0 || notapractica>10 || notaproblemas<0 || notaproblemas>10 || notateoria<0 || notateoria>10) {
						System.out.println("Introduce una nota que esté entre 0 y 10");	
					
					}
				}
				medianotas=sumanotas/contador;			// hace las medias de las notas
				
				// hacemos el menú
				System.out.println("MENÚ");
				System.out.println("NOTA MÁXIMA-1");
				System.out.println("NOTA MINIMA-2");
				System.out.println("MEDIA NOTAS-3");
				seleccion = sc.nextInt();
				
				if(seleccion<1 || seleccion>3) {
					System.out.println("Introduce una opción correcta.");		// comprueba que se ha seleccionado una opción correcta
				}else {
					switch (seleccion) {		// segun la opción seleccionada saldrá una respuesta
					case 1:
						System.out.println("LA NOTA MÁXIMA LA HA CONSEGUIDO "+ nombremax+ " CON UN TOTAL DE: "+notamax+ " PUNTOS.");
						break;
					case 2:
						System.out.println("LA NOTA MÍNIMA LA HA CONSEGUIDO "+ nombremin+ " CON UN TOTAL DE: "+notamin+ " PUNTOS.");
						break;
					case 3:
						System.out.println("LA MEDIA DE LAS NOTAS ES: " + medianotas);
						break;
					}
				}
			}
				// cerramos scanner
				sc.close();
		}
	}

}
