package algorithm.practice.chap03;

import java.util.Scanner;

// 이진검색(일치하는 맨앞 요소를 찾습니다.)
public class Q5 {

	// 배열 a의 앞쪽 n개의 요소에서 key와 일치하는 요소를 이진검색
	static int binSearchX(int[] a, int n, int key) {

		int pl = 0; // 검색 범위 맨앞의 인덱스
		int pr = n - 1; // 〃 맨끝의 인덱스

		do {

			int pc = (pl + pr) / 2; // 중앙요소의 인덱스

			if (a[pc] == key) {

				for (; pc > pl; pc--) {

					// key와 같은 맨앞의 요소를 검색합니다
					if (a[pc - 1] < key) {

						break;

					}

				}

				return pc; // 검색 성공

			} else if (a[pc] < key) {

				// 검색 범위를 앞쪽 절반으로 좁힘
				pl = pc + 1;

			} else {

				// 검색 범위를 뒤쪽 절반으로 좁힘
				pr = pc - 1;

			}

		} while (pl <= pr);

		return -1; // 검색 실패
	}

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
		int[] x = new int[num];

		System.out.println("오름차순으로 입력하세요.");

		x[0] = getValidInt("x[0]: ", sc);

		for (int i = 1; i < num; i++) {

			int value = 0;

			do {

				value = getValidInt("x[" + i + "]: ", sc);

				if (value < x[i - 1]) {

					System.out.println("앞 요소보다 크거나 같아야 합니다.");

				}

			} while (value < x[i - 1]); // 바로 앞의 요소보다 작으면 다시 입력받음

			x[i] = value;

		}

		int key = getValidInt("검색할 값: ", sc);

		int idx = binSearchX(x, num, key); // 배열 x에서 값이 key인 요소를 검색

		if (idx == -1) {

			System.out.println("그 값의 요소가 없습니다.");

		} else {

			System.out.println("그 값은 x[" + idx + "]에 있습니다.");

		}

		sc.close();

	}

}
