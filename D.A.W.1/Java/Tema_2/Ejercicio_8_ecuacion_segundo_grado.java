package Tema_2;

import java.util.Scanner;

public class Ejercicio_8_ecuacion_segundo_grado {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el coeficiente (a): ");
		int a = sc.nextInt();	
		
		System.out.println("Introduce el coeficiente (b): ");
		int b = sc.nextInt();	
		
		System.out.println("Introduce el coeficiente (c): ");
		int c = sc.nextInt();	

		int raiz = (int) (Math.pow(b,2) - 4 * a * c); 
		int denominador  = 2*a;		
		
		int solucion1 = (int) ((-b + Math.sqrt(raiz)) / (denominador));
		int solucion2 = (int) ((-b - Math.sqrt(raiz)) / (denominador));
		
		
		if(raiz < 0) {
			System.out.println("No tiene solucion");
		}else if(a < 0) {
			System.out.println("No tiene solucion");
		}else {
			System.out.println("Solucion 1: " + solucion1);
			System.out.println("solcuion 2: " + solucion2);
		}
	}

}
