package exercise;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		char tmp;
		boolean flag = true;

		System.out.println("두자리 정수를 하나 입력해주세요.>");
		String input = scanner.nextLine();
		for (int i = 0; i < input.length(); i++) {
			tmp = input.charAt(i);

			if (Character.isDigit(tmp) == false) {
				flag = false;
			}
		}

		if (flag == false) {
			System.out.println("숫자가 아닙니다.");
			scanner.close();
		} else {
			int num = Integer.parseInt(input);
			if (input != "" && input != null) {

				System.out.println("입력내용 : " + input);
				System.out.printf("num = %d%n", num);
				scanner.close();
			}
		}

	}

}
