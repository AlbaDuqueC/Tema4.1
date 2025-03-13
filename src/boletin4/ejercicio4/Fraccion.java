package boletin4.ejercicio4;

import java.util.Objects;

import Examen.Empleado;

public class Fraccion {

	private int num;
	private int den;


	public Fraccion(int num, int den) {

		this.num = num;
		this.den = den;

	}

	
	public Fraccion sumar(Fraccion f2) {

		Fraccion frac = new Fraccion(0, 0);

		frac.num = this.num * f2.den + this.den * f2.num;
		frac.den = this.den * f2.den;

		frac.simplificar();

		return f2;

	}

	
	public Fraccion resta(Fraccion f2) {
		Fraccion frac = new Fraccion(0, 0);

		frac.num = this.num * f2.den - this.den * f2.num;
		frac.den = this.den * f2.den;

		frac.simplificar();

		return f2;
	}

	
	public Fraccion multiplica(Fraccion f2) {
		Fraccion frac = new Fraccion(0, 0);

		frac.num = this.num * f2.num;
		frac.den = this.den * f2.den;

		frac.simplificar();

		return f2;
	}

	
	public Fraccion division(Fraccion f2) {
		Fraccion frac = new Fraccion(0, 0);

		if (f2.num != 0) {
			frac.num = num * f2.den;
			frac.den = den * f2.num;
		}

		return frac;
	}

	private int mcd(int a, int b) {
		while (b != 0) {
			int t = b;
			b = a % b;
			a = t;
		}
		return a;
	}

	
	public Fraccion simplificar() {

		Fraccion frac = new Fraccion(0, 0);

		int divisorC;

		divisorC = mcd(num, den);

		num /= divisorC;
		den /= divisorC;

		if (den < 0) {
			num = -num;
			den = -den;
		}

		return frac;

	}

	@Override
	public String toString() {
		return this.num + "/" + this.den;
	}
	
	public int hashCode() {
		return Objects.hash(num, den);
	}

	public boolean equals(Object o) {

		boolean igual = false;
		
		Fraccion frac = (Fraccion) o;

		if (frac.equals(o)) {
			igual = true;
		}

		return igual;

	}

}
