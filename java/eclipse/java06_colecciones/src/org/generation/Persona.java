package org.generation;

public class Persona { //clase + llave de apertura

	//Atributos no-static (atributo de instancia)
	String nombre; // atributo de instancia o atributo no estatico
	
	// atributos static (atributos de clase)
	static String tipo;
	
	/*
	 * Regla de constructores:
	 *  - Debe tener el mismo nombre de la clase
	 *  - No debe tener nigún tipo de retorno
	 *  - Cuando no se agrega algún constructor Java agrega el default 
	 *  - Si agregas un constructor y requieres el default, debes agregarlo
	 */
	Persona (String nombrePersona){
		nombre = nombrePersona;
	}
	
	Persona(){
		//Constructor Default --para que siga funcioanando
	}
	
	
	//Método sin retorno
	void saludar(String nombrePersonaASaludar) { //método de saludar + llave de apertura fuera del metodo pero dntro de la clase 
		//System.out.println("Hola " + nombrePersonaASaludar);
		String nombreEnMayuscula = nombrePersonaASaludar.toUpperCase(); //variables locales
	//	return; //es valido pero si no retorna nada no es necesario agregar la palabra return
		System.out.println(nombre  + " Hola  " + nombrePersonaASaludar );		
	}
	
	@Override
	public String toString() {
		return "Soy " + nombre;
	}
	
}
