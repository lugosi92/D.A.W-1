package Strings;

public class Ejercicio_4_29_Frase_corta {
	public static void main (String[] args) {
		//Introducir por teclado dos frases e indicar cual de ellas es la más corta, 
		//es decir, la que contiene menos caracteres.
		
		String frase1 = "Hola buenos dias, me gusta el chocolate";
		String frase2 = "Hola buenos dias, me gusta el chocolate";
		
		if(frase1.length()< frase2.length()) {
			System.out.println("La frase1 es mas corta");
		}else if(frase1.length()> frase2.length()){
			System.out.println("La frase 2 es mas corta");
		}else {
			boolean resultado = frase1.equals(frase2);
			System.out.println("La frase es la misma");
		}
		
		
	}
	
}
