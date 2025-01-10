package Arrays;

import java.util.Arrays;

public class fn_insertar_ordenada {

	public static void main(String[] args) {
		
		int[] array = {1,2,3,5,6,7,8,9};
		
		int[] resultado = insercionOrdenada(array,4);
		
		System.out.println(Arrays.toString(resultado));
	}
	
	static int[]  insercionOrdenada(int[] original, int nuevoElemento) {
		
		//Hacemos copia con una posicion mas
		int[] nuevo = Arrays.copyOf(original,original.length+1);
		int indiceInsercion = 0;
		
		//Donde insertar
		
		while(indiceInsercion < original.length && original[indiceInsercion] < nuevoElemento) { // posicion 
			indiceInsercion++;
		}
		
		//Despalazar elemento
		
		for(int i = nuevo.length -1; i > indiceInsercion ; i-- ) {
			nuevo[i] = nuevo[i-1];
		}
		
		//Insertar
		
		nuevo[indiceInsercion] = nuevoElemento;
		return nuevo;
	}
	

}
