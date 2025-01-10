package Arrays;

import java.util.Arrays;

import java.util.Scanner;

public class Ejercicio_4_5_imprimrir_en_orden {

	public static void main(String[] args) {
		//Escribe un programa que solicite al usuario que introduzca por teclado 5 números decimales.
		//A continuación, mostrar los números en el mismo orden que se han introducido.
		
		Scanner sc = new Scanner (System.in);
		
		//Array almacenamiento maximo hasta 5
		double[] array = new double[5];
		
		//Pedir 5 valores
		for ( int i = 0; i<5 ; i++) {
			System.out.println("Introduce 5 numeros decimales" + (i+1));
			array[i] = sc.nextDouble();
		}
		//Array ordenado
		for ( double arrayOrdenado : array) {
			System.out.println("El array ordenado es " + arrayOrdenado);
		}
		
	}
}