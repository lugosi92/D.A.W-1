package Punto_5;

public class Ejercicio_5_20 {

	public static void main(String[] args) {
		Punto p1 = new Punto(1,5);
		Punto p2 = new Punto(2.5, 8.3);
		p1.desplazaX(3);
		p1.muestra();
		
		//Distancia entre los 2 puntos
		System.out.println(p1.distancia(p2));
		System.out.println(p2.distancia(p1));
	}

}
