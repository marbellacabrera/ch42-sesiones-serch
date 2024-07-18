package org.generation;

//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.List;
import java.util.*;

public class HashSetConceptos {

	public static void main(String[] args) {
		
		/*
		 * Una colección de tipo set es una colección NO ordenada.
		 *  - No se permiten elementos duplicados
		 *  - cualquier elemento duplicado no se insertará
		 *  
		 *  Sintaxis:
		 *    HashSet<Object> varName = new HashSet<>();
		 */
		//Definir una colección de nombre de países con hashSet(String)
		HashSet<String> paises = new HashSet<>();
		
		// Agregamos valores con add ()
		paises.add("Japón"); 
		paises.add("Colombia"); 
		paises.add("Suecia"); 
		paises.add("Canadá"); 
		paises.add("Alemania"); 
		paises.add("Reino Unido");
		paises.add("Genovia");
		paises.add("Narnia");
		paises.add("Wakanda");
		
		//Los elementos duplicadaos no se insertan 
		
		paises.add("Colombia");//Maricela
		paises.add("Japón");//Arantxa
		
		System.out.println(paises);
		
		// Verificar si el elemento se insertó
				System.out.println("Es insertado: " + paises.add("Nueva Zelanda"));
				System.out.println("Es insertado: " + paises.add("Wakanda"));
				
				// Obtenemos el tamaño de la colección con size()
				System.out.println("Núm. paises: " + paises.size()); // 10
				
				// Verificar si existe un elemento con contains()
				System.out.println("Existe Narnia: " + paises.contains("Narnia"));//true
				
				//Remover un elementocon remove()
				System.out.println("Eliminado Wakanda? " + paises.remove("Wakanda"));
				System.out.println("Eliminado USA? " + paises.remove("USA"));
	//Iterar la colección
				for( String pais : paises) {
					System.out.println(pais);
				}
				
				// Crear una colección de 15 elementos de String
				//Duplica por lo menos 5 elementos 
				
				//Muestra solo los elementos únicos 
				
				//Paso 1: Crear un Array List de String de Dulces
				
				//Paso 2: Agregar nombres de dulces, repetir por lo menos 5
				
				//Paso 3: Crear una colección Hash Set
				
				// Paso 4: Iterar los elementos del Array List
		        // Insertar los elementos del Array List en el Hash Set
		
		// PAso 5: Imprimir el núm de elementos del HashSet
		//         Imprimir los elementos del HashSet
				
				ArrayList<String> dulces= new ArrayList<>();
				dulces.add("chocoretas");
				dulces.add("tamarindo");
				dulces.add("mazapan");
				dulces.add("tinitas");
				dulces.add("obleas");
				dulces.add("dulce de leche");
				dulces.add("tarugos");
				dulces.add("pasitascon chocolate");
				dulces.add("cocadas");
				dulces.add("cahetadas");

				//Los elementos duplicadaos  
					
				dulces.add("chocoretas");
				dulces.add("pasitas con chocolate");
				dulces.add("cocadas");
				dulces.add("tarugos");
				dulces.add("obleas");
				
				System.out.println(dulces);
				
			
	 //---------------------------------------------
    //------------------Personas en Materias---------------------------
				
				Persona diana = new Persona("Diana Laura");
				Persona desire = new Persona("Desire García");
				Persona arlette = new Persona("Arlette Miranda");
				Persona arantxa = new Persona("Arantxa Vázquez");
				Persona emma = new Persona("Emma Gaxiola");
				Persona brenda = new Persona("Brenda Morán");
				Persona jaqui = new Persona("Jaqueline Torres");
				
				HashSet<Persona> alumnas = new HashSet<>(
						List.of(diana, desire, arlette, arantxa, 
								emma, brenda, jaqui)
						);
				
				ArrayList<Persona> materiaFotografia = new ArrayList<>( 
						List.of(desire, arlette, emma, brenda) 
						);
				
				ArrayList<Persona> materiaQuimica = new ArrayList<>( 
						List.of(diana, jaqui ) 
						);
				
				ArrayList<Persona> materiaMusica = new ArrayList<>( 
						List.of( emma, diana, brenda, arlette ) 
						);
				
				// Qué personas de mi escuela tengo inscritas
				// en Fotografía y Música? 5 personas
				// desire, arlette, emma, brenda, diana
				HashSet<Persona> personaFotoYMusic = new HashSet<>();
				personaFotoYMusic.addAll( materiaFotografia );
				personaFotoYMusic.addAll( materiaMusica );
				
				System.out.println("Núm Personas en Foto y Music: " +
				personaFotoYMusic.size() ); // 5
				System.out.println( personaFotoYMusic );
				
				// Buscar las personas que no están inscritas
				// en música y fotografía
				ArrayList<Persona> noInscritas = new ArrayList<>();
				
				for (Persona persona : alumnas ) {
					if(  !personaFotoYMusic.contains(persona) ) {
						noInscritas.add(persona);
					}			
				}
				
				System.out.println("Núm no inscritas: " + noInscritas.size());
				System.out.println( noInscritas );
				
				
	}

}
