package EJEMPLOS;

public class Ejemplos {

	public static void main(String[] args) {
		
		Persona persona = new Persona("Antonio", (byte)60, 1.80);
		persona.getEdad();
		persona.setNombre("Alfredo");
		persona.getNombre();
	}
}

		
		
		/*Persona persona = new Persona();//crear objeto
		persona.edad=18;
		
		persona.cumplirAnios();
		
		System.out.println(persona.edad);
	}

}

//metodos = funciones

//this.a dentro de un metodo, el this.a es para hacer referencial atributo de la clase
//static
//metodo estatico
//constructores--> devuelve un objeto de la clase que estamos creando*/
//diferencias entre get y setters con metodos

//ejercicio_5
//restriccion = constructor
//si no se asigna otro cosntructor mas
//visibles para clases vecinas se deja el tipo y nombre
//disponer de objeto --> en atributos Gestor gestor;
//no imprirmi la direccion de memoria al llamar la funcion poner un if(gestor != null)

//CREAR ONJETO EN LA OTRA CLASE -->Gestor miGestor = new Gestor("aNTONIO" , "+34566654734")
//ASIGNAR GESTO --> miCuenta = new CuentaCorriente("DNI", "NOMBRE", 500, miGestor)