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
	
	

}
