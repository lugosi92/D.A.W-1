package Pila;
import java.util.Arrays;


public class Ejercicio_5_13 {
	public static void main ( String[] args) {
		
	
	Pila pila1 = new Pila();
	pila1.apilar(8);
	pila1.apilar(9);
	pila1.apilar(12);
	System.out.println(pila1.mostrarPila());
	pila1.desapilar();
	System.out.println(pila1.mostrarPila());
	
		
}
}

	