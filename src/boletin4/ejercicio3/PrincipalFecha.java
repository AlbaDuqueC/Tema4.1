package boletin4.ejercicio3;

public class PrincipalFecha {

	public static void main(String[] args) {
		
		Fecha fecha= new Fecha (31,12,2023);
		
		System.out.println("Es bisiesto: "+ fecha.esBisiesto());
		System.out.println("Esta bien la fecha: "+ fecha.fechaCorrecta());
		
		fecha.diaSiguiente();
		System.out.println(fecha);

	}

}
