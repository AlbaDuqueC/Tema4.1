package boletin4.ejercicio3;

public class Fecha {

	private int dia;
	private int mes;
	private int año;

	public Fecha(int dia, int mes, int año) {

		if (dia > 0 && dia < 31) {
			this.dia = dia;
		}

		if (mes > 0 && mes <= 12) {

			this.mes = mes;
		}

		if (año > 0) {
			this.año = año;
		}

	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		if (dia > 0 && dia < 31) {
			this.dia = dia;
		}
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		if (mes > 0 && mes <= 12) {

			this.mes = mes;
		}
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		if (año > 0) {
			this.año = año;
		}
	}

	public boolean esBisiesto() {
		boolean bi = false;

		if ((this.año % 4 == 0 && this.año % 100 != 0) || (this.año % 100 == 0 && this.año % 400 == 0)) {

			bi = true;

		}

		return bi;
	}

	public boolean fechaCorrecta() {
		boolean si = false;

		if (esBisiesto()) {

			if (this.mes == 2) {

				if (this.dia <= 28) {
					si = true;
				}

			} else {
				if (this.dia <= 31) {
					si = true;
				}
			}

		} else {
			if (this.mes == 2) {
				if (this.dia < 28) {
					si = true;
				}
			} else {
				if (this.dia <= 31) {
					si = true;
				}
			}
		}

		return si;
	}
	
	public void diaSiguiente() {
		
		this.dia+=1;
		
		if(esBisiesto() && this.mes==2) {
			if(this.dia>29) {
				this.dia=1;
				this.mes+=1;
			}
		}
		
		else if(!esBisiesto() && this.mes==2) {
			if(this.dia>28) {
				this.dia=1;
				this.mes+=1;
			}
		}
		
		else if(this.dia>31) {
			this.dia=1;
			this.mes=this.mes+1;
			System.out.println("holiwis");
			
			//Elena, no funciona :(
			//Cambiar de año
			if(this.mes>12) {
				this.mes=1;
				this.año+=1;
				System.out.println("adios");
			}
		}
		
	}
	
	@Override
	public String toString() {
		return this.dia + "-"+ this.mes+"-"+ this.año;
	}

}
