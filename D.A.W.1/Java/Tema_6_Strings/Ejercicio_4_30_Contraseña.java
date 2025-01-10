package Strings;

import java.util.Scanner;

public class Ejercicio_4_30_Contraseña {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Jugador 1, introduce la contraseña");
		String contraseña = sc.nextLine();
		
		int longitud = contraseña.length();
		System.out.println("Una pista, la longitud de la cadena es: " + longitud);
		
		
		while(true) {
			
		System.out.println("Jugador 2, introduce la contraseña");
		String intentos = sc.nextLine();
		
		
		if (contraseña.equals(intentos)) {
			System.out.println("Has acertado la contraseña " + contraseña);
			break;
		}else {
			
			
			
			
		//c --> se pone la letra o * | i<longitud de intentos y caracter  de intentos es igual a caracter de contraseña <-- conidicion ? se pone el caracter sino *
			String nuevoIntento = " ";
			for( int i = 0 ; i< contraseña.length(); i++) {
				char c = (i< intentos.length() && intentos.charAt(i) == contraseña.charAt(i)) ?  contraseña.charAt(i) : '*';
				nuevoIntento += c;
			}
			System.out.println("Progreso " + nuevoIntento);
			System.out.println("Sigue intentandolo");
		
		}
		}
		
		
	}

}