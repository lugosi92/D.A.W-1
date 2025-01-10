package Arrays;

public class Ejercicio_10_eliminarMayores {

	public static void main(String[] args) {
		

	}
	
	static int[] eliminarMayores(int[] arreglo, int valor) {
		    // Contador para saber cuántos elementos son menores o iguales al valor dado.
		    int contador = 0;
		    for (int num : arreglo) {
		        if (num <= valor) {
		            contador++;
		        }
		    }

		    // Crear un nuevo arreglo para almacenar los elementos que no superan el valor dado.
		    int[] resultado = new int[contador];
		    int indice = 0;
		    for (int num : arreglo) {
		        if (num <= valor) {
		            resultado[indice++] = num;
		        }
		    }

		    return resultado;
		}

	}


