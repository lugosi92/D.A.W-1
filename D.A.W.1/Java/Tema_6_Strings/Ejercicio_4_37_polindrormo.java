package Strings;

import java.util.Scanner;

public class Ejercicio_4_37_polindrormo {
	public static void main(String[] args) {

	//Un programa que lea una frase del teclado y nos indique si es palíndroma
	//Dábale arroz a la zorra el abad
	//El usuario introduce la frase sin tildes.
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Introduce la frase polindroma sin tildes");
	String frase = sc.nextLine();
	
	String fraseRevertdia = "";
	
	for ( int i = frase.length() - 1 ; i >=0; i--) {
		fraseRevertdia += frase.charAt(i);
	}
		if(frase.equals(fraseRevertdia)) {
			System.out.println("La frase es polindorma");
		}else {
			System.out.println("La frase es distinta");
		}
			
	}
	
}

