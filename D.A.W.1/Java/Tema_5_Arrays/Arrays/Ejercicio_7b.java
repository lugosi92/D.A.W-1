package Arrays;

import java.util.Arrays;

public class Ejercicio_7b {

	public static void main(String[] args) {
		
		int [] array = {1,4,6,7,4,5,7,8};
	int[] resultado = sinRepetidos(array);
		
		System.out.println(Arrays.toString(resultado));
	}
	
	
	static int[] sinRepetidos(int t[]) {
		int[] ArrayNuevo = new int[0];
		
		for (int i = 0; i < t.length; i++) {
			if(buscarNoOrdenada(ArrayNuevo, t[i]) == -1) {
				ArrayNuevo = Arrays.copyOf(t, t.length+1);
				ArrayNuevo[ArrayNuevo.length-1] = t[i];
			}	
		}
		return ArrayNuevo;
		
		
	}
	static int buscarNoOrdenada(int t[], int clave) {
		
		for (int i = 0; i < t.length; i++) {
			if(t[i] == clave) {
				return i;
			}
		}
		return clave;
	}
}