package Arrays;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio_9_campamento_programacion {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] original = new int[5];
		
		for (int i = 0; i < original.length; i++) {
			System.out.println("Introuduce las notas");
			original[i] = sc.nextInt();
		}
		Arrays.sort(original);
		System.out.println(Arrays.toString(original));
	
		System.out.println("Introduce las notas de exhibicion");
		int notas = sc.nextInt();
		while(notas != -1) {
			
			int pos = Arrays.binarySearch(original, notas); //buscamos la posicion
			int indiceInsercion; //donde insertar
			
			if(pos <0) {
				indiceInsercion = -pos -1;
			}else {
				indiceInsercion = pos;
			}
			
			int copia[] = new int[original.length +1];
			
			System.arraycopy(original, 0, copia, 0, indiceInsercion);

			System.arraycopy(original, indiceInsercion, copia, indiceInsercion +1, original.length - indiceInsercion);
			
			copia[indiceInsercion] = notas;
			
			original = copia;
			
			System.out.println("Introduce las notas de exhibicion");
			notas = sc.nextInt();
		}
		System.out.println("Puntuacion final: " + Arrays.toString(original));
		
		
		
	}

}
