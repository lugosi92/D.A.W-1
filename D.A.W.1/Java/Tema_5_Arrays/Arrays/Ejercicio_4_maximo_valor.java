package Arrays;

public class Ejercicio_4_maximo_valor {

	public static void main(String[] args) {
	
		int[] array = {3,5,6,7,8,3,9,7,8};
		
		System.out.println("Numero maximo: " + maximo(array) );
	}
	
	static int maximo (int t[]) {
		
		int max =0;
		
		for (int i = 0; i < t.length; i++) {
			if(t[i]> max) {
				 max = t[i];
			}
		}
		return max;
		
		
	}

}
