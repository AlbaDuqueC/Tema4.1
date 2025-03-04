package boletin4.ejercicio1;

import java.util.Scanner;

public class PrincipalHora {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int hora;
		int min;
		int seg;
		
		System.out.println("Introduce las horas: ");
		hora=sc.nextInt();
		System.out.println("Introduce los minutos: ");
		min=sc.nextInt();
		System.out.println("Introduce los segundos: ");
		seg=sc.nextInt();
		
		System.out.println(Hora(hora,min,seg));

	}

}
