package radio;

public class radioFM {

	//Atributos 
	private double frecuencia;
	
	 //CONSTRUCTOR
	public radioFM(double frecuencia) {
		if(frecuencia<87.5) {
			this.frecuencia = 87.5;
		}else if(frecuencia>108) {
			this.frecuencia =108.1;
		}else {
			this.frecuencia = frecuencia;
		}
	}
	
	public radioFM() {};
	
	//METODO DE LA CLASE
	
	public void up() {
		if(frecuencia<=107.5) {
		frecuencia = frecuencia + 0.5;
		}else {
			frecuencia= 87.5;
		}
	}
	public void down() {
		if(frecuencia>=88) {
		frecuencia = frecuencia - 0.5;
		}else {
			frecuencia = 108;
		}
	}
	public void display() {
		System.out.println("Sintonizamos: " + frecuencia);
	}
}
