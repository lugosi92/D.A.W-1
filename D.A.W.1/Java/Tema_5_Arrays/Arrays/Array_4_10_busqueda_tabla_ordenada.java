package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array_4_10_busqueda_tabla_ordenada {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arrayApuesta = new int[6];
		
		int[] arrayGanador = new int[6];
		
		
		for(int i=0; i< arrayApuesta.length; i++) {
			System.out.println("Introduce tu apuesta");
			arrayApuesta[i] = sc.nextInt();
		}

		for(int j=0; j< arrayGanador.length; j++ ) {
			System.out.println("Introduce los numeros ganadores ");
			arrayGanador[j] = sc.nextInt();
		}
		
		Arrays.sort(arrayApuesta);
		System.out.println("Tu apuesta es: " + Arrays.toString(arrayApuesta));
		
		int aciertos = numAciertos(arrayApuesta, arrayGanador);
		
		System.out.println("Su numero de aciertos es " + aciertos);
		
	}
		
		static int numAciertos( int[] arrayApuesta, int[] arrayGanador) {
			
			int aciertos = 0;
			
			for(int i = 0; i< arrayApuesta.length; i++) {
				if (Arrays.binarySearch(arrayGanador, arrayApuesta[i]) >=0){
					aciertos++;
				}
				
			}
			return aciertos;
	}

}
