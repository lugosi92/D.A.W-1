package Strings;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio_4_39_anagrama {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Introduce el primer anagrama ");
		String anagrama = sc.nextLine();
		
		System.out.println("Introduce el segundo anagrama ");
		String anagramaDos = sc.nextLine();
		
		char[] anagramaA = anagrama.toCharArray();
		char[] anagramaB = anagramaDos.toCharArray();
		
		
		Arrays.sort(anagramaA);
		Arrays.sort(anagramaB);
		
		if(Arrays.equals(anagramaA, anagramaB)) {
			System.out.println("Es un anagrama");
				}else {
					System.out.println("Sorry");
				}
		}
}
