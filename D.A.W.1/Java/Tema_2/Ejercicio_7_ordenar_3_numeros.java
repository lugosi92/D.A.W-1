package Tema_2;

import java.util.Scanner;

public class Ejercicio_7_ordenar_3_numeros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el primer numero");
		int a = sc.nextInt();
		
		System.out.println("Introduce el segundo numero");
		int b = sc.nextInt();
		
		System.out.println("Introduce el tercero numero");
		int c = sc.nextInt();
				

		if(a > b && b > c) {
			System.out.println(a + "-" + b + "-" + c );
		}else if(a>b && b<c) {
			System.out.println(a + "-" + c + "-" + b );
		}else if(b>a && a<b) {
			System.out.println(b + "-" + a + "-" + c );
		}else if(b>c && c> a) {
			System.out.println(b + "-" + c + "-" + a );
		}else if(c>a && a < b) {
			System.out.println(c + "-" + a + "-" + b );
		}else if(c>b && b>a) {
			System.out.println(c + "-" + b + "-" + a );
		}
	}

}
