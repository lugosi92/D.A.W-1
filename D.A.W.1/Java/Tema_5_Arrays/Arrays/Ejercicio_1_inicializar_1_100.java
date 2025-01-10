package Arrays;

public class Ejercicio_1_inicializar_1_100 {

	public static void main(String[] args) {
		
		int[] tabla;
		
		tabla = new int[10];
		
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = (int) (Math.random()*100+1);
		}

		int suma = 0;
		
		for( int valores : tabla){
			suma += valores;
			}
		
		System.out.println("Suma de los valores: " + suma);
		}

}
