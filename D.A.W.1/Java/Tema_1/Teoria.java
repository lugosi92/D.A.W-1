package Tema_1;
import java.time.LocalTime;

public class Teoria {

	public static void main(String[] args) {
		
//-----//Datos Primitivos
		byte a = 8; //bits
		short b = 16;
		int c = 32;
		long d = 64;
		float e = 32;
		double f = 64;
		boolean g = false;
		char h = 16;
		
		
//-----//Paquetes
		
		Math.random(); //Numero aleatorio
		Math.sqrt(a); //Raiz cuadrada
		Math.abs(a); //Numero absoluto
		double numeroPi = (Math.PI*2);
		double Potencia = Math.pow(numeroPi,2);
		
		LocalTime queHoraEs = LocalTime.now();
		System.out.println(queHoraEs);
		
//-----//Imprimir
		
		System.out.println("hola");
		System.out.println("que tal");
		
		System.out.print("hola");
		System.out.print(", que tal");
		
		System.out.println();
		
		System.out.println("La hora \n de que te vayas");
		
//-----//Operadores 
		//Aritmeticos + - * / ++ --  7%3 --> Esto da 1 que es el resto
		
		//Relacionales == != < <= > >= 
		
		//Logicos && || !
		
		//Opera y asigna += -= *= /= %=
		
		//ternarios --> expresionoCondicional ? valor1 : valor2
										    //Es cierto //Es falso
		
//-----//Castear 
		// de int a double se puede pero alreves no para hacerlo hay que castear
		int k = 3;
		double l = k;
		
		double i = 2.6;
		int j= (int) 2.6; //2.6 que era double pasa a ser 2
		


	}

}
