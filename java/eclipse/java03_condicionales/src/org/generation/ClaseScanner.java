package org.generation;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ClaseScanner {

	public static void main(String[] args) {
		/*
		 * La clase Scanner en Java es una clase útil 
		 * que se encuentra en el paquete java.util 
		 * y se utiliza para leer la entrada de varios 
		 * orígenes, como la entrada estándar (teclado)
		 * , archivos, cadenas, etc
		 */
		Scanner sc;
		sc = new Scanner (System.in );
		
		System.out.println("Escribe tu nombre");
		
		/*
		 * lee una línea completa de entrada como cadena de texto.
		 * Devuelve todo el texto de la línea, excluyendo el
		 * carácter de salto de línea(\n).
		 * 
		 * Buffer: Memoria temporal donde se almacenan los datos
		 * de entrada antes de ser procesados.
		 */
        String name = sc.nextLine(); // "Sergio Torres \n"
		//Preguntar nombre de mascota y mostrar con Syso
        
        System.out.println("¿Cómo se llama tu mascota? ");
		String pet = sc.nextLine();
        
        System.out.println("Mi nombre es " + name);
        System.out.println("Mi mascota es " + pet);
		
		// Preguntar número de suerte 
		System.out.println("Dime tu numero de suerte entre el 1 y 10: ");
		
		//Verificar que haya un valor entero en el bufer
		if (sc.hasNextInt() ) {
			int luckyNumber = sc.nextInt(); // lee un valor entero del buffer
			sc.nextLine(); // Consumir el salto de línea pendiente
			
			if( luckyNumber >= 1 && luckyNumber <= 10 ) {
				System.out.println("Felicidades, también me gusta el " + luckyNumber);
			} else {
				System.out.println("Cámarada, te pedí del 1 al 10");
			}
			
		} else {
			System.out.println("Lo siento, no introdujiste un número");
			sc.nextLine(); // consumir todo lo que esté en el buffer
		}
		 
		//String luckyNumberStr = sc.nextLine (); //1er ejemplo
		//int luckyNumber = sc.nextInt(); // Lee un valor entero del buffer //2do ejemmplo
		//sc.nextLine(); //consumir un salto de línea pendiente
		
		//int luckyNumber = Integer.parseInt(luckyNumberStr);
		//if( luckyNumber >= 1 && luckyNumber <= 10 ) {
		//	System.out.println("Felicidades, también me gusta el " + luckyNumber);
		//} else {
			//System.out.println("Cámarada, te pedí del 1 al 10");
		}
		//System.out.println ("¿Tu tamal favorito es? : ");
		//String tamalName = sc.nextLine();
		//System.out.println("También me gusta el tamal de " + tamalName);
	
		
		
		
		//sc.close(); // liberar los recursos que se utilizaron.
		

	}


