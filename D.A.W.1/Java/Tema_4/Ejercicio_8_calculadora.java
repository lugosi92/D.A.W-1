package Tema_4;

import java.util.Scanner;

public class Ejercicio_8_calculadora {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int num1 = 0;
		int num2 = 0;
		int op = 0;
		
		System.out.println("-Suma: 1 \n-Resta: 2 \n-Multiplicacion: 3 \n-Division: 4 \n \nIndique mediante el numero que operacion desea realizar ");
		op = sc.nextInt();
		
		System.out.println("Introduce el primer operando: " + num1);
		num1 = sc.nextInt();
		
		System.out.println("Introduce el segundo operando: " + num2);
		num2 = sc.nextInt();
		
		System.out.println("El resultado es: " + calculadora(num1,num2,op));
		
	}

	//Parametros: operador 1, operador 2, y que tipo de operacion 1suma...
	
	static int calculadora(int op1, int op2, int operacion) {
		
		int resultado = 0;
		

		if(operacion == 1) {
			 resultado = op1 + op2;
		}else if(operacion == 2){
			resultado = op1 - op2;
		}else if(operacion == 3) {
			resultado = op1 * op2;
		}else if(operacion == 4) {
			if(op2 != 0) {
			resultado = op1 / op2;
			}else {
				System.out.println("No se puede dividir entre 0");
			}
		}else {
			System.out.println("Introduce un numero valido");
		}
		
		return resultado;
	}
}
