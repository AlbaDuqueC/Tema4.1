package boletin3.ejercicio6;

public class FuncionesMatematicas {
	
	public static int sumatorio(int numero) {
		
		int resultado=0;
		
		if(numero ==0) {
			resultado=0;
		}else {
			resultado+= numero + sumatorio(numero-1);
		}
		
		return resultado;
		
	}
	
	public static double potencia(double a, int n) {
		
		double resultado=0;
		
		
			
			
			
			if(n==0) {
				resultado=0;
			}
			
			else {
				resultado= a*potencia(a, n-1);
			}
			
			return resultado;
			
		
		
		
		
	}
	
	public static int serieFibonacci(int numero) {
		//fibonacci(n) = fibonacci(n-1) + fibonacci(n-2)

		int resultado=0;
		
		if( numero==0) {
			
			resultado=0;
			
		}else {
		resultado=serieFibonacci(numero-1) + serieFibonacci(numero-2) ;
		}
		return resultado;
	}

}
