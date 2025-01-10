package Tema_2;

import java.util.Scanner;

public class Ejercicio_12_fecha_correcta {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean fechaCorrecta;
		
		System.out.println("Introduce el año");
		int año = sc.nextInt();
		
		System.out.println("Introduce el mes");
		int mes = sc.nextInt();
		
		System.out.println("Introduce el dia");
		int dia = sc.nextInt();
		
		if (año >=2024) {
			fechaCorrecta = true;
		}else if(mes == 4 || mes ==6 || mes ==9 || mes ==11 && (dia > 1 && dia < 30)) {
			System.out.println("Fecha Correcta");
			fechaCorrecta = true;
		}else if(mes == 1 || mes ==2 || mes ==3 || mes ==5 || mes == 7 || mes ==8 || mes ==10 || mes ==12 &&  (dia > 1 && dia < 31)) {
			System.out.println("Fecha Correcta");
			fechaCorrecta = true;
		}else {
			System.out.println("Fecha Incorrecta");
			fechaCorrecta = false;
		}
	}
}

