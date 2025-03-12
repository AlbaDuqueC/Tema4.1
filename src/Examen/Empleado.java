package Examen;

import java.util.Objects;

/**
 * Clase empleado la cual guarda dni, nombre, suldoBase, horaExtra y el valor
 * estatico IMPORTE_HORA_EXTRA
 * 
 * @author albad
 * 
 */
public class Empleado {

	/**
	 * dni del empleado
	 */
	private String dni;
	/**
	 * nombre del empleado
	 */
	private String nombre;
	/**
	 * sueldo base del empleado
	 */
	private double sueldoBase;
	/**
	 * hora extra que ha realizado el empleado
	 */
	private int horaExtra; // reañizada durante el mes
	/**
	 * valor statico del importe que dan por cada hora extra realizada
	 */
	private static int importeHoraExtra = 10;

	/**
	 * Constructor de Empleado que
	 * 
	 * @param dni
	 * @param nombre
	 * @param sueldo
	 * @param h
	 */
	public Empleado(String dni, String nombre, double sueldo, int h) {

		if (dni != null && !dni.isBlank()) {
			this.dni = dni;

		}
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}

		if (sueldo > 0) {
			this.sueldoBase = sueldo;
		}

		if (h >= 0) {
			this.horaExtra = h;
		}

	}

	public Empleado(String dni) {
		
		if (dni != null && !dni.isBlank()) {
			this.dni = dni;

		}
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		if (dni != null && !dni.isBlank()) {
			this.dni = dni;

		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
	}

	public double getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(double sueldoBase) {
		if (sueldoBase > 0) {
			this.sueldoBase = sueldoBase;
		}
	}

	public int getHoraExtra() {
		return horaExtra;
	}

	public void setHoraExtra(int horaExtra) {
		if (horaExtra >= 0) {
			this.horaExtra = horaExtra;
		}
	}

	public static int getImporteHoraExtra() {
		return importeHoraExtra;
	}

	public static void setImporteHoraExtra(int importe) {
		if(importe>0) {
		importeHoraExtra = importe;
		}
	}

	public double calcularComplemento() {
		return this.horaExtra * importeHoraExtra;
	}

	public double sueldoBruto() {
		return this.sueldoBase + calcularComplemento();
	}

	@Override
	/**
	 * 
	 */
	public String toString() {
		return this.dni + " " + this.nombre + " \n Horas Extras: " + this.horaExtra + " \n Sueldo bruto: "
				+ sueldoBruto();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object o) {
		boolean igual = false;
		if (String.valueOf(this.dni).equals(o)) {
			igual = true;
		}
		return igual;
	}

}
