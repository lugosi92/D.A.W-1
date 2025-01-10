package Calendario_4;

public class Ejercicio_5_19 {

	public static void main(String[] args) {
		Calendario hoy = new Calendario(2024,2,6);
		//hoy.incrementarDia();
		//hoy.mostrar();
		Calendario antesDeCristo = new Calendario(-300, 12, 31);
		antesDeCristo.incrementarDia();
		antesDeCristo.mostrar();
		antesDeCristo.incrementarMes();
		antesDeCristo.mostrar();
		antesDeCristo.incrementarAnyo(415);
		antesDeCristo.mostrar();
		
		System.out.println(hoy.iguales(antesDeCristo));
		
	}

}
