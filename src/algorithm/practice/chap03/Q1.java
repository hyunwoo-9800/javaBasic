package algorithm.practice.chap03;

import java.util.Scanner;

// 선형 검색 알고리즘(보초법) for 문 사용
public class Q1 {

	// 요솟수가 n인 배열 a에서 key와 값이 같은 요소를 보초법으로 선형 검색
	static int seqSearch(int[] a, int n, int key) {

		int i = 0;

		a[n] = key; // 보초를 추가

		for (i = 0; a[i] != key; i++) {

			;

		}

		return i == n ? -1 : 1;

	} // 메서드 종료

	// 입력 전용 메서드
	static int getValidInt(String message, Scanner sc) {

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
	static boolean stringCheck(String str) {

		return str.matches("^[0-9]+$"); // 0 이상의 정수만 허용

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int num = getValidInt("요솟수: ", sc);

		int[] x = new int[num + 1]; // 요솟수가 num + 1(입력 값 + 1)인 배열

		for (int i = 0; i < num; i++) {

			x[i] = getValidInt("X[" + i + "]: ", sc);

		}

		int key = getValidInt("검색할 값: ", sc);
		int idx = seqSearch(x, num, key); // 배열 x에서 값이 key인 요소를 검색

		if (idx == -1) {

			System.out.println("그 값의 요소가 없습니다.");

		} else {

			System.out.println("그 값은 x[" + idx + "]에 있습니다.");
			System.out.print("x[" + idx + "] = " + x[idx]);

		}

		sc.close();

	}

}
