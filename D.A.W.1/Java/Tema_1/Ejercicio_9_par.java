package Tema_1;

import java.util.Scanner;

public class Ejercicio_9_par {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inrrudce un numero: ");
		int num = sc.nextInt();
		
		boolean par = (num%2) == 0;
		
		System.out.println("Su numero es par: " + par);
	}

}
