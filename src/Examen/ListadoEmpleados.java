package Examen;

import java.util.HashSet;

public class ListadoEmpleados {

	private static HashSet<Empleado> lista = new HashSet<Empleado>();

	public static void listarEmpleados() {

		for (Empleado empleado : lista) {

			System.out.println(empleado);

		}

	}

	public static boolean añadirEmpleado(Empleado e) {

		return lista.add(e);

	}

	/**
	 * 
	 * @param e
	 * @return
	 */
	private static Empleado comprobarEmpleado(Empleado e) {
		
		Empleado emp=null;
		
		for (Empleado empleado : lista) {

			if (empleado.equals(e)) {
				
				emp= e;
				
			}

		}
		return emp;

	}
	
	/**
	 * Esta funcion sirve para modificar las horas extra de una persona en concreto
	 * @param e
	 * @param h
	 * @return
	 */
	public static boolean modificarHoraExtra(Empleado e, int h) {
		
		boolean si=false;
		
		Empleado eModificar=comprobarEmpleado(e);
		
		if(eModificar!=null) {
			si=true;
			eModificar.setHoraExtra(h);
		}
		
		return si;
		
		
		
	}
	
	public static boolean modificarImportHE(int i) {
		
		boolean si=false;
		
		if(i>0) {
			Empleado.setImporteHoraExtra(i);
			si=true;
		}
		
		return si;
		
	}
	
	public static boolean eliminarEmpleado(Empleado e) {

		
		return lista.remove(e);
	}
	
	

}
