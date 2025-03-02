package boletin2.ejercicio3;

import java.util.ArrayList;

public class AlumnoCrud {
	
	static ArrayList <Alumno> Alumnos  = new ArrayList <Alumno>();
	
	static public void Listado () {
		for (Alumno a : Alumnos) {
            System.out.println(a);
            System.out.println("-------------------------------");
           
        }
	}
	
	static public boolean NuevoAlumno (Alumno nombre) {
		return  Alumnos.add(nombre);
		
	}
	
	static public Alumno Buscar (String nombre) {
		Alumno a = null; 

		for (Alumno aBusqueda : Alumnos) {
			if (aBusqueda.getNombre().equals(nombre)) {
				a = aBusqueda;
			}
		}

		return a;

	}
	public static boolean Borrar(Alumno a) {
		return Alumnos.remove(a);
	}
	
	static public boolean Modificar (String nombre, double media) {
		
		boolean si=  false;
		
		Alumno a = Buscar(nombre);
		if (a != null) {
			a.setNotaMedia(media);
			si=true;
		}
		
		return si; 
		
		
		
	}
	
	

}
