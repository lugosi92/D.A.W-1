package Tema_3;

import java.util.Scanner;

public class Ejercicio_8_media {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);

		int n = 0;
		int suma = 0;
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Introducir numero: ");
			n = sc.nextInt();
			n++;
			suma += n;
		}
		
		double media = suma/n;
		System.out.println("La media es: " + media);
	}

}

