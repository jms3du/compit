package compit;

import java.util.Comparator;

public class ComparadorPorDNI implements Comparator<Persona> {

	public ComparadorPorDNI() {
		super();
	}

	@Override
	public int compare(Persona o1, Persona o2) {
	
		return o1.getDni().compareTo(o2.getDni());
	}

}
