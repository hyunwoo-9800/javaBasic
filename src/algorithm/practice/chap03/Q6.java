package algorithm.practice.chap03;

import java.util.Arrays;
import java.util.Scanner;

import algorithm.util.InputCheck;

// Arrays.binarySearch로 이진검색(삽입 포인트 값 출력)
public class Q6 {

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

			int insertionPoint = -idx - 1;			// 삽입 포인트 인덱스
			System.out.println("그 값의 요소가 없습니다. 삽입 포인트는 인덱스 " + insertionPoint + "입니다.");
			
			// 삽입된 값을 포함한 새 배열 만들기
			int[] newX = new int[x.length + 1];
			
			// 앞 부분 복사
			System.arraycopy(x, 0, newX, 0, insertionPoint);
			
			// 삽입할 값 넣기
			newX[insertionPoint] = key;
			
			// 뒷 부분 복사
			System.arraycopy(x, insertionPoint, newX, insertionPoint + 1, x.length - insertionPoint);
			
			// 결과 출력
			System.out.println("기존 배열: " + Arrays.toString(x));
			System.out.println("삽입 후 배열: " + Arrays.toString(newX));
			
		} else {
			
			System.out.println("그 값은 x[" + idx + "]에 있습니다.");
			System.out.println("전체 배열 값은 " + Arrays.toString(x));
			
		}

	}

}
