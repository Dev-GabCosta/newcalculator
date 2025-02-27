package calculator;

public class Calculator {

	public Calculator() {
	}

	public double add(double NUMBER1, double NUMBER2) {
		return NUMBER1 + NUMBER2;
	}

	public double subtract(double NUMBER1, double NUMBER2) {
		return NUMBER1 - NUMBER2;
	}

	public double multiply(double NUMBER1, double NUMBER2) {
		return NUMBER1 * NUMBER2;
	}

	public double divide(double NUMBER1, double NUMBER2) {

		if (NUMBER2 != 0) {
			return NUMBER1 / NUMBER2;
		} else {
			throw new ArithmeticException("Não é possível dividir por zero!");
		}

	}

	public double pow(double NUMBER1, double NUMBER2) {
		return Math.pow(NUMBER1, NUMBER2);
	}

	public double square(double NUMBER1) {
		return Math.sqrt(NUMBER1);
	}
}
