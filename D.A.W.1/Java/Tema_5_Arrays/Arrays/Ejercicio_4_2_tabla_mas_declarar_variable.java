package Arrays;

public class Ejercicio_4_2_tabla_mas_declarar_variable {

	public static void main(String[] args) {
		// Construye una tabla de 10 elementos del tipo que quieras.
		int[] tabla = new int[10];
		
		// Declara tres variables de tabla que referencian a la tabla creada.
		int[] a = tabla;
		int[] b = tabla;
		int[] c = tabla;
		// Comprueba, imprimiendo por pantalla, que todas las variables contienen la
		// misma referencia.
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

	}
}
