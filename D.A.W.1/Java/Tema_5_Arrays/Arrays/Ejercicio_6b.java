package Arrays;

import java.util.Arrays;
import java.util.Iterator;

public class Ejercicio_6b {

	public static void main(String[] args) {
		
	int[] ganador = {1,2,3,4,5,6};
	int [] apuesta = {5,6,7,8,9,3};
	
	int acierto = aciertos(ganador, apuesta);
	
	System.out.println(acierto);
	}
	static int aciertos(int[] ganador, int[] apuesta ) {
	
		int aciertos =0;
		for (int i = 0; i < apuesta.length; i++) {
			if(Arrays.binarySearch(ganador, i) >=0) {
				aciertos++;
			}
		}
		return aciertos;
	}



	}

