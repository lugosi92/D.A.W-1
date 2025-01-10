package Tema_3;

import java.util.Scanner;

public class Ejercicio_13_suspensop_condicionados {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			int notas;
			
			int condicionados = 0;
			int suspensos = 0;
			int aprobados = 0;
			
			for (int i = 0; i < 6; i++) {
				System.out.println("Introduce las notas: ");
				notas = sc.nextInt();
				
				if(notas>=5) {
					aprobados++;
				}else if(notas ==4) {
					condicionados++;
				}else if(notas <= 3) {
					suspensos++;
				}				
			}
			System.out.println("Cantidad de aprobados: " +aprobados);
			System.out.println("Cantidad de suspensos: " +suspensos);
			System.out.println("Cantidad de condiconados: " +condicionados);

	}

}
