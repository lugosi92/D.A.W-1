package Funciones;

import java.util.Arrays;

public class Fn_Insercion_No_ordenada {
	public static void main(String[] args) {
		
		int [] array = {1,4,6,7,4,5,7,8};
		int valor = 9;
		
		int[] resultado = insercionNoOrdenada(array,valor);
		
		System.out.println(Arrays.toString(resultado));
	}
	
	static int[] insercionNoOrdenada(int[] array, int valor) {
		/*
		 * 1.-Hace copia con una posicion mas
		 * 2.-Insertar valor
		 * 3.-Retornar valor
		 */
		
		int[] nuevoArray = Arrays.copyOf(array, array.length+1);
		nuevoArray[nuevoArray.length-1] = valor;
		return nuevoArray;
	
	}


}
