package boletin3.ejercicio4;

public class parseToBoolean {
	
	static boolean ParseToBoolean(int num) {
		
		boolean si;
		
		if (num==0) {
			
			si=false;
			
		}else {
			
			si=true;
			
		}
		
		return si;
	}
	
	static boolean ParseToBoolean(String si) {
		boolean e;
		
		if (si.equalsIgnoreCase("true")) {
			
			e=true;
			
		}else {
			
			e=false;
			
		}
		
		return e;
	}

}
