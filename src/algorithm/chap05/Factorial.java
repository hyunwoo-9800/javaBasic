package algorithm.chap05;

import java.util.Scanner;

import algorithm.util.ConsoleInput;

// 팩토리얼을 재귀로 구함
public class Factorial {

	// 음이 아닌 정수 n의 팩토리얼 값을 반환
	static int factorial(int n) {
		
		if (0 < n) {
			
			return n * factorial(n - 1);
			
		} else {
			
			return 1;
			
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		ConsoleInput ci = new ConsoleInput(sc);
		
		int x = ci.readInt("정수를 입력하세요: ");
		
		System.out.println(x + "의 팩토리얼은 " + factorial(x) + "입니다.");
		
	}

}
