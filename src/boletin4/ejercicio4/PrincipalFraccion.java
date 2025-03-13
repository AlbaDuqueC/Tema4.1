package boletin4.ejercicio4;

public class PrincipalFraccion {

	public static void main(String[] args) {
		
		Fraccion fraccion1 = new Fraccion(6, 3);
		Fraccion fraccion2 = new Fraccion(2, 7);

		System.out.println("Fracción 1: " + fraccion1);
		System.out.println("Fracción 2: " + fraccion2);

		System.out.println("Suma: " + fraccion1.sumar(fraccion2));

		System.out.println("Resta: " + fraccion1.resta(fraccion2));

		System.out.println("Multiplicación: " + fraccion1.multiplica(fraccion2));

		System.out.println("División: " + fraccion1.division(fraccion2));

	}

}
