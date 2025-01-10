package Funciones;

import java.util.Arrays;

public class Fn_insercion_ordenada {

	    public static void main(String[] args) {
	        int[] array = {4, 2, 7, 1, 5};
	        int nuevoElemento = 3;
	        
	        System.out.println("Array original: " + Arrays.toString(array));
	        array = insertarOrdenado(array, nuevoElemento);
	        System.out.println("Array con " + nuevoElemento + " insertado ordenadamente: " + Arrays.toString(array));
	    }
	    

	    static int[] insertarOrdenado(int[] array, int nuevoElemento) {
	        int[] nuevoArray = Arrays.copyOf(array, array.length + 1);
	        int indiceInsercion = 0;

	        // Encontrar el índice donde se insertará el nuevo elemento
	        while (indiceInsercion < array.length && array[indiceInsercion] < nuevoElemento) {
	            indiceInsercion++;
	        }

	        // Desplazar los elementos mayores hacia la derecha para hacer espacio para el nuevo elemento
	        for (int i = nuevoArray.length - 1; i > indiceInsercion; i--) {
	            nuevoArray[i] = nuevoArray[i - 1];
	        }

	        // Insertar el nuevo elemento en el lugar adecuado
	        nuevoArray[indiceInsercion] = nuevoElemento;

	        return nuevoArray;
	    }
	}

