package Tema_4;

import java.util.Scanner;

public class Ejercicio_5_es_vocal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("La leta i es vocal: " +  esVocal('i'));
	
	}

	static boolean esVocal( char c) {
		
		boolean resultado;
		
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
			resultado = true;
		}else {
			resultado = false;
		}
		
		return resultado;
	}
}
