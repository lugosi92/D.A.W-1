package Paleta_de_colores;

import java.util.Arrays;

public class Colores {

	//Atributos
	private String tabla[];

	//CONSTRUCTOR
	public Colores(){
		tabla = new String[3];
		tabla[0] = "Azul";
		tabla[1] = "Verde";
		tabla[2] = "Rojo";
	}
	
	public Colores(String tabla[]) {
		this.tabla = tabla;
	}
	
	//Guetters y setters
	public void setColor(String color) {
		tabla = Arrays.copyOf(tabla, tabla.length+1);
		tabla[tabla.length-1] = color;
	}
	
	//METODOS DE LA CLASE
	public String[] generaPaleta(int n) {
		String paletaAleatoria[] = new String[0];
		
		return paletaAleatoria;
		
	}
	
}