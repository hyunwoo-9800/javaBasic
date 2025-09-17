package algorithm.practice.chap05;

import java.util.Scanner;

import algorithm.util.ConsoleInput;

public class Q5 {
	
	static String[]	memo;
	static int cntRecur = 0;
	static int cntRecurMemo = 0;
	
	// 재귀 함수
	static void recur(int n) {
		
		cntRecur++;
		
		if (0 < n) {
			
			recur(n - 1);												// 왼쪽 재귀
			System.out.println("n = " + n);
			recur(n - 2);												// 오른쪽 재귀
			
		}
		
	} // recur 종료
	
	// 메모화를 도입한 recur 메서드
	static void recurWithMemo(int n) {
		
		cntRecurMemo++;
		
		if (memo[n + 1] != null) {
			
			System.out.print(memo[n + 1]);		// 메모를 출력
			
		} else {
			
			if (0 < n) {
				
				recurWithMemo(n - 1);
				System.out.println("n = " + n);
				recurWithMemo(n - 2);
				memo[n + 1] = memo[n] + n + "\n" + memo[n - 1];
				
			} else {
				
				memo[n + 1] = "";				// 메모화: recurWithMemo(0)과 recurWithMemo(-1)은 빈 문자열
				
			}
			
		} // if - else if 종료
		
	} // recurWithMemo 종료
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		ConsoleInput ci = new ConsoleInput(sc);
		
		int x = ci.readInt("정수를 입력하세요: ");
		
		recur(x);
		System.out.println("recur 메서드를 호출한 횟수 : " + cntRecur);
		
		memo = new String[x + 2];
		recurWithMemo(x);
		System.out.println("recurWithMemo 메서드를 호출한 횟수 : " + cntRecurMemo);

	}

}
