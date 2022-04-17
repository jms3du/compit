package compit;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Equipo {
	
	private List<Persona> personas;

	public Equipo() {
		personas= new ArrayList<>();
	}
	
	
	public void addPersona(Persona p) {
		this.personas.add(p);
	}
	
	public void cargarMuestraPersonas() {
		personas.add(new Persona("Juan M", "González", LocalDate.of(2000, 2, 2), "31313131K"));
		personas.add(new Persona("María", "Gómez", LocalDate.of(1990, 2, 2), "22222222Y"));
		personas.add(new Persona("Manuel", "López", LocalDate.of(1992, 2, 2), "22222222Y"));
		personas.add(new Persona("Manuel", "Rueda", LocalDate.of(1991, 2, 2), "22222222Y"));
		personas.add(new Persona("Ernesto", "Sevilla", LocalDate.of(1980, 2, 2), "31000031K"));
		personas.add(new Persona("Lorenzo", "Morales", LocalDate.of(1970, 2, 2), "00003131K"));
	}


	public List<Persona> getPersonas() {
		return personas;
	}

}
