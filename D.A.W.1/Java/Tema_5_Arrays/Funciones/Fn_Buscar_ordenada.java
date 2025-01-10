package Funciones;

public class Fn_Buscar_ordenada {
	public static void main(String[] args) {
	
	}
	/**
	 * Realiza una búsqueda binaria en un arreglo ordenado.
	 * @param arreglo El arreglo ordenado donde se busca el elemento.
	 * @param valor El valor a buscar.
	 * @return El índice del elemento si se encuentra, o -1 si no se encuentra.
	 */
	static int busquedaOrdenada(int[] arreglo, int valor) {
	    int inicio = 0;
	    int fin = arreglo.length - 1;
	    while (inicio <= fin) {
	        int medio = inicio + (fin - inicio) / 2;
	        if (arreglo[medio] == valor) {
	            return medio; // Retorna el índice si encuentra el valor.
	        } else if (arreglo[medio] < valor) {
	            inicio = medio + 1; // Ajusta el inicio para buscar en la mitad superior.
	        } else {
	            fin = medio - 1; // Ajusta el fin para buscar en la mitad inferior.
	        }
	    }
	    return -1; // Retorna -1 si no encuentra el valor.
	}

}
