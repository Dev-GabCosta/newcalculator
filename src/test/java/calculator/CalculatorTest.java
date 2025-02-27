package calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
	private final Calculator calculator = new Calculator();
	private final double number1 = 4;
	private final double number2 = 2;

	@Test
	void testSuccessAdd() {
		double result = calculator.add(number1, number2);
		Assertions.assertEquals(6, result);
	}

	@Test
	void testSuccessSubtract() {
		double result = calculator.subtract(number1, number2);
		Assertions.assertEquals(2, result);
	}

	@Test
	void testSuccessMultiply() {
		double result = calculator.multiply(number1, number2);
		Assertions.assertEquals(8, result);
	}

	@Test
	void testSuccessDivide() {
		double result = calculator.divide(number1, number2);
		Assertions.assertEquals(2, result);
	}

	@Test
	void testFailDivide() {
		Assertions.assertThrows(ArithmeticException.class, () -> calculator.divide(4, 0));
	}
}

