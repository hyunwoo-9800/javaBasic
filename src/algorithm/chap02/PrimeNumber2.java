package algorithm.chap02;

import java.util.Arrays;

// 1000이하의 소수를 나열(버전2)
public class PrimeNumber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cnt = 0; 					// 나눗셈의 횟수
		int ptr = 0; 					// 찾은 소수의 개수
		int[] prime = new int[500]; 	// 소수를 저장하는 배열

		prime[ptr++] = 2; 				// 2는 소수임
		System.out.println("test = " + Arrays.toString(prime));
		System.out.println("현재까지 찾은 소수들: " + Arrays.toString(Arrays.copyOf(prime, ptr)));
		
		// 소수만 조회
		for (int n = 3; n <= 1000; n += 2) {

			int i;

			// 이미 찾은 소수로 나누어 봄
			for (i = 1; i < ptr; i++) {

				cnt++;

				// 나누어 떨어진다면 소수가 아님
				if (n % prime[i] == 0) {

					break;

				}
				
			} // 내부 for 종료
			
			// 마지막까지 나누어 떨어지지 않음
			if (ptr == i) {

				prime[ptr++] = n; // 소수로 배열에 저장

			}
			

		} // 소수 조회 for 종료

		// 찾은 ptr개의 소수를 출력
		for (int i = 0; i < ptr; i++) {

			System.out.println("찾은 소수는? " + prime[i]);

		}

		System.out.println("나눗셈을 실행한 횟수: " + cnt);

	}

}
