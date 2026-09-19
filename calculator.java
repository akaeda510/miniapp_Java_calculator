import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("+, -, x, /, =が使用できます");
		System.out.print("式：");
		String input = scanner.nextLine();
		scanner.close();

		parts(input);
	} 

	public void parts(String input) {
		String[] parts = input.split(" ");
		String num1 = parts[0];
		String operator = parts[1];
		String num2 = parts[2];
	}
}
