package main.java.sorter;

import java.util.List;

public class SortUtils {

	public SortUtils() {}
	
	
	public List<Integer> insertionSort(List<Integer> numbers){
		
		if(numbers!=null && !numbers.isEmpty()) {
			for(int i=0; i < numbers.size(); i++) {
				
				boolean posicionCorrecta = false;
				int posicionActual=i;
				while(!posicionCorrecta && posicionActual>0) {
					if(numbers.get(posicionActual-1)>numbers.get(posicionActual)) {
						int tmp = numbers.get(posicionActual);
						numbers.remove(posicionActual);
						numbers.add(posicionActual-1, tmp);
						posicionActual--;
					}else {
						posicionCorrecta=true;
					}
				}
			}
		}
		
		return numbers;
	}

}
