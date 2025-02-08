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
	public double getPVP () {
		double PVP;
		PVP= this.precio * getIva() * 0.01;
		return PVP;
		
	}
	public double getPVPDescuento(int descuento) {
		double precioDesc;
		precioDesc=  getPVP() *descuento *0.01;
		return precioDesc;
	}
	public boolean vender(int vendido) {
		boolean vender=false;
		if (vendido>0 && this.cuantosQuedan>=vendido) {
			vender=true;		
		}
		return vender;
		
	}
	public int almacenar (int almacenar) {
		int articulos;
		articulos= almacenar + this.cuantosQuedan;
		return articulos;
	}
	public String toString() {
		String info;
		info="Nombre: "+ this.nombre + ", Precio: "+ this.precio + ", Cuantas quedan: "+ this.cuantosQuedan ;
		return info;
	}

}