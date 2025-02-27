package calculator;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

	@Test
	void testRun() {
		String simulatedInput = """
				4
				2
				2
				0
				""";

		ByteArrayInputStream inputStream = new ByteArrayInputStream(simulatedInput.getBytes());
		System.setIn(inputStream);
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outputStream));
		Calculator calculator = new Calculator();
		Main main = new Main(calculator);
		main.run(new Scanner(System.in));
		String output = outputStream.toString();
		assertTrue(output.contains("2.0"));
		assertTrue(output.contains("Saindo..."));
	}

}