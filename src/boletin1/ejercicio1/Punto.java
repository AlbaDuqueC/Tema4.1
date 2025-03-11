package boletin1.ejercicio1;

public class Punto {
	
	private int x;
	private int y;

	

	/**
	 * 
	 * @return devuelve el punto x
	 */
	public int getX() {
		return x;
	}
	
	/**
	 * Agrega el valor que nos pasa por parametro a nuestro valor x
	 * @param x
	 */
	public void setX (int x) {
		this.x=x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y=y;
	}

	public Punto( int x, int y) {
		
		this.x=x;
		this.y=y;
		
	}
	
	public void setXY(int x, int y) {
		
		this.x=x;
		this.y=y;
		
	}
	
	public void desplaza(int   dx,   int   dy) {
		this.x=+dx;
		this.y=+dy;
	}
	
	public double distancia(Punto p) {
		
		double distancia;
		
		distancia= Math.sqrt(Math.pow(this.x- p.x,2) + Math.pow(this.y- p.y,2));
		
		return distancia;
		
	}
	
	public String toString() {
		String coordenadas;
		coordenadas="( "+this.x + " , "+this.y+" )";
		return coordenadas;
	}
	
	
	
	

}
