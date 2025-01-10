package Tema_3;

import java.util.Scanner;

public class Ejercicio_1_cadrado_par {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introudce un numero (0 para salir): ");
		int num = sc.nextInt();

		/*
		 * A) while ( num != 0) {
		 * 
		 * double potencia = Math.pow(num,2);
		 * 
		 * if(num % 2 == 0) { System.out.println("Numero par"); }else if(num >= 1) {
		 * System.out.println("Numero porsitivo"); }
		 * 
		 * System.out.println("Potencia: " + potencia);
		 * 
		 * System.out.println("Intrudce otro numeor: "); num = sc.nextInt(); }
		 */

		// B
		boolean numPar, numPositivo;

		while (num != 0) {

			numPar = num % 2 == 0 ? true : false;
			numPositivo = num > 0 ? true : false;

			System.out.println("Es par?: " + numPar + "\n" + "Es positivo?: " + numPositivo);
			System.out.println("Cuadrado: " + num * num);

			System.out.println("Introduce otro numero");
			num = sc.nextInt();
		}
	}
}
