package algorithm.util;

import java.util.Scanner;
import java.util.regex.Pattern;

// 콘솔 입력 유틸
public class ConsoleInput {

	private final Scanner sc;

	// 생성자
	public ConsoleInput(Scanner sc) {

		this.sc = sc;

	}

	// 정수 값 입력
	public int readInt(String prompt) {

		while (true) {

			System.out.print(prompt);

			var v = InputCheck.parseInt(sc.nextLine());

			if (v.isPresent()) {

				return v.get();

			}

			System.out.println("※ 정수를 입력하세요. 예) -3, 0, 42");

		}

	} // readInt 종료

	// 정수의 입력 범위 제한
	public int readIntInRange(String prompt, int min, int max) {

		while (true) {

			System.out.print(prompt);

			var v = InputCheck.parseInt(sc.nextLine());

			if (v.isPresent()) {

				int val = v.get();

				if (val >= min && val <= max) {

					return val;

				}

				System.out.printf("※ %d ~ %d 사이의 숫자를 입력하세요.%n", min, max);

			} else {

				System.out.println("※ 정수를 입력하세요.");

			}

		}

	} // readIntInRange 종료

	// 실수 값 입력
	public double readDouble(String prompt) {

		while (true) {

			System.out.print(prompt);

			var v = InputCheck.parseDouble(sc.nextLine());

			if (v.isPresent()) {

				return v.get();

			}

			System.out.println("※ 실수를 입력하세요. 예) 3, 3.14, -0.5\"");

		}

	} // readDouble 종료

	// 정수 배열 입력
	public int[] readIntArray(String prompt) {

		while (true) {

			System.out.print(prompt);

			var arr = InputCheck.parseIntArray(sc.nextLine(), "\\s+");

			if (arr.isPresent()) {

				return arr.get();

			}

			System.out.println("※ 공백으로 구분된 정수 배열을 입력하세요. 예) 1 2 -3 4");

		}

	} // readIntArray 종료

	// 문자열 입력
	public String readNonBlank(String prompt) {

		while (true) {

			System.out.print(prompt);

			String line = sc.nextLine();

			if (InputCheck.isNonBlank(line)) {

				return line.trim();

			}

			System.out.println("※ 빈 문자열은 허용되지 않습니다.");
		}
		
	} // readNonBlank 종료

	// 필요 시: 특정 정규식/규칙을 강제하고 싶을 때
	public String readStringMatching(String prompt, String regex, String hint) {
		
		Pattern p = Pattern.compile(regex);
		
		while (true) {
			
			System.out.print(prompt);
			
			String line = sc.nextLine();
			
			if (line != null && p.matcher(line.trim()).matches()) {
				
				return line.trim();
				
			}
			
			System.out.println("※ 형식이 올바르지 않습니다. " + hint);
		}
		
	} // readStringMatching 종료

}
