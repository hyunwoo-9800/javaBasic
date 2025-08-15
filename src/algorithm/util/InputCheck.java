package algorithm.util;

import java.util.Scanner;

// int형 및 입력 값 체크용 유틸 클래스
public class InputCheck {

	// 입력 전용 메서드
	public int getValidInt(String message, Scanner sc) {

		String input;

		while (true) {

			System.out.print(message);
			input = sc.nextLine();

			if (!stringCheck(input)) {

				System.out.println("숫자만 입력해주세요.");
				continue;

			}

			try {

				int result = Integer.parseInt(input); // 범위 안이면 통과

				return result;

			} catch (NumberFormatException e) {
				// TODO: handle exception

				System.out.println("숫자가 너무 큽니다. int 범위만 허용됩니다.");

			}

		}

	}

	// 입력 값 체크
	public boolean stringCheck(String str) {

		return str.matches("^[0-9]+$"); // 0 이상의 정수만 허용

	}

}
