package boletin4.ejercicio2;

public class Contador {

	private int cont;
	
	public Contador(int cont) {
		
		if(cont >=0) {
			this.cont= cont;
		}
		
	}

	public int getCont() {
		return cont;
	}

	public void setCont(int cont) {
		if(cont >=0) {
			this.cont= cont;
		}
	}
	
	public void incrementar() {
		this.cont+=1;
		
	}
	
	public void decrementar() {
		this.cont-=1;
		if(this.cont<0) {
			this.cont=0;
		}
	}
}
