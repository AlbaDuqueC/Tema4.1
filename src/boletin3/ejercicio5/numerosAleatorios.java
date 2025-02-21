package boletin3.ejercicio5;

import java.util.Random;

public class numerosAleatorios {
	
	static Random rand= new Random();
	
	public static String NumRand (int num){
		
		int numero;
		
		String randNum="";
		
		for(int i=0; i<num; i++ ) {
		
			numero=rand.nextInt(0,2);
			randNum+= " "+numero;
		
		}
		return randNum;
		
		
	}
	
	public static String NumRand(int cantidad, int max) {
		
		String randNum="";
		
		int num;
		
		for (int i=0; i<cantidad; i++) {
			num=rand.nextInt(0,max+1);
			
			randNum+=" "+ num;
		}
		
		return randNum;
		
	}
	
	public static String NumRand(int cantidad, int max, int min) {

		String randNum="";
		
		int num;
		
		for (int i=0; i<cantidad; i++) {
			num=rand.nextInt(min,max+1);
			
			randNum+=" "+ num;
		}
		
		return randNum;
	}
}
