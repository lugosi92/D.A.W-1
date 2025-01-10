package Punto_5;

public class Punto {

	//Atributos
	private double x;
	private double y;
	
	//Constructor
	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	//Geters y Seters
	
	//Metodos de la clase
	void desplazaX(double dx) {
		x = x + dx;
	}
	
	void desplazaY(double dy) {
		y = y + dy;
	}
	
	void desplaza ( double dx, double dy) {
		desplazaX(dx);
		desplazaY(dy);
	}
	
	double distancia(Punto otroPunto) {
		double dist=0;

		double a = Math.pow((this.x - otroPunto.x), 2.0);
		double b = Math.pow((this.y - otroPunto.y), 2.0);
		dist = Math.sqrt(a+b);
		
		return dist;
	}
	
	public void muestra() {
		System.out.println("x:" + x +" y:" +y);
	}
}
