package Examen;

import java.util.Scanner;

public class PrincipalEmpleado {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		Empleado empleado;
		
		int selec;
		
		String dni;
		int horaExtra;
		int imporHE;
		
		do {
		
		System.out.println("-------------------");
		menu();
		System.out.println("-------------------");
		
		System.out.print("Selecciona una opcion: ");
		selec= sc.nextInt();
		System.out.println();
		sc.nextLine();
		
		switch (selec) {
		
		case 1 -> {
			System.out.println("-------------------");
			
			empleado= añadirEmpleado();
			
			if(ListadoEmpleados.añadirEmpleado(empleado)) {
				
				System.out.println("Se ha añadido el nuevo empleado con exito");
				
			}else {
				System.out.println("No se puedo añadir el nuevo empleado");
				
			}
			System.out.println("-------------------");
		}
		case 2 ->{
			System.out.println("-------------------"); 
			ListadoEmpleados.listarEmpleados();
			System.out.println("-------------------");
		} 
		
		case 3 -> {

			System.out.println("-------------------");
			System.out.println("Introduce el dni del empleado: ");
			dni=sc.nextLine(); 
			empleado=new Empleado(dni);
			
			System.out.println("Introduce las horas extras: ");
			horaExtra=sc.nextInt();
			
			if (ListadoEmpleados.modificarHoraExtra(empleado, horaExtra)) {
				
				System.out.println("Se ha modificado con exito, ole ole los caracoles");
				
			}else {
				System.out.println("No se pudo modificar, memato");
				
			}
			System.out.println("-------------------");
			
		}
		case 4->{
			System.out.println("-------------------");
			System.out.println("Introduzca el importe por hora extra: ");
			imporHE= sc.nextInt();
			
			if (ListadoEmpleados.modificarImportHE(imporHE)) {
				System.out.println("Se ha modificado con exito, ole ole los caracoles");
			}else {
				System.out.println("No se pudo modificar, memato");
			}
			System.out.println("-------------------");
		}
		case 5->{
			
			System.out.println("-------------------");
			System.out.println("Introduce el dni del empleado: ");
			dni=sc.nextLine();
			empleado=new Empleado(dni);
			if(ListadoEmpleados.eliminarEmpleado(empleado)) {
				System.out.println("ole ole los caracoles");
			}else {
				System.out.println("me pego un tiro");
			}
			System.out.println("-------------------");
			
		}
		case 0 -> {
			System.out.println("-------------------");
			System.out.println("ADIO");
			System.out.println("-------------------");
		}
		
		
		}
		
		}while(selec!=0);
		
		
	}

	public static void menu() {

		System.out.println("1. Añadir empleado.");
		System.out.println("2. Listar empleados.");
		System.out.println("3. Modificar horas extra.");
		System.out.println("4. Modificar importe horas extra.");
		System.out.println("5. Eliminar empleado.");
		System.out.println("0. Salir.");

	}

	public static Empleado añadirEmpleado() {
		Empleado empleado;

		String dni;

		String nombre;

		double sueldo;

		int hora;

		System.out.print("DNI: ");
		dni = sc.nextLine();
		System.out.println();
		System.out.print("Nombre: ");
		nombre = sc.nextLine();
		System.out.println();
		System.out.print("SueldoBase: ");
		sueldo = sc.nextDouble();
		System.out.println();
		System.out.print("horas extras: ");
		hora = sc.nextInt();
		System.out.println();

		empleado = new Empleado(dni, nombre, sueldo, hora);
		
		return empleado;
		
	}
	
	

}
