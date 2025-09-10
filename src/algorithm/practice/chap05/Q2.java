package algorithm.practice.chap05;

import java.util.Scanner;

import algorithm.util.ConsoleInput;

// 최대공약수를 재귀없이 구하기
public class Q2 {
	
	// 정수 x, y의 최대공약수를 구하여 반환
	static int gcd(int x, int y) {
		
		for(;;) {
			
			int temp = y;
			y = x % y;
			x = temp;
			
			if (y == 0) {
				
				break;
				
			}
			
		}
		
		return x;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		ConsoleInput ci = new ConsoleInput(sc);
		
		System.out.println("두 정수의 최대공약수를 구합니다.");
		
		int x = ci.readInt("첫 번째 정수를 입력하세요.: ");
		int y = ci.readInt("두 번째 정수를 입력하세요.: ");
		
		System.out.println("최대 공약수는 " + gcd(x, y) + "입니다.");

	}

}
