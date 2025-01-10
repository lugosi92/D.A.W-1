package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_4_11_borrar_repetido {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arrayRepetido = { 4, 5, 6, 7, 4, 7, 6, 4 };

		int[] arraySinRepetidos = sinRepetidos(arrayRepetido);

		System.out.println("El array sin numeros repetidos es" + Arrays.toString(arraySinRepetidos));
	}
	
	static int[] sinRepetidos(int t[]) {
		int[] resultado = new int[t.length];
		int indice = 0;

		for ( int i=0; i<t.length;i++) {
			int j;
			for(j=0; j<t.length;j++) {
				if(t[i] == resultado[j]) {
					break;
			}
		}
		if(j == indice) {
			resultado[indice] = t[i];
			indice++;
		}
		}
		return resultado;
	}
}
		
