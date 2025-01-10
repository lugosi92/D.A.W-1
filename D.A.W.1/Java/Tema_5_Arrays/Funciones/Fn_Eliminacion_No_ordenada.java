package Funciones;

public class Fn_Eliminacion_No_ordenada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/**
	 * Elimina un elemento de un arreglo no ordenado y devuelve un nuevo arreglo.
	 * Elimina la primera ocurrencia del valor especificado en el arreglo, si existe.
	 * @param arreglo El arreglo original de donde eliminar el elemento.
	 * @param valor El valor a eliminar.
	 * @return Un nuevo arreglo sin el valor especificado, manteniendo el orden de los restantes elementos.
	 */
	int[] eliminacionNoOrdenada(int[] arreglo, int valor) {
	    // Primero encontramos el índice del valor a eliminar.
	    int indice = -1;
	    for (int i = 0; i < arreglo.length; i++) {
	        if (arreglo[i] == valor) {
	            indice = i;
	            break; // Detiene la búsqueda al encontrar la primera coincidencia.
	        }
	    }

	    // Si el valor no está en el arreglo, retorna el arreglo original sin cambios.
	    if (indice == -1) {
	        return arreglo;
	    }

	    // Crea un nuevo arreglo que será un elemento menor en tamaño.
	    int[] nuevoArreglo = new int[arreglo.length - 1];

	    // Copia los elementos hasta el índice del valor a eliminar.
	    System.arraycopy(arreglo, 0, nuevoArreglo, 0, indice);

	    // Copia los elementos después del índice del valor a eliminar.
	    if (indice < arreglo.length - 1) {
	        System.arraycopy(arreglo, indice + 1, nuevoArreglo, indice, arreglo.length - indice - 1);
	    }

	    // Retorna el nuevo arreglo sin el valor eliminado.
	    return nuevoArreglo;
	}

}
