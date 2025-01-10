package Strings;

import java.util.Scanner;

public class Ejercicio_4_35_javalin_javalan {

	public static void main(String[] args) {
		//Idioma--> Javlanadi
		//1.- Comienzan sus frases con «Javalín, javalón», 
		//2.- Despues hacen una pausa
		//3.- Expresan el mensaje
		
		//(la pausa se representa mediante espacios en blanco o tabuladores)
		
		//Dialecto --> Javalandia
		//1.- Expresan el mensaje
		//2.- Termina con un silencion prolongado
		//3.- «javalén, len, len»
		
		
		//Se pide un traductor
		//1.- Diga si se esta hablando con idioma o con dialecto
		//2.- Mostrar mensaje sin muletillas
		
		Scanner sc = new Scanner(System.in);
		
		//String idioma = "Javalin, javalon,			 bienvenido a nuestro munod";
		//String dialecto = "Bienvenido a nuestra mini ciudad, 			javalen,len,len";	
		
		System.out.println("Introduce una frase");
		String frase = sc.nextLine();
		
		String resultado = traducir(frase);
		
		System.out.println("La frase esta en: " + resultado);
	}
	
		static String traducir(String frase) {
		
			boolean idioma1;
			boolean dialecto2;
			if ( idioma1 = frase.startsWith("Javalin, javalon")) {
				return "idioma java";
				//System.out.println("La frase esta en el idioma");
			}else if(dialecto2 = frase.startsWith("javalen,len,len")) {
				return "dialecto de idioma java";
				//System.out.println("La frase esta en dialecto");
			}else {
				//System.out.println("Ningun idioma reconocido");
				return  "Ningun idioma reconocido";
			}
		}
		
	}


