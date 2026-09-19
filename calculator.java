import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("+, -, x, /, =が使用できます");
		System.out.print("式：");
		String input = scanner.nextLine();
		scanner.close();

		String[] parts = parts(input);
		double result = result(parts);
		System.out.println("結果: " + result);
	}

	public static String[] parts(String input) {
		String[] parts = input.split(" ");
		return parts;
	}

	public static double result(String[] parts) {
		String num1 = parts[0];
		String operator = parts[1];
		String num2 = parts[2];

		double result = 0;
		switch (operator) {
			case "+":
				result = Double.parseDouble(num1) + Double.parseDouble(num2);
				break;
			case "-":
				result = Double.parseDouble(num1) - Double.parseDouble(num2);
				break;
			case "x":
				result = Double.parseDouble(num1) * Double.parseDouble(num2);
				break;
			case "/":
				result = Double.parseDouble(num1) / Double.parseDouble(num2);
				break;
		}
		return result;
	}
}
