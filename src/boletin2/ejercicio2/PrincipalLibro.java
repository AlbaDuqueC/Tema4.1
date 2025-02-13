package boletin2.ejercicio2;

public class PrincipalLibro {

	public static void main(String[] args) {
		
		Libro libro1;
		Libro libro2;
		
		String titulo="hola";
		String autor= "Felipe";
		int ejemplares= 20;
		int ejemplaresPrestados=5;
		String genero="Lírico";
		
		libro1= new Libro (titulo, autor);
		
		libro1= new Libro (titulo, autor, ejemplares, ejemplaresPrestados);
		
		libro1= new Libro (titulo, autor, ejemplares, ejemplaresPrestados, genero);
		
		if(libro1.prestamo(5)) {
			System.out.println("Se hizo el prestamo correctamente");
			System.out.println("Libro prestados: " + libro1.getEjemplaresPrestados());
			
		}else {
			System.out.println("No se pudo realizar el prestamo");
		}
		
		if(libro1.devolucion(5, "hola")) {
			System.out.println("Se hizo la devolucion correctamente");
			System.out.println("Ejemplares: " + libro1.getEjemplares());
			System.out.println("Prestados: " + libro1.getEjemplaresPrestados());
		}else {
			System.out.println("No se pudo hacer la devolución");
		}
		
		System.out.println("Info: " + libro1.toString());
		
		titulo="si";
		autor= "Chari";
		ejemplares= 25;
		ejemplaresPrestados=8;
		genero="";
		
		libro2= new Libro (titulo, autor);
		
		libro2= new Libro (titulo, autor, ejemplares, ejemplaresPrestados);
		
		libro2= new Libro (titulo, autor, ejemplares, ejemplaresPrestados, genero);
		
		if (libro1.equals(libro2)) {
			System.out.println("Son iguales");
		}else {
			System.out.println("No son iguales");
		}
		

	}

}
