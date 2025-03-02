package boletin1.ejercicio4;

import java.util.Scanner;

public class PrincipalArticulo {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		Articulo art;

		Articulo articulo = null;
		
		String nombre = "";
		
		double precio = 0;
		
		int cuantosQuedan = 0;

		String opcion = "";

		do {

			Menu();

			opcion = sc.next();

			switch (opcion) {
			case "a" -> {
				
				System.out.println("----Listado----");
				ArticuloCrud.Listado();

			}
			case "b" -> {
				
				System.out.println("----Alta----");
				articulo = creaArticulo();
				ArticuloCrud.añadeArticulo(articulo);

			}
			case "c" -> {
				
				System.out.println("----Baja----");
				nombre = pedirNombre();
				articulo = ArticuloCrud.buscaArticulo(nombre);
				if (articulo != null) {
					ArticuloCrud.borrarArticulo(articulo);
				} else {
					System.out.println("Articulo no encontrado");
				}


			}
			case "d" -> {
				
				System.out.println("----Modificación----");
				nombre = pedirNombre();
				System.out.println("Digame el precio");
				precio = sc.nextDouble();
				sc.nextLine();

				if (ArticuloCrud.modificarDatos(nombre, precio)) {

					System.out.println("Se pudo modificar el articulo");

				} else {
					System.out.println("No se pudo modificar el articulo");
				}


			}
			case "e" -> {
				
				System.out.println("----Entrada de mercancía----");
				nombre = pedirNombre();
				System.out.println("Digame la cantidad a aumentar");
				cuantosQuedan = sc.nextInt();
				sc.nextLine();

				if (ArticuloCrud.entradaMercancia(nombre, cuantosQuedan)) {

					System.out.println("Se pudo modificar el articulo");

				} else {
					System.out.println("No se pudo modificar el articulo");
				}


			}
			case "f" -> {
				
				System.out.println("----Salida de mercancía----");
				nombre = pedirNombre();
				System.out.println("Digame la cantidad a aumentar");
				cuantosQuedan = sc.nextInt();
				sc.nextLine();

				if (ArticuloCrud.salidaMercancia(nombre, cuantosQuedan)) {

					System.out.println("Se pudo modificar el articulo");

				} else {
					System.out.println("No se pudo modificar el articulo");
				}

			}
			case "g" -> {
				
				System.out.println("--Saliendo del sistema--");


			}
			default -> {
				
				System.out.println("No has puesto una opcion valida");

			}
			}

		} while (opcion != "g");

		System.out.println("Nombre del producto:");
		nombre = sc.next();

		System.out.println("Precio del producto:");
		precio = sc.nextDouble();

		System.out.println("Cuantos productos quieres que queden:");
		cuantosQuedan = sc.nextInt();

		art = new Articulo(nombre, precio, cuantosQuedan);

		System.out.println(art.getNombre() + " - Precio: " + art.getPrecio() + "€ - IVA: " + Articulo.IVA + "% - PVP: "
				+ ((art.getPrecio() * (Articulo.IVA * 0.01)) + art.getPrecio()) + "€");

		System.out.println("PVP: " + art.getPVP());

		System.out.println("Precio con descuento: " + art.getPVPDescuento(23));

		if (art.vender(4)) {
			System.out.println("Se puede vender");
		} else {
			System.out.println("No se puede vender");
		}

		System.out.println("Almacenados: " + art.almacenar(5));

		System.out.println(art.toString());

	}

	static void Menu() {
		System.out.println("Menu");
		System.out.println("-----------------------------------");
		System.out.println("a. Listado");
		System.out.println("b. Alta");
		System.out.println("c. Baja");
		System.out.println("d. Modificación");
		System.out.println("e. Entrada de mercancía");
		System.out.println("f. Salida de mercancía");
		System.out.println("g. Salir");
		System.out.println("-----------------------------------");

	}
	
	static Articulo creaArticulo() {

		String nombre;

		double precio;

		int cuantosQuedan;

		Articulo ar;

		System.out.println("Digame el nombre");
		nombre = sc.nextLine();
		sc.nextLine();

		System.out.println("Digame el precio");
		precio = sc.nextDouble();
		sc.nextLine();

		System.out.println("Digame el cuantos quedan");
		cuantosQuedan = sc.nextInt();
		sc.nextLine();

		ar = new Articulo(nombre, precio, cuantosQuedan);

		return ar;

	}
	private static String pedirNombre() {

		String nombre;

		System.out.println("Digame el nombre del articulo");
		nombre = sc.nextLine();

		return nombre;

	}

}