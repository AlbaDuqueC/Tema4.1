package boletin1.ejercicio4;

public class Articulo {

	private String nombre;
	private double precio;
	public static final int IVA = 21;
	private int cuantosQuedan;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		if (precio > 0) {
			this.precio = precio;

		}
	}

	public int getCuantosQuedan() {
		return cuantosQuedan;
	}

	public void setCuantosQuedan(int cuantosQuedan) {
		if (precio >= 0) {
			this.cuantosQuedan = cuantosQuedan;
		}
	}

	public static int getIva() {
		return IVA;
	}

	public Articulo(String nombre, double precio, int IVA, int cuantosQuedan) {

		this.nombre = nombre;

		if (precio > 0) {

			this.precio = precio;

		}

		if (precio >= 0) {

			this.cuantosQuedan = cuantosQuedan;
		}

	}

}