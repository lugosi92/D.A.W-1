package Tema_4;

import java.util.Scanner;

public class Ejercicio_3_area_volumen {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
	
		int num = 0;
		double radio = 0;
		double altura = 0;
		
		System.out.println("Introduce 1 para calcular Area o" + "\n" + "Introduce 2 para calcular volumen" +  num);
		num = sc.nextInt();
		
		System.out.println("Introduce el radio " + radio);
		radio = sc.nextInt();
		
		System.out.println("Introduce la altura " + altura);
		altura = sc.nextInt();
		
		areaVolumen (num, radio, altura);
		
	}
	
	static void areaVolumen ( int n, double radio, double altura) {
		
		if(n == 1) {
			
			n = (int) ((Math.PI * 2) * radio * (altura + radio)); 
			
			System.out.println("El area es " + n);
		}else if(n == 2) { 
			n = (int) (Math.PI * Math.sqrt(radio) * altura);
			System.out.println("El volumen es " + n);
		}else if(n != 1 || n !=2){
			System.out.println("Introduce un numero valido");
	
		}
		
	}

}
