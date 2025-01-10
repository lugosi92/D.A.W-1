package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Teoria {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		 * ATAJOS
		 * Recorrido de tabla (for, for-each..)
		 * Mostrar tabla  (to.String)
		 * Ordenar (.sort)
		 * Copia (3 tipos, copyOf (desde el principio), copyofRange(Desde cuialquier punto) , copyof(copiar de una tabla a otra
		 * Comparacion 2 tablas (.equals
		 * 
		 * FUNCIONES (6)
		 * Busqueda (Tabla_ordenada) | (Tabla no ordenada)
		 * Insercion (Tabla_ordenada) | (Tabla no ordenada)
		 * Eliminacion (Tabla_ordenada) | (Tabla no ordenada)
		 */

//-----//5.1 Variables escaleras VS tablas
		
		//En una variable escalera se guarda de 1 en 1 el valor
		//En un array se almacenan varios
		
//-----//5.2 Indices
		
			//Para acceder a un numero se usa un idice (empieza en el 0)
			// Para acceder a un inidce se pone --> edad[0], seelcciona el primer valor de la tabla 
			
		//5.2.1 Indices fuera de rango 
		
			//Mayor parte de errores
		
//------//5.3 Construccion de tablas
		
			//Tener en cuenta 
				//Tipo de datos y cuantos elementos
				//Declarar una variable por tabla
				//Crear la tabla
		
		//5.3.1 Longitud y tipo

			//Longitud -->numero de lementos que tiene
			//Tipo --> tipo de datos que va a almacenar
		
		//5.3.2 Variables de tabla
		
			//Para diferenciar variable escalera y de tabla se usan []
			
			// tipo nombreVariable[];   int edad[];
			//tipo[] nombreVariable;	int[] edad;
		
		//5.3.3  Operador new
		
			//Todos se inicializan a 0
				//nombreVaribale = new tipo[longitud];
				// edad = new int[5];
			
			//Valores predeterminados 
			
				// int edad[] = {1,2,4,6};
		
			//Resumen
			
			int[] edad;
			
			edad = new int[4];
			
				// IGUAL A --> int[] edad2 = new int[4];
			
			edad[0] = 45;
			edad[1]= 67;
			edad[2]= 89;
			edad[3]= 23;
			
//------//5.4 Referencias
			
			//Como funcioan el operadro new
			
				edad = new int[10];
			
				//1.- Calcula el tamaño de la tabla (biyte de int = 4 * posiciones) = 10* 4= 40
				//2.- Almacena esos 40 bytes en algun hueco
				//3.- Reserva sitio para reservar
				//4.- Recorre toda la tabla
				
			//Se puede acceder a la misma tabla con disitno nombrreVariable (Siempre del mismo tipo)
				//int d[], e[]
				//d = new int[5];
				//d = e
				
		//5.4.1 Recoletor de basura
				
				//Cuando no esta referenciada por ninguana variable se alamcena pero el recoletor lo borrara
				
		//5.4.2 Referencia null
				/* int t1[], t2[];
				 * t1 = new int[100];
				 * t1 = t2 ahora hacen referncia a la misma tabla
				 * t1 = null;
				 * solo t2 solo puede acceder
				 */
				
//------//5.5 Uso de tablas
				
				//No se puede modificar la longitud una vez definida
				//Para aumentar hay que copiar los elementos anteriores en un nuevo array 
				//Para aumentar haciendo una nueva referncia
		
		//5.5.1 Tablas ordenadas
				
		//5.5.2 Tablas + indicador (tablas con valores basura, en teoria ocupan memoria pero asi no se modifica la longitud)
		
//------//5.6 Tablas como paramnetros de funciones
				
//------//5.7 Operaciones con tablas: la clase Arryas impor java.util.Arrays
				
		//5.7.1 Obtencion del numero de elemntos de una tabla 
				
				// nombreVaribale.length
		
		//5.7.2 Inicializacion 
				
				//Arrays.fill(sueldos, 1235.56); o Arrays.fill(sueldos,123.65, 5, 6);
				
		//5.7.3 Recorrdio
				int[] sueldos;
				
				sueldos = new int[3];
				
				sueldos[1] = 5;
				sueldos[0] = 6;
				sueldos[2] = 4;
				
				for (int i = 0; i < sueldos.length; i++) {
					sueldos[i] = sueldos[i] * 1000;
				}
				
				//Sumar elementos de una tabla 
				
					//sueldo es una variable que itera
				int sumaSueldos = 0;
				for (int sueldo : sueldos) {
					sumaSueldos += sueldo;
				}
				
		//5.7.4 Mostrar una tabla
			
				 int[] t = {1, 5, 7, 8, 9, 3};
					
					//Tabla  hecha
					 System.out.println(Arrays.toString(t));
					
					//Escribiendo nuestra implementacion
					 for (int i = 0; i < t.length; i++) {
						 System.out.println(t[i]);
					 }
					 
					 System.out.println();
					 
					 for (int iterador : t ) {
						 System.out.println(iterador);
						 
					//Guardar n numeros
							
							System.out.println("Introduce la cantidad de numeros");
							int numero = sc.nextInt();
							
							int[] arrayVeces = new int[numero];
							
						
							
					//Guardar x valores introducidos por el usuario
							
							int[] arrayX = new int[5];
							
							for (int i = 0; i < arrayX.length; i++) {
								System.out.println("Introduce los numeros ");
								arrayX[i]=sc.nextInt();
							}
							System.out.println("Los  numeros introducidos son " + (Arrays.toString(arrayX)));
							
			//5.7.5 Ordenacion
							
					Arrays.sort(arrayX);
					
			//5.7.6 Busqueda (BUSQUEDA SECUANCIAL)
					
					//Busqueda en una tabla NO ORDENADA --> es mas rapdio que en tabla no ordenada
					
					
					
					//Busqueda en una tabla ORDENADA --> implementacion
					
					int pos = Arrays.binarySearch(sueldos, 6);
					if(pos >=0) {
						System.out.println("Encontrado en el indice: " + pos);
					}else {
						System.out.println("No se ha encontrado");
					}
					
						//Buscar subconjunto de elementos
						/*
						 * static int binarySearch(tipo t[], int desde, int hasta, tipo claveBusqueda) 
						 */
					
					
			//5.7.7 Copia
					
				/*
				 * static tipo[] copyOf(tipo origen[], int longitud)
				 */
					int a[] = {1,2,1,6,23};
						int b[]; int c[]; 
						int[] d;
						
						b = Arrays.copyOf(a, 3);
						c = Arrays.copyOf(a, 6);
						
						System.out.println(Arrays.toString(c));
					
					
						/*
						 * static tipo[] copyOfRange(tipo origen[], int desde, int hasta) 
						 */
						
							d = Arrays.copyOfRange(a, 2, 4);
							System.out.println(Arrays.toString(d));
							
							
							int[] origen = {1, 2, 3, 4, 5};
							int[] destino = new int[5];

							// Copiar los primeros 3 elementos de origen en destino, comenzando desde la posición 0 en ambos arrays
							System.arraycopy(origen, 0, destino, 0, 3); //Array 1 desde posicion 0 copiar a el array 2 desde la  posicio 0 , copar 3 elementos

							System.out.println(Arrays.toString(destino)); // Resultado: [1, 2, 3, 0, 0]

			//5.7.8 Insercion
							
							//Tabla que no importa orden basta con hacer una copia en una longitud 1 posicion mas grande e insertar
							
							
								//Insercion no ordenada	--> Se crea una tabla nuevo con el mismo nombre de variable de la original  y se deja a merced del recoletor la tabla original
				
								int e[] = {1,2,1,6,23};
								
								e = Arrays.copyOf(e, e.length-1);
	
								
								System.out.println(Arrays.toString(e));
								
								int[] temporal = new int[10];
								
								
								//Reocrrer una tabla y copar los elementos en otra nueva
								for (int i = 0; i < t.length; i++) {
									if(t[i] == 1) {
								temporal = Arrays.copyOf(temporal, temporal.length-1);
							
								temporal[temporal.length-  1] = i;
								}
								}
								
								//Inercion ordenada
								
								/* 
								 * 1.-Buscar posicion que le corresponde --> indiceInsercion
								 * 2.- Tabla nueva --> copia
								 * 3.- copiar de la original a copia sin ocupar el indiceInsercion
								 */
								
				//5.7.9 Eliminacion
								
								
									

	}
	}
}
