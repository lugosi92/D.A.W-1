package Arrays;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio_4_3_Suma_aleatorios {

	public static void main(String[] args) {
		//Crea una tabla de longitud 10  
		//se inicializará con números aleatorios comprendidos entre 1 y 100.
		//Mostrar la suma de todos los números aleatorios que se han guardado en la tabla.
		
		
		//Crea una tabla de longitud 10 	
		int[] arrayAleatorio = new int[10];
		
		// Que se inicializará con números aleatorios comprendidos entre 1 y 100. 
		Random rand = new Random();
		for (int i = 0; i < arrayAleatorio.length; i++) {
			arrayAleatorio[i] = rand.nextInt(100)+1;
		}
		
		
		//Mostrar la suma de todos los números aleatorios que se han guardado en la tabla.
		
			//Mostrar la tabla
		/*System.out.println("Mostrar tabla de numeros aleatorios:");
			for( int num : arrayAleatorio) {
				System.out.println(num + " ");
			}*/
		System.out.println(Arrays.toString(arrayAleatorio));
			
			//Mostrar la suma
			int suma = 0;
			for(int num : arrayAleatorio) {
				suma += num;				
			}
			System.out.println("La suma de todos los numeros es " + suma);
		}
	}


