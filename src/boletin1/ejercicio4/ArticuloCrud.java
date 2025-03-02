package boletin1.ejercicio4;

import java.util.HashSet;
import java.util.Set;

public class ArticuloCrud {

	private static Set<Articulo> Articulos = new HashSet<Articulo>();

	public static void Listado() {
		for (Articulo a : Articulos) {
			System.out.println(a);
			System.out.println("-------------------------------");

		}
	}

	public static boolean añadeArticulo(Articulo articulo) {

		return Articulos.add(articulo);

	}

	public static Articulo buscaArticulo(String nombre) {

		Articulo articulo = null;

		for (Articulo aBus : Articulos) {
			if (aBus.getNombre().equals(nombre)) {
				articulo = aBus;
			}

		}

		return articulo;

	}

	public static boolean borrarArticulo(Articulo articulo) {
		return Articulos.remove(articulo);
	}

	public static boolean modificarDatos(String nombre, double precio) {

		boolean si = false;

		Articulo articulo = buscaArticulo(nombre);
		if (articulo != null) {
			articulo.setPrecio(precio);
			si = true;
		}

		return si;

	}
	
	public static boolean entradaMercancia(String nombre, int cantidad) {
		boolean sePudo = false;

		Articulo a = buscaArticulo(nombre);
		if (a != null) {
			a.almacenar(cantidad);
			sePudo = true;
		}

		return sePudo;
	}

	public static boolean salidaMercancia(String nombre, int cantidad) {
		boolean si = false;

		Articulo articulo = buscaArticulo(nombre);
		if (articulo != null) {
			articulo.vender(cantidad);
			si = true;
		}

		return si;
	}

}
