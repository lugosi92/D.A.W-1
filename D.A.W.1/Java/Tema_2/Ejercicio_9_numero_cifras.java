package Tema_2;

import java.util.Scanner;

public class Ejercicio_9_numero_cifras {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Intrudce un numero: ");
		int num = sc.nextInt();
		
		if(num > 0 && num < 99) {
			System.out.println("Su numero tiene 2 cifras");
		}else if(num > 100 && num < 999){
			System.out.println("Su numero tiene 3 cifras");
		}else if(num > 1000 && num <9999) {
			System.out.println("Su numero tiene 4 cifras");
		}else if(num > 10000 && num < 99999) {
			System.out.println("Su numero tiene 5 cifras");
		}else if(num > 100000) {
			System.out.println("Su numero tiene mas de 5 cifras");
		}
				

	}

}
