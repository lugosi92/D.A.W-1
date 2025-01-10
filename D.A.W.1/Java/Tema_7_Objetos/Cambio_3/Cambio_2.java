package Cambio_3;

public class Cambio_2 {

	//Atributos
	private double importe;
	private double cantidadPagada;
	
	//Constructor
	public Cambio_2(double importe, double cantidadPagada){
		this.importe = importe;
		this.cantidadPagada = cantidadPagada;
	}
	//METODOS DE LA CLASE
	public double  importeDevuelto() {
		double cantidadADevolver=0;
		if(cantidadPagada > importe) {
		return cantidadADevolver = cantidadPagada - importe;
	}else {
		System.out.println("La cantidad pagada no es suficiente");
		cantidadADevolver = 0;
		}
		return cantidadADevolver;
	}
}