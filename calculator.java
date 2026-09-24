import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("=== 簡易電卓アプリ ===");
			System.out.println("+, -, x, /, =が使用できます (例: 10 + 20 =)");
		System.out.println("「exit」または「end」と入力すると終了します。\n");

		while(true) {
			System.out.println("式：");
			String input = scanner.nextLine().trim();
			if (input.equalsIgnoreCase("exit") || input.equalsIgnoreCase("end")) {
				System.out.println("電卓を終了します。");
					break;
			}

			if (input.isEmpty()) {
				continue;
			}

			try {
				String[] parts = parts(input);
				double result = result(parts);
				System.out.println("結果: " + result);
			} catch (NumberFormatException e) {
				System.out.println("エラー: 数値の形式が正しくありません: (" + e.getMessage() + ")");

			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("エラー: 式は「数値 演算子 数値」の形式でスペース区切りで入力してください");
			}
		} 
		scanner.close();
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
			case "*":
				result = Double.parseDouble(num1) * Double.parseDouble(num2);
				break;
			case "/":
				double divisor = Double.parseDouble(num2);
				if (divisor == 0) {
					throw new ArithmeticException("0で割ることができません");
				}
				result = Double.parseDouble(num1) / divisor;
				break;
		}
		return result;
	}
}
