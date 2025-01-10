package Arrays;

import java.util.Arrays;

public class Ejercicio_6_primitiva_Fn_buscar_ordeanda {

	public static void main(String[] args) {
		
		/*Funcion  que tome 2 tablas
		 * Tabla 1: 6 numeros ganadores
		 * Tabla 2(ordenada): con 6 numeros de la combinacion ganadora
		 * devolver numero de aciertos
		 */
	
		int[] numero = {9,8,7,6,5,6};
		int[] apuesta = {1,2,3,4,5,6};
	
		System.out.println("Numero de aciertos: " + primitiva(numero,apuesta));
		
	
}
	
	static int primitiva(int apuesta[], int numero[]) {
		
		
		
		int aciertos =0;
		
		for (int pos : apuesta) {
			if(Arrays.binarySearch(numero, pos)>=0) {
				aciertos++;
			}
		}
		return aciertos;
		
	}

}
