package Tema_4;

import java.util.Scanner;

public class Ejercicio_4_Maximo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int e1 =0;
		int e2 =0;
		
		System.out.println("Entero 1" + e1);
		e1 = sc.nextInt();
		
		System.out.println("Entero 2" + e2);
		e2 = sc.nextInt();
		

		System.out.println("el numero maximo es " +	numeroMax(e1, e2));
	}
	
	static int numeroMax(int n1, int n2) {
		int max = 0;
		
		if(n1 > n2) {
			max = n1;
		}else if(n2 > n1) {
			max = n2;
		}
		
		return max;
	}

}
