package Tema_3;

import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio_12_calificacion_suspenso {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int nota = 0;
		int suspenso =0;
		int aprobado=0;
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Introudce la nota: ");
			nota = sc.nextInt();
			
			if (nota >= 5) {
				aprobado++;
			}else {
				suspenso++;
			}
		}
		System.out.println("La cantidad de suspensos son: " + suspenso);

	}

}
