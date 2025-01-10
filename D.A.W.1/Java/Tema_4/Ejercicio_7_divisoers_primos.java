package Tema_4;

import java.util.Scanner;

public class Ejercicio_7_divisoers_primos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int entero=0;
	
		System.out.println("Los  numeros divisiores son: "  + divisiores(24));
	}

	static int divisiores (int n) {
		
		int cont = 0;
		for (int i = 1; i < Math.sqrt(n); i++) {
			
			if( n % i == 0 && esPrimo(i)) {
				cont++;
			}
				
		}
		
		return cont;
	}
	
//-----//Funcion esPrimo
	
	static boolean esPrimo(int n) {
		boolean resultado = true ;
		
		//verifficar n por cada numero hasta n

		for (int i = 2; i < n; i++) {
			if( n % i == 0) {
				resultado = false;
			}else {
				return true;
			}
		}
		return resultado;
	}
	
}


