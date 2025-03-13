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
	 * Constructor de Empleado que inserta los siguientes parametrso para crear un
	 * empleado
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

	/**
	 * Constructor de Empleado que inserta los siguientes parametrso para crear un
	 * empleado.
	 * 
	 * @param dni
	 */
	public Empleado(String dni) {

		if (dni != null && !dni.isBlank()) {
			this.dni = dni;

		}
	}

	/**
	 * Get que devuelve un parametro al llamarlo
	 * 
	 * @return devuelve el dni del Empleado
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * Set que introduce el nuevo valor para el dni
	 * 
	 * @param dni
	 */
	public void setDni(String dni) {
		if (dni != null && !dni.isBlank()) {
			this.dni = dni;

		}
	}

	/**
	 * Get que devuelve un parametro al llamarlo
	 * 
	 * @return devuelve el nombre del empleado
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Set que introduce el nuevo valor para el nombre
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
	}

	/**
	 * Get que devuelve un parametro al llamarlo
	 * 
	 * @return devuelve el valor del sueldoBase de Empleados
	 */
	public double getSueldoBase() {
		return sueldoBase;
	}

	/**
	 * Set que introduce el nuevo valor para el sueldoBase
	 * 
	 * @param sueldoBase
	 */
	public void setSueldoBase(double sueldoBase) {
		if (sueldoBase > 0) {
			this.sueldoBase = sueldoBase;
		}
	}

	/**
	 * Get que devuelve un parametro al llamarlo
	 * 
	 * @return devuelve el valor de horaExtra de Empleado
	 */
	public int getHoraExtra() {
		return horaExtra;
	}

	/**
	 * Set que introduce el nuevo valor para la horas extras
	 * 
	 * @param horaExtra
	 */
	public void setHoraExtra(int horaExtra) {
		if (horaExtra >= 0) {
			this.horaExtra = horaExtra;
		}
	}

	/**
	 * Get que devuelve un parametro al llamarlo
	 * 
	 * @return devuelve el valor de importeHoraExtra de Empleado
	 */
	public static int getImporteHoraExtra() {
		return importeHoraExtra;
	}

	/**
	 * Set que introduce el nuevo valor para la el importe por hora extra
	 * 
	 * @param importe
	 */
	public static void setImporteHoraExtra(int importe) {
		if (importe > 0) {
			importeHoraExtra = importe;
		}
	}

	/**
	 * Esta funcion es la que calcula el valor de total del importe por todas las
	 * horas extras realizadas
	 * 
	 * @return devuelve el valor calculado de el total de importe de horas extras
	 */
	public double calcularComplemento() {
		return this.horaExtra * importeHoraExtra;
	}

	public double sueldoBruto() {
		return this.sueldoBase + calcularComplemento();
	}

	/**
	 * Esta funcion devolvera todos los datos del empleado
	 * 
	 * @return devuelve los datos del empleado
	 */
	@Override
	public String toString() {
		return this.dni + " " + this.nombre + " \n Horas Extras: " + this.horaExtra + " \n Sueldo bruto: "
				+ sueldoBruto();
	}

	/**
	 * @return devuelve la clave primaria de 
	 */
	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object o) {
		boolean igual = false;

		Empleado emp = (Empleado) o;

		if (this.dni.equals(emp.getDni())) {
			igual = true;
		}
		return igual;
	}

}
