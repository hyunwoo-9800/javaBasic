package algorithm.chap05;

import java.util.Scanner;

import algorithm.util.ConsoleInput;

// 유클리드 호제법으로 최대공약수를 구함
public class EucildGCD {

	// 정수 x, y의 최대공약수를 구하여 반환
	static int gcd(int x, int y) {
		
		if (y == 0) {
			
			return x;
			
		} else {
			
			return gcd(y, x % y);
			
		}
		
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
