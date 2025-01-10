package Tema_3;

import java.util.Scanner;

public class Ejercicio_3_numero_secreto {

	public static void main(String[] args) {
		// Generar un numero aleatoriamente
		// Solicitar un numero 
		
		//mayor o menor indicarlo
		//mientras que el numero introudcio sea -1 o acierte el juego sigue 
		
		Scanner sc = new Scanner(System.in);
		
		int numSecreto = (int) (Math.random() * 100+1);
		
		System.out.println("Introudzca un numero: ");
		int num = sc.nextInt();
		
		while (num != -1 && num != numSecreto) {
			
			if(num > numSecreto) {
				System.out.println("El numero es menor");
			}else {
				System.out.println("El numero es mayor");
			}
			System.out.println("Introduce otro numero");
			num = sc.nextInt();
		}
		if( num == numSecreto) {
			System.out.println("Enhorabuena...");
		}else {
			System.out.println("Te jodes");
		}

	}

}
