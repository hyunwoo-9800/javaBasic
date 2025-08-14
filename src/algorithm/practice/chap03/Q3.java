package algorithm.practice.chap03;

import java.util.Scanner;

// key 값과 일치하는 배열의 인덱스 구하기
public class Q3 {

	// key 값과 일치하는 배열의 인덱스 구하는 메서드
	static int searchIdx(int[] a, int n, int key, int[] idx) {

		int cnt = 0;

		for (int i = 0; i < n; i++) {
			
			System.out.printf("비교중 : a[%d] = %d", i, a[i]);	// 1. 현재 비교 값 출력

			if (a[i] == key) {

				idx[cnt++] = i;
				
				 System.out.printf("  →  key(%d)와 같음! idx[%d]에 저장됨\n", key, cnt - 1);	// 2. 저장한 내용 출력

			} else {

	            System.out.println("  →  일치하지 않음");

	        }

		}

		 System.out.println("\n총 찾은 개수: " + cnt);  // 3. 최종 개수 출력
		 
		    System.out.print("idx 배열 상태: ");
		    
		    for (int i = 0; i < cnt; i++) {
		    	
		        System.out.print(idx[i] + " ");
		        
		    }
		    
		    System.out.println("\n");
		 
		return cnt;

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

		int n = getValidInt("요솟수: ", sc);
		int[] x = new int[n];
		int[] idx = new int[n];

		for (int i = 0; i < n; i++) {

			x[i] = getValidInt("X[" + i + "]: ", sc);

		}

		int key = getValidInt("검색할 값: ", sc);
		int cnt = searchIdx(x, n, key, idx); // 배열 x에서 값이 key인 요소를 검색

		if (cnt == 0) {

			System.out.println("그 값의 요소가 없습니다.");

		} else {

			for (int i = 0; i < cnt; i++) {

				System.out.println("그 값은 x[" + idx[i] + "]에 있습니다.");

			}

		}

	}

}
