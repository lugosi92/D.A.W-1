package Pila;

import Lista.Lista;

public class Pila {
	//Atributos
		 private Lista lista;
		 
		 //Constructor
		 public Pila() {
			 lista = new Lista();
			 
		 }

		 //Metodo de clase//maximo de la pila
			public void apilar(Integer nuevoNumero) {
				lista.insertarAlFinal(nuevoNumero);
				
			}

			public Integer desapilar() {
				Integer ultimoElemento=null;
				if(lista.numElementos()>0) {
					ultimoElemento = lista.getElemento(lista.numElementos()-1);
				lista.eliminarDePosicion(lista.numElementos()-1);
				}
				return ultimoElemento;
			}
			
			public String mostrarPila() {
				return lista.mostrarLista();
			}
	}


