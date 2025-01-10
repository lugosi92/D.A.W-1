package Ejercicios_Generales;

public class Ejercicio_5_7 {

	public static void main(String[] args) {
		TEXTO_5_7 t1 = new TEXTO_5_7(10);
		t1.setCadena("Hola mundo");
		t1.addFinal('o');
		System.out.println(t1.getCadena());
		System.out.println(t1.cuentaVocales());
		t1.mestraTexto();
	}

}
