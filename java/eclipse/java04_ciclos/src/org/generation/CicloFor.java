package org.generation;

public class CicloFor {

	public static void main(String[] args) {
		/**
		 * Sintaxis:
		 * 
		 * for( expresion_inicial ; comparacion; expresion_final) instrucción;
		 * 
		 * for( expresion_inicial ; comparacion; expresion_final){ instrucciones; }
		 * 
		 */

		for (int iteracion = 1; iteracion < 6; iteracion++) {
			System.out.println("Núm. Iteración: " + iteracion++);
		} // 1,3,5

		int iteracion = 1;
		for (;;) {
			if (iteracion > 5)
				break;
			System.out.println("Núm. Iteración: " + iteracion++);
		}

		System.out.println("Valor final de iteracion: " + iteracion);

		// Cuántas veces se ejecuta la línea 19? 1,2,3,4,5
		// Valor final de línea 23? 6

		// Tabla de multiplicación del 1 al 10
		principal: // <- tags
		for (int i = 1; i <= 5; i++) {// tablas del 1-5

			secundario: // etiquetas
			for (int j = 1; j <= 10; j++) { // 0-10
				System.out.println(i + " * " + j + " = " + (i * j)); // hasta aqui imprime la tabla del 1 al 5 completas
				if (j >= 7)
					break secundario; // solo hasta el x7, ya no llega al x10 en ninguna
				if (j >= 7)
					break principal; // solo imprime la tabla del 1 hasta el x7
			}

		}
		// Uso de Continue
		// Se usa para saltar la iteración actual del bucle y
		// continuar a la siguiente iteración.

		// Imprimir los números impares del 1 al 20 (incluyendo el 20 en la iteración)

		/*
		 * Escribir un programa que muestre en pantalla los números del 1 al 20,
		 * sustituyendo los múltiplos de 3 por la palabra “fizz”, los múltiplos de 5 por
		 * la palabra "buzz" los múltiplos de ambos por la palabra "fizzbuzz", es decir,
		 * los múltiplos de 3 y 5,
		 * 
		 * 
		 * 1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz 16 17 fizz 19 buzz
		 * 
		 */
		int fin = 20;

		for (int i = 1; i <= fin; i++ ) {
			
			if ( i % 3 == 0 && i % 5 == 0 ) {
				System.out.println("fizzbuz");
			} else if ( i % 3 == 0 ) {
				System.out.println("fizz");
			} else if ( i % 5 == 0 ) {
				System.out.println("buzz");
			} else {
				System.out.println(i);
			}
		}

	}
}
