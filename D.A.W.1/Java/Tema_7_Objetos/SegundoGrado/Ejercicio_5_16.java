package SegundoGrado;

import java.util.Arrays;

public class Ejercicio_5_16 {

	public static void main(String[] args) {
		segundogrado ecuacion1 = new segundogrado(1.0,1.0,1.0);
		System.out.println(ecuacion1.discriminatePositivo());
		System.out.println(Arrays.toString(ecuacion1.solucion()));
	}

}
