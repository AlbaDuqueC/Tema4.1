package boletin4.ejercicio1;

import java.util.Scanner;

public class PrincipalHora {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		Hora QueHoraEs;
		
		int hora;
		int min;
		int seg;
		
		int inc;
		
		System.out.println("Introduce las horas: ");
		hora=sc.nextInt();
		System.out.println("Introduce los minutos: ");
		min=sc.nextInt();
		System.out.println("Introduce los segundos: ");
		seg=sc.nextInt();
		
		QueHoraEs= new Hora(hora, min, seg);
		
		System.out.println("Cuantos segundos quieres incrementar?");
		
		inc= sc.nextInt();
		
		for(int i=0; i<inc; i++) {
			QueHoraEs.Incrementa();
			
		}
		System.out.println(QueHoraEs.getHora() +":"+ QueHoraEs.getMin()+":"+QueHoraEs.getSeg());

	}

}
