package algorithm.chap03;

import java.util.Arrays;
import java.util.Scanner;

import algorithm.util.InputCheck;

// Arrays.binarySearch로 이진검색
public class BinarySearchTester {

	// 입력 값 체크용
	static InputCheck inputCheck = new InputCheck();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int num = inputCheck.getValidInt("요솟수: ", sc);
		int[] x = new int[num];

		System.out.println("오름차순으로 입력하세요.");

		x[0] = inputCheck.getValidInt("x[0]: ", sc);

		for (int i = 1; i < num; i++) {

			int value = 0;

			do {

				value = inputCheck.getValidInt("x[" + i + "]: ", sc);

				if (value < x[i - 1]) {

					System.out.println("앞 요소보다 크거나 같아야 합니다.");

				}

			} while (value < x[i - 1]); // 바로 앞의 요소보다 작으면 다시 입력받음

			x[i] = value;

		} // for 문 종료

		int key = inputCheck.getValidInt("검색할 값: ", sc);
		
		// Arrays.binarySearch로 검색
		int idx = Arrays.binarySearch(x, key);

		if (idx < 0) {

			System.out.println("그 값의 요소가 없습니다.");
			
		} else {
			
			System.out.println("그 값은 x[" + idx + "]에 있습니다.");
			
		}

	}

}
