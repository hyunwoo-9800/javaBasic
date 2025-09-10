package algorithm.practice.chap05;

import java.util.Scanner;

import algorithm.util.ConsoleInput;

// 팩토리얼을 재귀없이 구하기
public class Q1 {
	
	// 음이 아닌 정수 n의 팩토리얼 값을 반환
	static int factorial(int n) {
		
		int factorial = 1;
		
		for (;;) {
			
			factorial *= n--;
			
			if (n <= 1) {
				
				break;
				
			}
			
		}
		
		return factorial;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		ConsoleInput ci = new ConsoleInput(sc);
		
		int x = ci.readInt("정수를 입력하세요: ");
		
		System.out.println(x + "의 팩토리얼은 " + factorial(x) + "입니다.");

	}

}
