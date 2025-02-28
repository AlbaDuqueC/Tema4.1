package boletin1.ejercicio3;

public class Rectangulo {

	private int x1;
	private int y1;
	private int x2;
	private int y2;

	
	public int getX1() {
		return x1;
	}

	public void setX1(int x1) {
		this.x1 = x1;
	}

	public int getY1() {
		return y1;
	}

	public void setY1(int y1) {
		this.y1 = y1;
	}

	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		if (x2 > x1) {
			this.x2 = x2;
		}
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		if (y2 > y1) {
			this.y2 = y2;
		}
	}

	public Rectangulo(int x1, int y1, int x2, int y2) {

			this.x1 = x1;
			this.y1 = y1;
			this.x2 = x2;
			this.y2 = y2;

		

	}
	
	public void setXY1(int x1, int y1) {
		if (this.x2 > x1 && this.y2 >y1) {
		this.x1=x1;
		this.y1=y1;
		}
	}
	public void setXY2(int x2, int y2) {
		if (x2 > this.x1 && y2 > this.y1) {
		this.x2=x2;
		this.y2=y2;
		}
	}
	public void setAll(int x1, int y1, int x2, int y2) {
		if (x2 > x1 && y2 > y1) {
		this.x1=x1;
		this.y1=y1;
		this.x2=x2;
		this.y2=y2;
		}
	}
	public double getPerimetro () {
		double perimetro;
		perimetro= Math.abs((this.x2-this.x1 + this.y2 -this.y1)*2);
		return perimetro;
	}
	
	public double getArea () {
		double area;
		area= Math.abs(this.x2-this.x1)*Math.abs( this.y2-this.y1);
		return area;
	}
	public String toString() {
		String info;
		info="Perimetro: "+ getPerimetro() + ", Area: "+ getArea();
		return info;
	}

}