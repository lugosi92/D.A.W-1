package CESAR;

public class Cesar {

	//ATRIBUTOS
	private static char letras[] = {'A','B','C','D','E','F','G',
									'H','I','J','K','L','M','N',
									'O','P','Q','R','S','T','U',
									'V','W','X','Y','Z'};
	private int paso;
	private static char cifrado[];
	
	//CONSTRUCTOR
	public Cesar() {
		cifrado = new char[letras.length];
	}
	//GUETTERS Y SETTERS
	
	//METODOS
	public static String codifica(String cadena, int paso) {
		String codificada ="";
		for (int i = paso; i < letras.length ; i++) {
			cifrado[i] = letras[i-paso]; 
		}
		
		

		return codificada;
	}
}
