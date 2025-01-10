package Arrays;

import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio_4_4_cantidad_los_numeros_medias {

	public static void main(String[] args) {
		//Utilizando una tabla escribe un programa que solicite por teclado un número n.
		//A continuación solicita al usuario que teclee n números y guárdalos en la tabla.
		//Realiza la media de los números positivos, la media de los números negativos y cuenta el número de ceros introducidos.
		
		Scanner sc = new Scanner(System.in);
		//Solicitar cantidad de numeros y guardar en Array 
		System.out.println("Define la cantidad de numeros que vas a introducir");
		int n = sc.nextInt();
		
		double[] array = new double[n]; 
		
		//Unidad numerica recogida
		for (int i = 0; i < n ; i++) {
			System.out.println("Introduce los numeros " + (i +1 ));
			array[i] = sc.nextDouble();
		}
		
		//Media de los positivos
		double sumaPositivos = 0;
		double contadorPositivos = 0;
		//Media de los negativos
		double sumaNegativos = 0;
		double contadorNegativos = 0;
		//Cantidad de 0
		double sumaCeros = 0;
		
		for(double numero : array) {
			if ( numero >0) {
				sumaPositivos += numero;
				contadorPositivos ++;
			}else if(numero <0 ){
				sumaNegativos += numero;
				contadorNegativos ++;
			}else if(numero == 0) {
				sumaCeros ++;
			}
		}
		double mediaPositivos = sumaPositivos/contadorPositivos;
		double mediaNegativos = sumaNegativos/ contadorNegativos;
		
		System.out.println("La media de numeros positivos es " + mediaPositivos);
		System.out.println("La media de numeros negativos es " + mediaNegativos);
		System.out.println("La cantidad de 0 " +sumaCeros);
		}
	}

