package compit;

import java.time.LocalDate;

public class Persona {

	private String nombre;
	private String apellido;
	private LocalDate fechaNacimiento;
	private String dni;
	
	
	
	public Persona() {
		super();
	}



	public Persona(String nombre, String apellido, LocalDate fechaNacimiento, String dni) {
		this();
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.dni = dni;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}



	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}



	public String getDni() {
		return dni;
	}



	public void setDni(String dni) {
		this.dni = dni;
	}



	@Override
	public String toString() {
		return "Me llamo " + nombre 
				+ " " + apellido 
				+ ", nací el " + fechaNacimiento
				+ " y mi dni es: " + dni;
	}

}
