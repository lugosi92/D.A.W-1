package Strings;

import java.util.Scanner;

public class Ejercicio_2_frase_mas_corta {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Frase 1: ");
		String frase1 = sc.nextLine();
		
		System.out.println("Frase 2: ");
		String frase2 = sc.nextLine();
		
		int longitud1 = frase1.length();
		int longitud2 = frase2.length();
		
		if( longitud1 > longitud2) {
			System.out.println("La frase1 es mas larga");
		}else if(longitud2  > longitud1) {
			System.out.println("La frase 2 es mas larga");
		}else {
			System.out.println("Son del mismo tamaño");
		}
	}
}
