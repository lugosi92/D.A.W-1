package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_4_9_FN_buscar {

	public static void main(String[] args) {
		//Escribe la función int buscar(int t[], int clave),
		//que busca de forma secuencial en la tabla t el valor clave. 
		//En caso de encontrarlo devuelve en qué posición lo encuentra, 
		//y en caso contrario devuelve -1.
	

		Scanner sc = new Scanner(System.in);
		
	
		System.out.println("Introduce la clave");
		int clave = sc.nextInt();
		
		int[] t= {2, 18, 18, 24, 26, 38, 72, 74, 78};
	
		int resultado = buscar(t, clave);
		
		if(resultado !=-1 ) {
			System.out.println("El numero " + clave + "se encuentra en la poscion " +resultado);
		}else {
			System.out.println("El numero " + clave + " no se encuentra");
		}
	}

			 static int buscar(int t[], int clave) {
			        for (int i = 0; i < t.length; i++) {
			            if (t[i] == clave) {
			                return i; // Devuelve la posición donde se encontró la clave
			            }
			        }
			        return -1; // Si no se encontró la clave, devuelve -1
			    }
}


	















/*public static void main(String[] args) {

}

static int buscar(int t[], int clave) {//toma un array y clave= valor que buscamos
	int indiceBusqueda= 0;//Busca la clave(El minero)
	int resultado = 0;//Indice dodne se almacena la clave(Donde el minero guarda el diamante)
	
	
	while (indiceBusqueda < t.length //Mientras que loskm recorrido por el minero es menor al maximo
			&& t[indiceBusqueda] != clave) {// y las piedras encontradas sena distintas al diamante
		indiceBusqueda++;// el minero sigue buscando diamante hasta que termine
	}
	if(indiceBusqueda < t.length) {// Si los kilometros recorridos son menores  y ha salido 
		resultado = indiceBusqueda;//El minero da el diamante
	}else {//sino
		resultado = -1;//el minero no ha encontrado nada
	}
	return resultado;
}*/

