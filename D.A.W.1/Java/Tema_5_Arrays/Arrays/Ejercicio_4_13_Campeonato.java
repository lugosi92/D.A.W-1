package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_4_13_Campeonato {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int[] puntuacion = new int[5];
		
		int[]  arrayCompeticion = new int[puntuacion.length];
		
		arrayCompeticion = puntuacion;
		
		System.out.println("Introduce la puntuacion de los programadores");
		
	/*	  // Introducir puntuaciones
        int puntuacion = sc.nextInt();
        while (puntuacion != -1 && contadorParticipantes < puntuaciones.length) {
            puntuaciones[contadorParticipantes++] = puntuacion;
            puntuacion = sc.nextInt();
        }*/
		for (int i=0; i<puntuacion.length ; i++) {
			System.out.println("Puntuacion del programador " + 1);
			int puntaje = sc.nextInt();
				if (puntaje == -1) {
					break;
				}
			puntuacion[i] = puntaje;
			
		}

		Arrays.sort(puntuacion);
		System.out.println(Arrays.toString(puntuacion));
		
		
		
		
		}
		
	}


