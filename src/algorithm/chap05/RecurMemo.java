package algorithm.chap05;

import java.util.Scanner;

import algorithm.util.ConsoleInput;

// 재귀 함수를 메모화로 구현
public class RecurMemo {

	static String[]	memo;
	
	// 메모화를 도입한 recur 메서드
	static void recur(int n) {
		
		if (memo[n + 1] != null) {
			
			System.out.print(memo[n + 1]);		// 메모를 출력
			
		} else {
			
			if (0 < n) {
				
				recur(n - 1);
				System.out.println(n);
				recur(n - 2);
				memo[n + 1] = memo[n] + n + "\n" + memo[n - 1];
				
			} else {
				
				memo[n + 1] = "";				// 메모화: recur(0)과 recur(-1)은 빈 문자열
				
			}
			
		} // if - else if 종료
		
	} // recur 종료
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		ConsoleInput ci = new ConsoleInput(sc);
		
		int x = ci.readInt("정수를 입력하세요: ");
		
		memo = new String[x + 2];
		recur(x);

	}

}
