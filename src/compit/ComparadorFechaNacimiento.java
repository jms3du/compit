package compit;

import java.util.Comparator;

public class ComparadorFechaNacimiento implements Comparator<Persona> {

	public ComparadorFechaNacimiento() {
	}

	@Override
	public int compare(Persona o1, Persona o2) {
		return o1.getFechaNacimiento().compareTo(o2.getFechaNacimiento());
	}

}
