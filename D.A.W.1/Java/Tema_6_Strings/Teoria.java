package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class Teoria {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 
		//if-else
		//condición ? expresión_verdadera : expresión_falsa;

		//sc.nextLine(); // El for no pregunta palabra 1 y 2 del tiron
		
		//frase += palabra + " "; // Agregar la palabra a la frase

//----------------------------//CHARACTER//----------------------------------------_//
	
		//esdigit-isLetter-isletterorDigit-isLowerCase-toUpperCase-isSpaceChar-WhiteSpace
		char c = '5';
		boolean esDigito = Character.isDigit(c);
		boolean isLtter = Character.isLetter(c);
		boolean isLetterorDigit = Character.isLetterOrDigit(c);
		boolean idLowerCase = Character.isLowerCase(c);
		//.....
		
		System.out.println("¿El carácter es un dígito? " + esDigito); // Imprimirá true

		//Conversion de caracteres
		
		char c1 ='A';
		char c2 = Character.toLowerCase(c1); // c2 = 'a';
		char c3 = 'b';
		char c4 = Character.toUpperCase(c3); // c4 = 'B';
		

		
		
//----------------------------//STRINGS//----------------------------------------_//
		//equals--> Si dos cadenas son iguales en contenido. 
		String cad1 = "Hola mundo";
		String cad2 = "Hola mundo";
		String cad3 = "Hola, buenos dias";
				
		boolean resultado = cad1.equals(cad3);
		
		System.out.println("resultado: " + resultado);
		
		//valueOf --> Cambia el valor de la variable
		cad1= String.valueOf("Nuevo");
		
		//regionMatches --> comparar una región específica
		String cad4 = "Hola mundo";
		String cad5 = "mundo";
		
		boolean resultado2 = cad4.regionMatches(5, cad5, 0, 5);
		
		System.out.println("resultado2: " +resultado2);
		
		
		
		//compareTo --> comparar dos cadenas lexicográficamente. comparetoignoreCase
		String cad6 = "hola";
		String cad7 = "adios";
		
		int resultado3 = cad6.compareTo(cad7);
		
		System.out.println("resultado3: " + resultado3);
		// La diferencia entre los códigos Unicode de estos dos caracteres es -7.
		
		
		
		//charAt -->  Obtener el carácter en una posición específica
		String cad8 = "Hola";
		
		char cadena = cad8.charAt(0);
		
		System.out.println("cadena" + cadena);
		
		
		
		
		//subString	--> Extraer una subcadena de una cadena
		String cad9 = "Hola mundo";
		
		String subcadena = cad9.substring(5);
		
		System.out.println("subcadena" + subcadena);
		
		
		
		//substring  --> Extraer subcadena concreta
		
		String cad10 = "Una mañana al despertar, estaba muy tranquilo";
		
		String cadenaConcreta = cad10.substring(14 ,22);
		
		System.out.println("cadenaConcreta" + cadenaConcreta);
		
		
		
		
		
		//Strip--> cadena sin espacion a los lados (stripLeading --> (espacion al principio | stripTrailing --> espacios al final)
		
		String cadStrip = "    Buenos dias por la mañana   ";
		
		String cadenaLimpia = cadStrip.strip();
		
		System.out.println("cadenaLimpia" + cadenaLimpia);
		
		
		
		
		// length
		
		String cadLongitud = "Hola buenas noches, tortilla";
		String cadLongitud2 = "Hola buenas dias , huevos con sal ";
		
		int longitud = cadLongitud.length();
		int longitud2 = cadLongitud2.length();
		
		System.out.println("longitud: " + longitud);
		System.out.println("longitud2: " + longitud2);
		
		
		
		
		
		//indexOf caracter--> devuelve el primer caracter que se solicita
		
		String indexCadena = "Hola, me gusta Londres y  Dublin";
	
			int indice1 = indexCadena.indexOf("o");
			System.out.println("La primera 'o' encontrada esta en la posicion " + indice1);
			
			int indiceM  = indexCadena.indexOf("m");
			System.out.println("La primera 'm' encontrada esta en la posicion" + indiceM);
			
		//indexOf caracater + Posicion  --> verififcar caracter
		String idenxCadena2 = "Hola este verano me voy a vivir a Londres";
		
			int indiceE = idenxCadena2.indexOf('o', 4);
			System.out.println("La primera 'o' a partir de la posicion 4 es: " + indiceE);
		
		//indexOf Cadena + Caracter
		
		String cadenaString =  "En Dublin bucare un finde para volar a un amigo a Dublin";
		
			int indiceLondres = cadenaString.indexOf("Dublin" , 4);
			System.out.println("Dublin desde posicion 3 se encunetra en " + indiceLondres);
			
		//lastindexOf (los mismos 3 tipos de antes)
			
			
//-----//BOOLEANS
			
		// isEmpty --> si esta vacia una cadena
		String cadenaEmpty ="";
		boolean vacia = cadenaEmpty.isEmpty();
		System.out.println(vacia);
		
		String cadenaNoEmpty = "Hola que tal";
		boolean llena = cadenaNoEmpty.isEmpty();
		System.out.println(llena);
		
		
		
		//contains(CharSequence subcadena) --> si cadena1 contiene parte  cadena2 . 
		
		String frase = "Hola como estas, ¿Como va todo?";
		String subcadena2 = "como estas";
		
		boolean cadenaCont = frase.contains(subcadena2);
		System.out.println("cadenaCont: " + cadenaCont);
		
		
		
		// startsWith(String prefijo) --> cadena comienza con un prefijo específico.
		
		String palabra = "Hola, como estamos";
		
		boolean llamada1 = palabra.startsWith("Hola");
		System.out.println("Llamada1: "+ llamada1);
		
		boolean llamada2 = palabra.startsWith("Adios");
		System.out.println("Llamada2: "+ llamada2);
		
		
		// endsWith(String sufijo)
		
		String palabra2 = "Este verano me voy 1 mes a dublin";
		
		boolean termina1 = palabra2.endsWith("dublin");
		System.out.println("termina 1:" + termina1);
		
		boolean termina2 = palabra2.endsWith("mes");
		System.out.println("termina 2:" + termina2);
		
//-----//
		
		//toLowerCase toUpperCase
		
		String fraseMayMin = "Hola mundo";
		
		String lower = fraseMayMin.toLowerCase();
		System.out.println("Lower: " + lower);
		
		String upper = fraseMayMin.toUpperCase();
		System.out.println("Upper: " + upper);
		
		//replace
		
		String replaceChar = "Hola mundo";
		String replacePalabra = "Hola mundo";
		
		String replaceFrase = replaceChar.replace('o', 'i');
		System.out.println(replaceFrase);
		String replaceFras = replacePalabra.replace("mundo", "amigo");
		System.out.println(replaceFras);
		
		//String[] split(String separador):
		
		String sliptFrase = "Hola, me ire a La finca, a Londres";
		
		String[] spliti = sliptFrase.split(" ");
		for (String palabraSplit : spliti) {
			//System.out.println(palabraSplit);
			
//----------------------------//Cadena y tabla de caracteres//----------------------------------------_/
			
		//toCharArray--> pasar cadena a array
			
		String stringaArray = "Hola";
		
		char[] pasaArray = stringaArray.toCharArray();
		
		//System.out.println(Arrays.toString(pasaArray));
			
		//for ( char y : pasaArray) {
			//System.out.println(y);
		
		//static String valueOf
		
		//Entero a cadena
		int num42 = 42;
		String srtNum = String.valueOf(num42);
		System.out.println(srtNum);
		// boolean, double...
		
		
		char[] array = {'H', 'o', 'l', 'a', ' ', 'm', 'u', 'n', 'd', 'o'};
		int inicio = 0; // Índice de inicio
		int cuantos = 5; // Longitud de la subcadena

		String subcadena4 = String.valueOf(array, inicio, cuantos);
		System.out.println(subcadena4); // Imprime "Hola "

		

//----------------------------//Refuerzo//-----------------------------------------/
		 // Crear un objeto StringBuffer
        StringBuffer sb = new StringBuffer("Hola");

        // Agregar texto al final
        sb.append(" Mundo");

        // Insertar texto en una posición específica
        sb.insert(5, ", ¡");

        // Eliminar parte del texto
        sb.delete(0, 5);

        // Imprimir el resultado
        System.out.println(sb.toString());  // Salida: "¡Mundo"
    

        //--- operaciones con el tipo int ---
        int i = 43;

        //convierto de int a String
        String sInt = Integer.toString(i);

        //convierto de String a int
        int i2 = Integer.parseInt(sInt);

        double j = 53.4;

        String sdouble = Double.toString(j);

        double j2 = Double.parseDouble(sInt);

        //character --> char
		}
		}
		
	}

