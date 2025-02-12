package boletin2.ejercicio2;

public class Libro {

	private String titulo;
	private String autor;
	private int ejemplares;
	private int ejemplaresPrestados;

	private enum Genero {
		Narrativo, Lírico, Dramático, Didáctico, Poético
	}

	private Genero genero = Genero.Narrativo;

	public Libro(String titulo, String autor) {

		if (titulo != null && !titulo.isBlank()) {
			this.titulo = titulo;
		}

		if (autor != null && !autor.isBlank()) {
			this.autor = autor;
		}
	}

	public Libro(String titulo, String autor, int ejemplares, int ejemplaresPrestados) {

		if (titulo != null && !titulo.isBlank()) {
			this.titulo = titulo;
		}

		if (autor != null && !autor.isBlank()) {
			this.autor = autor;
		}

		if (ejemplares > 0) {
			this.ejemplares = ejemplares;
		}

		if (ejemplaresPrestados >= 0) {
			this.ejemplaresPrestados = ejemplaresPrestados;
		}
	}

	public Libro(String titulo, String autor, int ejemplares, int ejemplaresPrestados, String genero) {

		if (titulo != null && !titulo.isBlank()) {
			this.titulo = titulo;
		}

		if (autor != null && !autor.isBlank()) {
			this.autor = autor;
		}

		if (ejemplares > 0) {
			this.ejemplares = ejemplares;
		}

		if (ejemplaresPrestados >= 0) {
			this.ejemplaresPrestados = ejemplaresPrestados;
		}

		switch (genero) {

		case "Lírico" -> {
			this.genero = Genero.Lírico;
		}

		case "Dramático" -> {
			this.genero = Genero.Dramático;
		}

		case "Didáctico" -> {
			this.genero = Genero.Didáctico;
		}

		case "Poético" -> {
			this.genero = Genero.Poético;
		}
		}
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getEjemplares() {
		return ejemplares;
	}

	public void setEjemplares(int ejemplares) {
		this.ejemplares = ejemplares;
	}

	public int getEjemplaresPrestados() {
		return ejemplaresPrestados;
	}

	public void setEjemplaresPrestados(int ejemplaresPrestados) {
		this.ejemplaresPrestados = ejemplaresPrestados;
	}

	public boolean prestamo(int prestados) {
		boolean prestar = false;

		if (this.ejemplares >= prestados) {

			prestar = true;

			this.ejemplaresPrestados += prestados;
			this.ejemplares -= prestados;
		}

		return prestar;
	}

	public boolean devolucion(int devolver, String titulo) {
		boolean devolucion = false;

		if (devolver <= this.ejemplaresPrestados && this.titulo == titulo) {
			devolucion = true;

			this.ejemplaresPrestados -= devolver;
			this.ejemplares += devolver;
		}

		return devolucion;
	}

	public String toString() {
		String info = "";

		info += "Título: " + this.titulo + " Autores: " + this.autor + " Ejemplares: " + this.ejemplares
				+ " Ejemplares prestados: " + this.ejemplaresPrestados;

		return info;
	}

	public boolean equals (Object obj) {
		
		Libro libro2 = (Libro) obj;
		
		boolean igual = false;

		if (titulo.equalsIgnoreCase(libro2.titulo) && autor.equalsIgnoreCase(libro2.autor)) {
			igual = true;
		}
		
		return igual;
	}

}
