
package org.generation;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CondicionalSwitch {

	public static void main(String[] args) {
		/**
		 * Sintaxis:
		 * 
		 * switch( expresión ){ case valor1 : expresión; break; case valor2 : expresión;
		 * break; case valor3,valor4 : expresión break; default: expresión; break; }
		 * 
		 * La expresión a evaluar debe ser un tipo entero, string o enum. La condicional
		 * Switch usa el método equals para comparar los Strings.
		 */

		int number = 2;
		String message;

		switch (number) {
		case 1:
			message = "Número uno";
			break;
		case 2:
			message = "Número dos";
			break;
		case 3, 4, 5, 6:
			message = "Número 3, 4 5 o 6";
			break;
		default:
			message = "Número diferente de 1 al 6";

		}
		System.out.println(message);

		/*
		 * Leer usando la clase Scanner un mes (1 - 12) e indicar el mes en texto. ej:
		 * entrada-> "Escribe tu mes de nacimiento: " 12 salida-> Naciste en diciembre.
		 * 
		 */
		File archivo = new File("src/org/generation/misDatos.txt");

		Scanner sc;
		try {
			sc = new Scanner(archivo);
			// Scanner sc =new Scanner (System.in);

			System.out.println("Escribe tu mes de nacimiento (1 - 12):  ");
			if (sc.hasNextInt()) {

				int month = sc.nextInt();
				sc.nextLine();

				String monthName;
				switch (month) {
				case 1:
					monthName = "Naciste en Enero";
					break;
				case 2:
					monthName = "Naciste en Febrero";
					break;
				case 3:
					monthName = "Naciste en Marzo: ";
					break;
				case 4:
					monthName = "Naciste en Abril";
					break;
				case 5:
					monthName = "Naciste en Mayo";
					break;
				case 6:
					monthName = "Naciste en Junio";
					break;
				case 7:
					monthName = "Naciste en Julio";
					break;
				case 8:
					monthName = "Naciste en Agosto";
					break;
				case 9:
					monthName = "Naciste en Septiembre";
					break;
				case 10:
					monthName = "Naciste en Octubre";
					break;
				case 11:
					monthName = "Naciste en Noviembre";
					break;
				case 12:
					monthName = "Naciste en Diciembre";
					break;

				default:
					monthName = "**Número de mes inválido**";
					break;

				} // case

				System.out.println("El mes es: " + monthName);
			} else {
				sc.nextLine();
				System.out.println("No introdujiste un número, vuelve a intentarlo");
			}

			sc.close();
		} // try
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
