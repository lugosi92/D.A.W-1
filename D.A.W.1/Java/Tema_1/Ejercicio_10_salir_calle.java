package Tema_1;

import java.util.Scanner;

public class Ejercicio_10_salir_calle {

	public static void main(String[] args) {
		
		//No puedes salir si : 1.- Esta lloviendo , 2.-Hemos terminado las tareas
		//Podemos salir si : contrario
		//Ir a la biblioteca si o si
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Esta lloviendo: (true/false) ");
		boolean llueve = sc.nextBoolean();
		
		System.out.println("Has terminado las tareas: (true/false) ");
		boolean tareas = sc.nextBoolean();
		
		System.out.println("Vas a la biblioteca: (true/false)");
		boolean biblioteca = sc.nextBoolean();
		
		boolean salir = !llueve && tareas || biblioteca;
		
		System.out.println("Puedes salir: " + salir);
	}

}
