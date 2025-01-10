package Funciones;

public class Fn_Buscar_No_ordenada {
	public static void main(String[] args) {
	
	}
	
	
	static int buscarNoOrdenada(int[] array, int clave) {
		/*
		 * 1.-Recorre el array
		 * 2.-Si el indice es igual al valor
		 * 3.-Devolver indice
		 */
		for (int i = 0; i < array.length; i++) {
			if(array[i] == clave) {
				return i;
			}
			}
		return -1;
		
	}
	
	}

