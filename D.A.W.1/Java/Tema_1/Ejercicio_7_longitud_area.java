package Tema_1;

import java.util.Scanner;

public class Ejercicio_7_longitud_area {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el radio: ");
		int radio = sc.nextInt();
		
		double longitud = (Math.PI*2) * radio;
		
		double area = Math.PI * Math.pow(radio,2);//Elevado a 2, puede ser a 3,4 et
		
		System.out.println("La longitud es: " + longitud);
		System.out.println("El area es: " + area);
	}

}
