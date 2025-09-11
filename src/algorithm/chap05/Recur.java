package algorithm.chap05;

import java.util.Scanner;

import algorithm.util.ConsoleInput;

// 재귀 함수 이해
public class Recur {

	// 재귀 함수
	static void recur(int n, int depth) {
		
		if (0 < n) {
			
			// 호출 시작 로그
			System.out.println(" ".repeat(depth * 2) + "recur(" + n + ") 시작");
			
			recur(n - 1, depth + 1);												// 왼쪽 재귀
			System.out.println(" ".repeat(depth * 2) + "출력 n = " + n);
			recur(n - 2, depth + 1);												// 오른쪽 재귀
			
			// 호출 끝 로그
			System.out.println(" ".repeat(depth * 2) + "recur(" + n + ") 끝");
			
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		ConsoleInput ci = new ConsoleInput(sc);
		
		int x = ci.readInt("정수를 입력하세요: ");
		
		recur(x, 0);

	}

}
