package calculator;

import java.util.Scanner;

public class Main {
	private final Calculator calculator;

	public Main(Calculator calculator) {
		this.calculator = calculator;
	}

	public void run(Scanner input) {
		String menu = """
				double number1, number2;
						Escolha a operação a ser realizada...
						1 - Adição
						2 - Subtração
						3 - Multiplicação
						4 - Divisão
						5 - Potenciação
						6 - Radiciação
				""";

		int operation;
		boolean check;

		do {
			System.out.println("Insira o primeiro número");
			number1 = input.nextDouble();
			System.out.println("Insira o segundo número");
			number2 = input.nextDouble();
			System.out.println(menu);
			operation = input.nextInt();

			switch (operation) {
				case 1 -> System.out.println(calculator.add(number1, number2));
				case 2 -> System.out.println(calculator.subtract(number1, number2));
				case 3 -> System.out.println(calculator.multiply(number1, number2));
				case 4 -> System.out.println(calculator.divide(number1, number2));
				case 5 -> System.out.println(calculator.pow(number1, number2));
				case 6 -> System.out.println(calculator.square(number1));
				default -> System.out.println("Erro: operação inválida!");
			}

			System.out.println("Você deseja realizar outra operação? (digite 0 para sairou qualquer outro número para continuar)");
			int answer = input.nextInt();

			if (answer == 0) {
				break;
			}
			check = true;

		} while (check);

		System.out.println("Saindo...");
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Calculator c = new Calculator();
		Main main = new Main(c);
		main.run(input);
		input.close();
	}

}