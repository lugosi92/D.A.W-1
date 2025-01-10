package Ejercicios_Generales;
import java.time.*;
public class TEXTO_5_7 {

	//Atributos
	private String cadena;
    private int longitudMax;//para especififcar la longitud maxima
    private LocalDate fechaCreacion;
    private LocalDateTime horaModificacion;
    
    
	//Contstructor
    public TEXTO_5_7 (int longitudMax){
    	cadena="";
    	this.longitudMax= longitudMax;
    	this.fechaCreacion = LocalDate.now();
    	this.horaModificacion = null;
    }
    //GET Y SETTERS
    public void setCadena(String cadena) {
    	if(cadena.length()<=longitudMax) {
    		this.cadena=cadena;
    		this.horaModificacion = LocalDateTime.now();
    	}
    }
    public String getCadena() {
		return cadena;
    }
    public void setLongitudMax(int longitudMax) {
    	if(longitudMax>= this.cadena.length()) {
    		this.longitudMax = longitudMax;
    	}
    }
    public int getLongitudMax() {
    	return longitudMax;
    }
    
    
    //METODOS
    public void addFinal(char c) {
    	if(cadena.length()<longitudMax) {
    		cadena = cadena+c;
    	}
    }
    public void addFinal(String s) {
    	if(cadena.length() + s.length() <= longitudMax) {
    		cadena = cadena+s;
    	}
    }
    public void addInicio(char c) {
    	if(cadena.length()<longitudMax) {
    		cadena = c + cadena;
    	}
    }
    public void addInicio(String s) {
    	if(cadena.length() + s.length() <= longitudMax) {
    		cadena = s + cadena;
    	}
    }
    
    public int cuentaVocales() {
    	int numeroVocales=0;
    	for(int i=0; i<cadena.length(); i++) {
    		if(esVocal(cadena.charAt(i))==true) {
    			numeroVocales++;
    		}
    	}
    	return numeroVocales;
    }
    
    private boolean esVocal(char c) {
    	boolean resultado = false;
    	String vocales = "aeiouAEIOU";
    	if(vocales.indexOf(c)>=0) {
    		resultado = true;
    	}
		return resultado;
    }


public void mestraTexto() {
	System.out.println("Longitud maxima de la cadena: " +longitudMax+ "\n" + 
"Texto: " +cadena +"\n"+
"Fecha de Creacion:" +fechaCreacion+"\n"+
"Fecha y hora de modificacion: " +horaModificacion);
}
}
