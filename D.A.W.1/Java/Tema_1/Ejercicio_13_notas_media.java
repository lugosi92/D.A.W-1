package Tema_1;

import java.util.Scanner;

public class Ejercicio_13_notas_media {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Trimestre 1");
		int nota1 = sc.nextInt();
		
		System.out.println("Trimestre 2");
		int nota2 = sc.nextInt();
		
		System.out.println("Trimestre 3");
		int nota3 = sc.nextInt();
		
		int mediaEntera = (nota1 + nota2 + nota3) / 3;
		
		System.out.println("Nota media boletin " + mediaEntera);
		
		double mediaDecimal = mediaEntera;
		
		System.out.println("Nota media expediente " + mediaDecimal);
	}

}
