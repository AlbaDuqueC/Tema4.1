package boletin1.ejercicio2;

import java.util.Scanner;

public class PrincipalPersona {

	public static void main(String[] args) {
		Persona per1;
		Persona per2;

		Scanner sc = new Scanner(System.in);

		String dni;
		String nombre;
		String apellido;
		int edad;

		System.out.println("Persona 1:");
		
		System.out.println("dni:");
		dni = sc.next();
		
		System.out.println("nombre:");
		nombre = sc.next();
		
		System.out.println("apellido:");
		apellido = sc.next();
		
		System.out.println("edad:");
		edad = sc.nextInt();

		per1 = new Persona(dni, nombre, apellido, edad);

		System.out.println("Persona 2:");
		
		System.out.println("dni:");
		dni = sc.next();
		
		System.out.println("nombre:");
		nombre = sc.next();
		
		System.out.println("apellido:");
		apellido = sc.next();
		
		System.out.println("edad:");
		edad = sc.nextInt();

		per2 = new Persona(dni, nombre, apellido, edad);

		if (per1.getEdad() > per2.getEdad()) {
			
			System.out.println(per1.getNombre() + " " + per1.getApellido() + " con dni " + per1.getDni()
					+ " es mayor que " + per2.getNombre() + " " + per2.getApellido() + " con dni " + per2.getDni());
			
		} else if (per1.getEdad() < per2.getEdad()) {
			
			System.out.println(per1.getNombre() + " " + per1.getApellido() + " con dni " + per1.getDni()
					+ " es menor que " + per2.getNombre() + " " + per2.getApellido() + " con dni " + per2.getDni());
			
		} else {
			
			System.out.println(per1.getNombre() + " " + per1.getApellido() + " con dni " + per1.getDni()
					+ " es de la misma edad que " + per2.getNombre() + " " + per2.getApellido() + " con dni "
					+ per2.getDni());
			
		}
		
		if(per1.esMayorEdad()) {
			System.out.println("Es mayor de edad");
			
			if(per1.esJubilado()) {
				System.out.println("Es jubileta");
			}
		}else {
			System.out.println("Es menor de edad");
		}
	}

}