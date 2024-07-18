package com.bbva.sucursal;

import java.util.ArrayList;
import com.bbva.encapsulado.Atm;

public class SucursalTest {

	public static void main(String[] args) {
	
		// Realizar un ArrayList con 5 Atm
		ArrayList<Atm> cajeros = new ArrayList<>();
		cajeros.add( new Atm("GT23", 50_000) );//0
		cajeros.add( new Atm("GT23", 50_000) );//1
		cajeros.add( new Atm("GT23", 50_000) );//2
		cajeros.add( new Atm("GT25", 50_000) );//3
		cajeros.add( new Atm("GT25", 50_000) );//4
		
		//Mostrar los datos del Atm indice 2 de la colección
		//Núm Serie, Amount, Modelo
		//cajeros.get(2).serialNumber; //no podemos acceder por que es privada la clase seralNumber
		System.out.println(cajeros.get(2).getModel());
		System.out.println(cajeros.get(2).getAmount());
		System.out.println(cajeros.get(2).getSerialNumber());
		
		//Mostrar el núm total de cajeros
		System.out.println("ATMs: " + Atm.getcounter());
		
		// Agregar un Atm con valores por default
		Atm cajeroDefault = new Atm();
		cajeros.add( cajeroDefault ); // index 5
				cajeros.add( new Atm() ); // index 5
				System.out.println("==== index 5 ======");
				System.out.println( cajeros.get(5).getModel() );//T-800
				System.out.println( cajeros.get(5).getAmount() );//1000
				System.out.println( cajeros.get(5).getSerialNumber() );//6
				
				cajeros.get(5).setAmount(2_000_000);
				
				//String newAmount = "800000";
				//double newAmountDouble = Double.parseDouble(newAmount);
				cajeros.get(5).setAmount("800000");
				System.out.println(cajeros.get(5).getAmount());
				
				
	}

}
