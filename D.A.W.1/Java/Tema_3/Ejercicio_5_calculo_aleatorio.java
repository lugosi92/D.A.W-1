package Tema_3;

import java.util.Scanner;

public class Ejercicio_5_calculo_aleatorio {

	public static void main(String[] args) {
		//Generar dos numeros aleatorios (1-100)
		//Solicitar suma de ambos
		
		//Solucion correcta el juego continua, sino termina
		 //Mostrar numero de aciertos
		Scanner sc = new Scanner (System.in);

		int operador1, operador2, resultado;
		int numAciertos = 0;
		
		System.out.println("Introduce la suma de la siguientes operaciones");
		
		do {
			
			operador1 = (int) (Math.random() * 100 +1);
			operador2 = (int) (Math.random() * 100 +1);	
			
			System.out.println(operador1 + " + " + operador2 + " = ");
			resultado = sc.nextInt();
			numAciertos++;
		}while (operador1 + operador2 == resultado);
		
		System.out.println("Has realizado " + (numAciertos -1) + "aciertos");
	}	
}
	


