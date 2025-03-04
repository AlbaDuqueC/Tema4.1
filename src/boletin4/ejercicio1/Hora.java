package boletin4.ejercicio1;

public class Hora {
	
	public int hora;
	public int min;
	public int seg;
	
	public Hora(int hora, int min, int seg) {
		
		if (hora<24 && hora>=0) {
			this.hora = hora;
			}else if(hora>=24) {
				this.hora=hora-24;
			}
		
		if(min<60 && min>=0) {
			this.min = min;
			}else if(min>=60) {
				this.min=min-60;
				this.hora+=1;
			}
		
		if(seg<60 && seg>=0) {
			this.seg = seg;
			}else if (min>=60) {
				this.seg=seg-60;
				this.min+=1;
			}
		
		
	}
	
	
	public int getHora() {
		
		return hora;
		
		
	}
	public void setHora(int hora) {
		if (hora<24 && hora>=0) {
		this.hora = hora;
		}else if(hora>=24) {
			this.hora=hora-24;
		}
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		if(min<60 && min>=0) {
		this.min = min;
		}else if(min>=60) {
			this.min=min-60;
			this.hora+=1;
		}
	}
	public int getSeg() {
		return seg;
	}
	public void setSeg(int seg) {
		if(seg<60 && seg>=0) {
		this.seg = seg;
		}else if (min>=60) {
			this.seg=seg-60;
			this.min+=1;
		}
	}
	

	

}
