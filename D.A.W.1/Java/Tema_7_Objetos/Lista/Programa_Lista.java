package Lista;

import java.util.Arrays;
public class Programa_Lista {

	public static void main(String[] args) {
		Lista lista1 = new Lista();
		Lista lista2 = new Lista();
		Lista lista3 = new Lista();
		//System.out.println(lista1.numElementos());
		lista1.insertarAlFinal(5);
		lista1.insertarAlFinal(8);
		lista1.insertarAlFinal(12);
		lista1.insertar(99, 2);
		lista1.insertar(11, 1);
		System.out.println(lista1.mostrarLista());
		lista2.insertarAlPrincipio(10);
		lista2.insertarAlPrincipio(20);
		lista2.insertarAlPrincipio(30);
		lista2.insertarAlPrincipio(40);
		System.out.println(lista2.mostrarLista());
		lista3 = Lista.concatena(lista1, lista2));
		System.out.println(lista3.mostrarLista());
	}

}
