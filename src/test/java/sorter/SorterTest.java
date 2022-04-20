package test.java.sorter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import main.java.sorter.SortUtils;

class SorterTest {

	
	@MethodSource("argumentos")
	@ParameterizedTest
	void testInsertionSort(List<Integer> lista) {

		new SortUtils().insertionSort(lista);
		
		for(int i=0; i < lista.size()-1; i++) {
			if(lista.get(i)>lista.get(i+1)) {
				assert(false);
			}
		}
	}
	
	
	
	private static Stream<List<Integer>> argumentos(){
		
		return Stream.of(
				new ArrayList<>(), 										//Lista vacía n=0
				new ArrayList<>(Arrays.asList(20)), 					//Lista único elemento n=1
				new ArrayList<>(Arrays.asList(20, 20, 20)),				//Lista valores repetidos n=3
				new ArrayList<>(Arrays.asList(3, 1, 10, 7, 2, 5, 8)),	//Lista tamaño fijo n=7
				crearListaAleatoria()); 								//Lista aleatoria n=x
	}
	
	
	private static List<Integer> crearListaAleatoria(){
		List<Integer> listaLongitudAleatoria = new ArrayList<>();
		int cantidad = getRandomNumber();
		for(int i=0; i<cantidad; i++) {
			listaLongitudAleatoria.add(getRandomNumber());
		}
		return listaLongitudAleatoria;
	}
	
	
	private static int getRandomNumber() {
		return ThreadLocalRandom.current().nextInt(50, 100);
	}

}
