package Arrays;

import java.util.Arrays;

public class Ejercicio_4_14_eliminar_tabla_no_ordenada {

	public static void main(String[] args) {
		// Escribir la función:
		// int[] eliminarMayores(int t[], int valor)
		// que crea y devuelve una copia de la tabla
		// t donde se han eliminado todos los elementos que
		// son mayores que valor
		int tabla[] = { 31, 23, 32, 14, 6, 70, 18 };

		int valor = 30;
		int[] resultado = eliminarMayores(tabla, valor);
		System.out.println("Arreglo original: " + Arrays.toString(tabla));
		System.out.println("Valor límite: " + valor);
		System.out.println("Arreglo resultante: " + Arrays.toString(resultado));
	}

	public static int[] eliminarMayores(int[] t, int valor) {
		int contador = 0;

		// Contar cuántos elementos son menores o iguales que valor
		for (int i = 0; i < t.length; i++) {
			if (t[i] <= valor) {
				contador++;
			}
		}

		// Crear un nuevo arreglo con el tamaño adecuado
		int[] resultado = new int[contador];
		int indiceResultado = 0;

		// Copiar los elementos menores o iguales que valor al nuevo arreglo
		for (int i = 0; i < t.length; i++) {
			if (t[i] <= valor) {
				resultado[indiceResultado] = t[i];
				indiceResultado++;
			}
		}

		return resultado;
	}
}
