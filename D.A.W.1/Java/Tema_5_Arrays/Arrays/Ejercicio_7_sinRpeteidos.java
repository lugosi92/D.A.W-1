package Arrays;

import java.util.Arrays;
import java.util.Iterator;

public class Ejercicio_7_sinRpeteidos {

	public static void main(String[] args) {
		/*
		 * Construya  una tabla con numeros aleatorios
		 * devuelva una tabla de longitud apropiada con elementos de t[]
		 * Borrar los repetidos
		 */
		

		int[]  array = {1,4,5,6,3,2,4,5,6,4,7,8,7,6};
		
		int[] resultado = sinRpetidos(array);
		
		System.out.println(Arrays.toString(resultado));
	}
	
	static int[] sinRpetidos(int t[]) {
		
		int[]  temporal = new int[0];
		
		
		for(int a : t) {
			if(buscar(temporal, a) == -1) { //buscamos el elemento en el nuevo array
			temporal = Arrays.copyOf(temporal, temporal.length +1);//Copiar array con una posicion mas
			temporal[temporal.length-1] = a; //Insertamos al final
		}
	}
		return temporal;
}
	
	static int buscar(int[] t, int clave) {
		for (int i = 0; i < t.length; i++) {
			if(t[i] == clave) {
				return clave;
			}
		}
		return -1;
	}
}
