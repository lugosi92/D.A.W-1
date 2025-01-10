package Arrays;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio_2_5_numeros_en_orden {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		double[] tabla = new double[5];
		
		for (int i = 0; i < tabla.length; i++) {
			System.out.println("Introduce 5 valores decimales");
			tabla[i] = sc.nextDouble();
		}
		
		System.out.println(Arrays.toString(tabla));
		
	}

}

