package boletin2.ejercicio1;

public class CuentaCorriente {

	private String DNI;
	private String nombre;
	private double saldo;

	private enum Nacionalidad {
		ESPAÑOLA, EXTRANJERA
	}

	private Nacionalidad nacional = Nacionalidad.EXTRANJERA;

	public CuentaCorriente(String DNI, double saldo) {
		if (DNI != null && !DNI.isBlank()) {
			this.DNI = DNI;
		}

		if (saldo > 0) {
			this.saldo = saldo;
		}
	}

	public CuentaCorriente(String DNI, String nombre, double saldo) {
		if (DNI != null && !DNI.isBlank()) {
			this.DNI = DNI;
		}
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
		if (saldo > 0) {
			this.saldo = saldo;
		}

	}

	public CuentaCorriente(String DNI, String nombre, double saldo, String nacional) {
		if (DNI != null && !DNI.isBlank()) {
			this.DNI = DNI;
		}

		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}

		if (saldo > 0) {
			this.saldo = saldo;
		}

		switch (nacional) {
		case "ESPAÑOLA" -> {
			this.nacional = Nacionalidad.ESPAÑOLA;
		}
		}

	}

	public String getDNI() {

		return DNI;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {

		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean sacarDinero(double extraer) {

		boolean poder = false;
		if (this.saldo >= extraer) {
			poder = true;
			this.saldo -= extraer;
		}

		return poder;
	}

	public boolean ingresarDinero(double ingresar) {
		boolean poder = false;
		if (ingresar > 0) {
			poder = true;
			this.saldo += ingresar;
		}
		return poder;
	}

	public String toString() {
		String info = "";

		info += "DNI: " + this.DNI;
		info += ", Nombre: " + this.nombre;
		info += ", Saldo: " + this.saldo;
		info += ", Nacional: " + this.nacional;

		return info;
	}

	public boolean equals(Object obj) {
		CuentaCorriente cuenta2 = (CuentaCorriente) obj;
		boolean igual = false;

		if (DNI.equalsIgnoreCase(cuenta2.DNI) && nombre.equalsIgnoreCase(cuenta2.nombre)) {
			igual = true;
		}

		return igual;
	}

}
