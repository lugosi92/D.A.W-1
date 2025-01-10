package Tema_4;

import java.util.Scanner;

public class Ejercico_6_numero_primo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = 0;
		System.out.println("Introduce un numero ");
		num = sc.nextInt();

		System.out.println("El numero " + num + " es: " + esPrimo(num));

	}

	static boolean esPrimo(int n) {
		boolean resultado = true;

		// verifficar n por cada numero hasta n

		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				resultado = false;
			} else {
				return true;
			}

		}

		return resultado;
	}

}
