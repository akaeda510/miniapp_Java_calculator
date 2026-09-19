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
