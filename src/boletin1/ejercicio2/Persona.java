package boletin1.ejercicio2;

public class Persona {

	private String dni;
	String nombre;
	private String apellido;
	private int edad;

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if (nombre != null) {
			this.nombre = nombre;
		}
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Persona(String dni, String nombre, String apellido, int edad) {

		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	
	public boolean esMayorEdad() {
		
		boolean si=false;
		if (this.edad >=18) {
			si=true;
		}
		return si;
		
	}
	public boolean esJubilado() {
		
		boolean jubileta=false;
		
		if (this.edad>=65 ) {
			jubileta=true;
		}
		
		return jubileta;
		
	}
	
	public int diferenciaEdad(Persona p) {
		int diferencia;
		
		diferencia= Math.abs(this.edad - p.edad);
		
		return diferencia;
	}
	public String toString() {
		String info;
		info="DNI: "+ this.dni + ", Nombre: "+ this.nombre + " , Apellido: "+ this.apellido +" , Edad: " + this.edad;
		return info;
	}
	
	

}
