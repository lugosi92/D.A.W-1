package Tema_1;

import java.util.Scanner;

public class Ejercicio_11_beneficio_anual {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Cuantso kilos de MANZANAS has vendido: ");
		double manzanas = sc.nextDouble();
		
		System.out.println("Cuantso kilos de PERAS has vendido: ");
		double peras = sc.nextDouble();
		
		double totalManzanas  = manzanas * 2.35;
		
		double totalPeras = peras * 1.95;		
		
		double importeTotal = totalManzanas + totalPeras;
		
		double importeTotal1 = (manzanas * 2.35) + (peras * 1.95);
		
		System.out.println("Beneficio Manzanas: "+ totalManzanas+"€");
		System.out.println("Beneficio Peras: "+ totalPeras+"€");
		
		
		System.out.println("Beneficio total: " + importeTotal1+"€");

	}

}
