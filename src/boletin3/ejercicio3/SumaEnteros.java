package boletin3.ejercicio3;

public class SumaEnteros {

	static int sumarEnteros(int num1) {
		int suma;

		if (num1 == 0) {

			suma = 0;

		} else {

			suma = num1 + sumarEnteros(num1 - 1);

		}

		return suma;
	}

	static int sumarEnteros(int num1, int num2) {
		int suma = 0;

		if (num2 == num1) {

			suma = 0;

		} else {

			suma = num2 + sumarEnteros(num1, num2 - 1);

		}

		return suma;
	}

}
