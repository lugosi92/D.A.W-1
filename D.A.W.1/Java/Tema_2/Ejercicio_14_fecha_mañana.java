package Tema_2;

import java.util.Scanner;

public class Ejercicio_14_fecha_mañana {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		

		System.out.println("Introduce el año");
		int año = sc.nextInt();
		
		System.out.println("Introduce el mes");
		int mes = sc.nextInt();
		
		System.out.println("Introduce el dia");
		int dia = sc.nextInt();

		dia++;
		
		//Verififcaar dia
		if(dia > 31) {
			dia=1;
			mes++;
		//Verificar mes
		 if (mes >12){
			mes = 1;
			año++;
		}
		
	}

		System.out.println(dia + ":" + mes + ":" + año);
	}

}
