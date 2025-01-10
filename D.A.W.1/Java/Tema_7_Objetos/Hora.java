package Hora;

public class Hora {

	//Atributos
	private int hora;
	private int minuto;
	private int segundo;
	
	//Constructores
	public Hora(int hora, int minuto, int segundo) {
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}
	//GETTERS y SETTERS
	public setSegundo
	
	//METODOS DE LA CALSE
	public void incrementaSegundos() {
		segundo++;
		if(segundo==60) {
			minuto++;
			segundo=0;
			if(minuto==60) {
				hora++;
				minuto=0;
				if(hora==24) {
					hora=0;
				}
			}
		}
	}
}
