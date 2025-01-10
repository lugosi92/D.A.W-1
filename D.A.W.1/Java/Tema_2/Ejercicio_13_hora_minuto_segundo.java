package Tema_2;

import java.util.Scanner;

public class Ejercicio_13_hora_minuto_segundo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce la hora");
		int hora = sc.nextInt();

		System.out.println("Introduce la minuto");
		int minuto = sc.nextInt();

		System.out.println("Introduce la segundo");
		int segundo = sc.nextInt();

		int sumSegundo  = segundo + 1;
		if (sumSegundo > 59) {
			sumSegundo = 0;
			minuto++;
		} else if (minuto > 59) {
			minuto = 0;
			hora++;
		}else if (hora == 24) {
			hora = 0;
		}
		
		System.out.println(hora + ":" + minuto + ":" + sumSegundo);
	}

}
