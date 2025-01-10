package EJEMPLOS;

public class Persona {
	//Atributos=variables
	String nombre;
	byte edad;
	double estatura;

	//Contrsuctores
	Persona(String nombre, byte edad, double estaura){
		this.nombre = nombre;
		this.edad = edad;
		this.estatura = estaura;
	}
	Persona(String nombre){
		this.nombre=nombre;
	}
	
	Persona(){};
	//Getteres y Setters
	public void setEdad(byte edad) {
		this.edad = edad;
	}
	
	public byte getEdad() {
		return edad;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	//Metodos
	void saludar() {
		System.out.println("Hola. Mi nombre es " + nombre);
	}
	
	void cumplirAnios() {
		edad++;
	}
	
	void crecer(double incremento) {
		estatura = estatura + incremento;
		
	}
	public void getNombre() {
		// TODO Auto-generated method stub
		
	}
	
		
	
}


