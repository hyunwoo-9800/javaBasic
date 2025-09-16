package algorithm.chap05;

import java.util.Scanner;

import algorithm.chap04.IntStack;
import algorithm.util.ConsoleInput;

// 재귀 함수 이해
public class RecurX2 {

	// 재귀를 제거
	static void recur(int n) {
		
		IntStack s = new IntStack(n);
		
		while (true) {
			
			if (0 < n) {
				
				s.push(n);				// n값을 푸시
				n = n -1;
				continue;
				
			}
			
			// 스택이 비어 있지 않으면
			if (s.isEmpty() != true) {
				
				n = s.pop();			// 저장하고 있던 스택값을 팝
				
				System.out.println(n);

				n = n - 2;
				continue;
			}
			
			break;
			
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		ConsoleInput ci = new ConsoleInput(sc);
		
		int x = ci.readInt("정수를 입력하세요: ");
		
		recur(x);

	}

}
