package compit;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class MainApp {


	private static final String SEPARADOR = "____________________________";

	public static void main(String[] args) {
		
		
		Equipo equipo = new Equipo();
		equipo.cargarMuestraPersonas();		
		
		iterarColecciones(equipo);
		
		ordenarPersonas(equipo);
		ordenarVariosCriterios(equipo);
	}
	
	
	private static void ordenarPersonas(Equipo equipo) {
		List<Persona> listaPersonas = equipo.getPersonas();
		
		listaPersonas.sort(new ComparadorPorDNI());
		
		System.out.println(SEPARADOR);
		System.out.println("   Impresión ordenada: ");
		for(Persona p : listaPersonas) {
			System.out.println(p);
		}
		
	}
	

	private static void ordenarVariosCriterios(Equipo equipo) {
		List<Persona> listaPersonas = equipo.getPersonas();
		
		listaPersonas.sort(new ComparadorPorDNI()
								.thenComparing(new ComparadorFechaNacimiento()));
		
		System.out.println(SEPARADOR);
		System.out.println("   Impresión ordenada por varios criterios: ");
		for(Persona p : listaPersonas) {
			System.out.println(p);
		}
				
	}
	
	private static void iterarColecciones(Equipo equipo) {
		// Iterador en un conjunto de elementos
		List<Persona> listaPersonas = equipo.getPersonas();
		Iterator iteratorLista = listaPersonas.iterator();
		
		System.out.println(SEPARADOR);
		System.out.println("   Iteración de lista: ");
		while(iteratorLista.hasNext()) {
			System.out.println(iteratorLista.next());
		}
		
		
		System.out.println(SEPARADOR);
		System.out.println("   Iteración de conjunto: ");
		// Iterador en un conjunto de elementos
		Set<Persona> conjuntoPersonas = new HashSet<>(equipo.getPersonas());
		Iterator iteratorSet = conjuntoPersonas.iterator();
		
		while(iteratorSet.hasNext()) {
			System.out.println(iteratorSet.next());
		}
		
	}

}
