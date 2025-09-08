package algorithm.chap04;

import java.util.Scanner;

import algorithm.util.ConsoleInput;

// 원하는 개수만큼 값을 계속 입력받고, 요솟수가 N인 배열에 마지막 N개를 저장
public class LastNElements {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		ConsoleInput ci = new ConsoleInput(sc);
		
		final int N = 10;
		int[] a = new int[N];		// 입력받은 값을 저장
		int cnt = 0;				// 입력받은 개수
		int retry;					// 다시 한 번
		
		System.out.println("정수를 입력하세요.");
		
		do {
			
			System.out.printf("%d번째 정수 : ", cnt + 1);
			a[cnt++ % N] = ci.readInt("");
			
			System.out.print("계속 할까요? (예: 1 / 아니오: 2)");
			retry = ci.readInt("");
			
		} while (retry == 1);
		
		int i = cnt - N;
	
		if (i < 0) {
			
			i = 0;
			
		}
		
		for (; i < cnt; i++) {
			
			System.out.printf("%2d번째 정수 = %d\n", i + 1, a[i % N]);
			
		}
		
	}
	
}
