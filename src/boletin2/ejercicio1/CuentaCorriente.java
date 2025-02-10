package boletin2.ejercicio1;

public class CuentaCorriente {
	
	private String DNI;
	private String nombre;
	private double saldo;
	
	private enum nacionalidad{
		ESPAÑOLA, EXTRANJERA
	}
	
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public CuentaCorriente (String DNI,double saldo) {
		this.DNI= DNI;
		this.saldo=saldo;
	}
	public CuentaCorriente (String DNI,String nombre,double saldo) {
		this.DNI= DNI;
		this.nombre=nombre;
		this.saldo=saldo;
	}
	public CuentaCorriente (String DNI,String nombre,double saldo, enum nacionalidad) {
		this.DNI= DNI;
		this.nombre=nombre;
		this.saldo=saldo;
		
	}

}
