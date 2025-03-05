package boletin4.ejercicio1;

public class Hora {

	public int hora;
	public int min;
	public int seg;


	public int getHora() {

		return hora;

	}

	public void setHora(int hora) {
		if (hora < 24 && hora >= 0) {
			this.hora = hora;
		}
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		if (min < 60 && min >= 0) {
			this.min = min;
		}
	}

	public int getSeg() {
		return seg;
	}

	public void setSeg(int seg) {
		if (seg < 60 && seg >= 0) {
			this.seg = seg;
		}
	}

	public Hora(int h, int m, int s) {
		
		if (h < 24 && h >= 0) {
			this.hora = h;
		}
		
		
		if (m < 60 && m >= 0) {
			this.min = m;
		}
		
		
		if (s < 60 && s >= 0) {
			this.seg = s;
		}

	}
	
	public void Incrementa() {
		this.seg+=1;
		
		if(this.seg>=60) {
			this.seg-=60;
			this.min+=1;
		}
		
		if(this.min>=60) {
			this.min-=60;
			this.hora+=1;
		}
		
		if(this.hora>=24) {
			this.hora-=24;
		}
	}

	

	

}
