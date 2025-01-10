package Tema_1;

import java.util.Scanner;

public class Ejercicio_14_redondear_decimal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce un numero decimal: ");
		double num = sc.nextDouble();
		
		int redondeo = (int) (num +0.5);
	
		System.out.println("Redondeo: " + redondeo);

	}

}
