package boletin4.ejercicio2;

public class PrincipalContador {

	public static void main(String[] args) {
		
		Contador cont=new Contador(0);
		
		cont.incrementar();
		System.out.println("Incremento: "+ cont.getCont());
		
		cont.decrementar();
		System.out.println("Decremento: "+ cont.getCont());

	}

}
