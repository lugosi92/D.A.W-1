package Calendario_4;

public class Calendario {

	// ATRIBUTO
	private int dia;
	private int mes;
	private int anyo;

	// CONSTRUCTOR
	Calendario(int anyo, int mes, int dia) {
		this.anyo = anyo;
		// Comprobar mes y dia
		if (mes >= 0 && mes <= 12) {
			this.mes = mes;
			switch (mes) {
			case (1):
			case (3):
			case (5):
			case (7):
			case (8):
			case (10):
			case (12):
				if (dia >= 1 && dia <= 31) {
					this.dia = dia; // Guardarlo en el atributo
				}
			break;
			case (4):
			case (6):
			case (9):
			case (11):
				if (dia >= 1 && dia <= 30) {
					this.dia = dia; // Guardarlo en el atributo
				}
			break;
			case (2):
				if (dia >= 1 && dia <= 28) {
					this.dia = dia; // Guardarlo en el atributo
				}
			}
		}
	}// Fin constructor
		// GETTERS Y SETTERS

	// Metodos de la clase
	public void incrementarDia() {
		//dia++;
		switch (mes) {
		case (1):
		case (3):
		case (5):
		case (7):
		case (8):
		case (10):
				if (dia > 31) {
					mes++;
					dia = 1;
				}
		break;
		case (4):
		case (6):
		case (9):
		case (11):

				if (dia > 30) {
					mes++;
					dia = 1;
				}
		break;
		case (2):
				if (dia > 28) {
					mes = 3;
					dia = 1;
				}
		break;
		case (12):
				if (dia > 31) {
					mes = 1;
					dia = 1;
					anyo++;
			}
		}//Fin switch
	}//Fin incrementarDia
	public void mostrar() {
		System.out.println(anyo + "/" + mes + "/" +dia);
	}
	public void incrementarMes() {
		mes++;
		if(mes >12) {
			mes = 1;
			anyo++;
		}
	}
	public void incrementarAnyo(int cantidad) {
		if(this.anyo<0) {
			if(this.anyo + cantidad >0) {
				this.anyo = this.anyo + cantidad ;
			}
		}else {
			this.anyo = this.anyo + cantidad;
		}	
	}
	public boolean iguales(Calendario otraFecha) {
		boolean sonIguales = false;
		if(this.anyo == otraFecha.anyo && this.mes == otraFecha.mes && this.dia == otraFecha.dia) {
			sonIguales = true;
	}
		return sonIguales;
		
	}
}
