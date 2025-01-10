package Lista;

import java.util.Arrays;
import java.util.Iterator;

public class Lista {
	// Atributos
	private Integer tabla[];

	// Constructores
	public Lista() {
		tabla = new Integer[0];
	}

	// Métodos de la clase:

	// Número elementos insertados en la lista:
	public int numElementos() {
		return tabla.length;
	}

	// Insertar un número al final de la lista
	public void insertarAlFinal(Integer nuevoNumero) {
		tabla = Arrays.copyOf(tabla, tabla.length+1);
		tabla[tabla.length-1] = nuevoNumero;
	}

	// Insertar un número al principio de la lista
	public void insertarAlPrincipio(Integer nuevoNumero) {
		Integer tabla2[] = new Integer[0];
		tabla2 = Arrays.copyOf(tabla, tabla.length+1);
		for (int i = 0; i < tabla.length; i++) {
			tabla2[i+1] = tabla[i];
		}

		tabla2[0] = nuevoNumero;
		tabla = tabla2;
	}

	// Insertar un elemento en una posición (en un lugar de la lista) que se pasa
	// como parámetro
	public void insertar(Integer nuevoNumero, int posicion) {
		if (posicion >= tabla.length || posicion < 0) {
			System.out.println("Posición no valida");
		} else {
			Integer tabla2[] = new Integer[0];
			tabla2 = Arrays.copyOf(tabla, tabla.length+1);
			for (int i = 0; i < posicion; i++) {
				tabla2[i] = tabla[i];
			}
			for (int i = posicion; i < tabla.length; i++) {
				tabla2[i+1] = tabla[i];
			}
			tabla2[posicion] = nuevoNumero;
			tabla = tabla2;
		}

	}

	// Imprimir la Lista en pantalla (objeto)
	public String mostrarLista() {
		return Arrays.toString(tabla);	
	}
	
	//Añadir al final de la lista los elementos de otra lista que se pasa como parámetro
	public void insertarAlFinal(Lista otraLista) {
		Integer tabla2[] = new Integer[0];
		tabla2 = Arrays.copyOf(tabla, tabla.length + otraLista.tabla.length);
		for (int i = tabla.length; i < tabla2.length; i++) {
			tabla2[i]= otraLista.tabla[i-tabla.length];
		}
		tabla = tabla2;
	}
	
	//Eliminar un elemento cuyo índice se para como parámetro --AQUÍ NOS HEMOS QUEDADO! ;)
	public void eliminarDePosicion(int posicion) {
		Integer tabla2[] = new Integer[0];
		for (int i = 0; i < posicion; i++) {
			tabla2[i]=tabla[1];	
		}
		for (int i = posicion; i < tabla.length; i++) {
			tabla2[i]=tabla[i];
		}
	}
	
	//OBTENER EL ELEMENTO CUYO indice se pasa como parametro
	public Integer getElemento(int posicion) {
		Integer elemento = null;
		if(posicion>=tabla.length || posicion<0) {
			System.out.println("Posicion no valida");
		}else {
			elemento = tabla[posicion]; 
		}
		return elemento;
	}
	//Buscar un numero en la lista, devolvindo el indice del primer lugar donde ..
	//funcion 4.9

	public static Lista concatena(Lista l1, Lista l2) {
		Lista lista= new Lista();
		lista.tabla = Arrays.copyOf(l1.tabla, l1.tabla.length);
		lista.insertarAlFinal(12);
		return null;
	}
}
