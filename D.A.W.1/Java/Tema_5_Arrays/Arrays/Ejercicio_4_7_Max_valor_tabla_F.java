package Arrays;

public class Ejercicio_4_7_Max_valor_tabla_F {
	public static void main(String[] args) {
		// Escribir la función int maximo(int t[])
		// que devuelva el máximo valor contenido en la tabla t.
		
		int[] array ={34,78,96,5,6,7,8,90,76,5,43};
		
		int resultado = maximo(array);
		
		System.out.println("El maximo valor es " + resultado);
	}
		
		static int maximo (int t[]) {
			
			int maximoValor = 0;
			for(int i = 0; i< t.length; i++) {
				if(t[i]> maximoValor) {
					maximoValor = t[i];
				}
			}
			return maximoValor;
		}
	}
