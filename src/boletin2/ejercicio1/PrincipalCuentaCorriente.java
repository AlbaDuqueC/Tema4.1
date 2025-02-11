package boletin2.ejercicio1;

public class PrincipalCuentaCorriente {

	public static void main(String[] args) {
		
		CuentaCorriente Cuenta1;
		CuentaCorriente Cuenta2;
		String DNI= "12345678M";
		double saldo= 1234;
		String nombre= "Pepe";
		String nacional="ESPAÑOLA";
		
		Cuenta1= new CuentaCorriente(DNI, saldo);
		Cuenta1=new CuentaCorriente(DNI, nombre, saldo);
		Cuenta1=new CuentaCorriente(DNI, nombre, saldo, nacional);
		
		if(Cuenta1.sacarDinero(234)) {
			System.out.println("Se pudo realizar la operacion");
			System.out.println("saldo actual: " + Cuenta1.getSaldo());
		}else {
			System.out.println("No se pudo realizar la operación");
			System.out.println("saldo actual: " + Cuenta1.getSaldo());
		}
		
		if(Cuenta1.ingresarDinero(234)) {
			System.out.println("Se pudo realizar la operacion");
			System.out.println("saldo actual: " + Cuenta1.getSaldo());
		}else {
			System.out.println("No se pudo realizar la operación");
			System.out.println("saldo actual: " + Cuenta1.getSaldo());
		}
		
		System.out.println(Cuenta1.toString());
		
		DNI= "12345678P";
		saldo= 1234;
		nombre= "Pepe";
		nacional="ESPAÑOLA";
		
		Cuenta2= new CuentaCorriente(DNI, saldo);
		Cuenta2=new CuentaCorriente(DNI, nombre, saldo);
		Cuenta2=new CuentaCorriente(DNI, nombre, saldo, nacional);
		
		if(Cuenta1.equals(Cuenta2)) {
			System.out.println("Es la misma cuenta");
		}else {
			System.out.println("Son diferentes cuentas");
		}

	}

}
