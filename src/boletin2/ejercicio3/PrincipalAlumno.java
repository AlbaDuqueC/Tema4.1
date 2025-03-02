package boletin2.ejercicio3;

import java.util.Scanner;

public class PrincipalAlumno {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		

		Alumno alumno;

		String nombre;
		double notaMedia;

		int opcion;

		do {

			System.out.println("-------------------------------");
			System.out.println("1. Listado.");
			System.out.println("2. Nuevo Alumno.");
			System.out.println("3. Modificar.");
			System.out.println("4. Borrar.");
			System.out.println("5. Salir.");

			opcion = sc.nextInt();

			switch (opcion) {
			case 1 -> {

				AlumnoCrud.Listado();
			}
			case 2 -> {
				alumno = creaAlumno();
				AlumnoCrud.NuevoAlumno(alumno);

			}
			case 3 -> {

				nombre = pedirNombre();
				System.out.println("Introduce la nueva media");
				notaMedia = sc.nextDouble();

				if (AlumnoCrud.Modificar(nombre, notaMedia)) {
					System.out.println("Se ha podido cambiar la media");
				} else {
					System.out.println("No se ha podido modificar la media");
				}

			}

			case 4 -> {

				nombre = pedirNombre();
				alumno = AlumnoCrud.Buscar(nombre);
				if (alumno != null) {
					AlumnoCrud.Borrar(alumno);
				} else {
					System.out.println("El alumno no existe");
				}
			}
			case 5 -> System.out.println("--Saliendo del sistema--");

			default -> System.out.println("Opción incorrecta");


			}

		} while (opcion != 5);

	}

	static Alumno creaAlumno() {

		String nombre;

		double media;

		Alumno al;

		nombre = pedirNombre();

		System.out.println("Digame la media");
		media = sc.nextDouble();

		al = new Alumno(nombre, media);

		return al;

	}

	private static String pedirNombre() {

		String nombre;

		System.out.println("Digame el nombre del alumno");
		nombre = sc.nextLine();

		return nombre;

	}

}
