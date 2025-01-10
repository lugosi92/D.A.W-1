package SegundoGrado;

public class segundogrado {

	//Atributos
	private double a;
	private double b;
	private double c;
	
	//CONSTRUCTORES
	public segundogrado(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}	
	//GETTERS Y SETTERS
		
	public void setA(double a) {
		this.a = a;
	}
	public double getA() {
		return a;
	}
	
	
	public void setB(double b) {
		this.b = b;
	}
	public double getB() {
		return b;
	}
	
	
	public void setC(double c) {
		this.c = c;
	}
	public double getC() {
		return c;
	}
	
	
	//METODOS DE LA CLASE
	public boolean  discriminatePositivo() {
		boolean esPositivo = false;
		if((b*b - (4*a*c)>=0)) {
			esPositivo = true;
		}
		return esPositivo;
	}
	
	public double[] solucion() {
		double soluciones[] = new double[2];
		if(discriminatePositivo()==true) {
		soluciones[0] = ((-b)+(Math.sqrt((b*b) - (4*a*c)))/(2*a));
		soluciones[1] = ((-b)-(Math.sqrt((b*b) - (4*a*c)))/(2*a));
		}else {
			System.out.println("La ecuacion no tiene soluciones reales");
		}
		return soluciones;
	}
}
