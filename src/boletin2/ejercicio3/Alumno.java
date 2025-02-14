package boletin2.ejercicio3;

public class Alumno {
	private String nombre;
	private double notaMedia;
	
	public Alumno (String nombre, double notaMedia) {
		
		this.nombre=nombre;
		this.notaMedia=notaMedia;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getNotaMedia() {
		return notaMedia;
	}

	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}
	
	public String toString (String nombre, double notaMedia) {
		String info;
		
		info=nombre + " "+ notaMedia;
		
		return info;
	}
	
	public boolean equals(Object obj) {
		
		Alumno alumno2= (Alumno) obj;
		boolean igual= false;
		
		if (this.nombre.equals(alumno2.nombre)) {
			igual=true;
		}
		return igual;
	
	}

}
