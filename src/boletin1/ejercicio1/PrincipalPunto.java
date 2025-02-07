package boletin1.ejercicio1;

import java.util.Scanner;

public class PrincipalPunto {
	
	public static void main(String[] args) {
		
		Punto coordenada1;
		Punto coordenada2;
		Punto coordenada3;
		
		int x;
		int y;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Punto 1:");
		System.out.println("x = ");	
		x=sc.nextInt();
		System.out.println("y = ");
		y=sc.nextInt();
		coordenada1 = new Punto(x,y);
		
		System.out.println("Punto 2:");
		System.out.println("x = ");	
		x=sc.nextInt();
		System.out.println("y = ");
		y=sc.nextInt();
		coordenada2 = new Punto(x,y);
		
		System.out.println("Punto 3:");
		System.out.println("x = ");	
		x=sc.nextInt();
		System.out.println("y = ");
		y=sc.nextInt();
		coordenada3 = new Punto(x,y);
		
		
		
		
		System.out.println("Punto 1: ("+coordenada1.getX() + " , "+coordenada1.getY()+ ")");
		System.out.println("Punto 2: ("+coordenada2.getX() + " , "+coordenada2.getY()+ ")");
		System.out.println("Punto 3: ("+coordenada3.getX() + " , "+coordenada3.getY()+ ")");
		
		
		coordenada1.setX(coordenada1.getX()*2);
		coordenada1.setY(coordenada1.getY()+3);
		
		coordenada2.setX(coordenada2.getX()*2);
		coordenada2.setY(coordenada2.getY()+3);
		
		coordenada3.setX(coordenada3.getX()*2);
		coordenada3.setY(coordenada3.getY()+3);
		
		
		System.out.println("Punto 1: ("+coordenada1.getX() + " , "+coordenada1.getY()+ ")");
		System.out.println("Punto 2: ("+coordenada2.getX() + " , "+coordenada2.getY()+ ")");
		System.out.println("Punto 3: ("+coordenada3.getX() + " , "+coordenada3.getY()+ ")");
		
		coordenada1.setXY(x, y);
		
		coordenada1.desplaza(x, y);
		
		System.out.println(coordenada1.distancia(coordenada3));
		
		
	}

}
