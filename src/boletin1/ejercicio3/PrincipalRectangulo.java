package boletin1.ejercicio3;

import java.util.Scanner;

public class PrincipalRectangulo {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		
		Rectangulo R1;
		Rectangulo R2;
		
		int x1=0;
		int y1=0;
		int x2=0;
		int y2=0;
		
		System.out.println("Introduzca las coodenadas de R1:");
		System.out.print("X1 = ");
		x1= sc.nextInt();
		System.out.print("Y1 = ");
		y1=sc.nextInt();
		System.out.print("X2 = ");
		x2=sc.nextInt();
		System.out.print("Y2 = ");
		y2=sc.nextInt();
		
		R1= new Rectangulo(x1, y1, x2, y2);
		
		System.out.println("Introduzca las coodenadas de R2:");
		System.out.print("X1 = ");
		x1= sc.nextInt();
		System.out.print("Y1 = ");
		y1=sc.nextInt();
		System.out.print("X2 = ");
		x2=sc.nextInt();
		System.out.print("Y2 = ");
		y2=sc.nextInt();

		R2= new Rectangulo(x1, y1, x2, y2);
		
		
		System.out.println("Rectagulo 1: (" + R1.getX1() + " , " + R1.getY1() + ") (" +  R1.getX2() + " , " + R1.getY2() + ")");
		System.out.println("Rectagulo 2: (" + R2.getX1()  + " , " + R2.getY1()  + ") (" +  R2.getX2()  + " , " + R2.getY2()  + ")");
		
		System.out.println("Perimetro 1 = " + Math.abs((R1.getX2()-R1.getX1() + R1.getY2() -R1.getY1())*2) );
		System.out.println("Perimetro 2 = " + Math.abs((R2.getX2()-R2.getX1() + R2.getY2() -R2.getY1())*2) );
		
		System.out.println("Area 1 = " + Math.abs(R1.getX2()-R1.getX1())*Math.abs( R1.getY2()-R1.getY1()) );
		System.out.println("Area 1 = " + Math.abs(R2.getX2()-R2.getX1())*Math.abs( R2.getY2()-R2.getY1()) );
		
		System.out.println();
		System.out.println("Modificaciones");
		
		R1.setX1(R1.getX1()*2);
		R1.setY1(R1.getY1()%3);
		R1.setX2(R1.getX2()+3);
		R1.setY2(R1.getY2()+5);
		
		R2.setX1(R2.getX1()*2);
		R2.setY1(R2.getY1()%3);
		R2.setX2(R2.getX2()+3);
		R2.setY2(R2.getY2()+5);
		
		System.out.println("Rectagulo 1: (" + R1.getX1() + " , " + R1.getY1() + ") (" +  R1.getX2() + " , " + R1.getY2() + ")");
		System.out.println("Rectagulo 2: (" + R2.getX1() + " , " + R2.getY1() + ") (" +  R2.getX2() + " , " + R2.getY2() + ")");
		
		System.out.println("Perimetro 1 = " + Math.abs((R1.getX2()-R1.getX1() + R1.getY2()-R1.getY1())*2) );
		System.out.println("Perimetro 2 = " + Math.abs((R2.getX2()-R2.getX1() + R2.getY2()-R2.getY1())*2) );
		
		System.out.println("Area 1 = " + Math.abs(R1.getX2()-R1.getX1())*Math.abs( R1.getY2()-R1.getY1()) );
		System.out.println("Area 1 = " + Math.abs(R2.getX2()-R2.getX1())*Math.abs( R2.getY2()-R2.getY1()) );
		
		System.out.println("Calculos desde la clase Rectangulo:");
		System.out.println("Area: " + R1.getArea());
		System.out.println("Perimetro: "+ R1.getPerimetro());
		System.out.println("Info: " + R1.toString());
		
	}

}