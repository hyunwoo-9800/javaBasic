package algorithm.practice.chap05;

import java.util.Scanner;

import algorithm.util.ConsoleInput;

// 배열 a의 모든 요소의 최대 공약수를 구하는 메서드를 작성하세요
public class Q3 {
	
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
		
		return (x);
		
	}
	
	// 요소수가 n인 배열 a의 모든 요소의 최대 공약수를 구합니다
	static int gcdArray(int[] a, int start, int no) {
		
		if (no == 1) {
			
			return a[start];
			
		} else if (no == 2) {
			
			return gcd(a[start], a[start + 1]);
			
		} else {
			
			return gcd(a[start], gcdArray(a, start + 1, no - 1));
			
		}
		
	}
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		ConsoleInput ci = new ConsoleInput(sc);
		int num = 0;
		
		for(;;) {
			
			num = ci.readInt("몇 개 정수의 최대 공약수를 구할까요? : ");
			
			if (1 <= num) {
				
				break;
				
			}
			
		}
		
		int[] x = new int[num];			// 길이가 num인 배열
		
		for (int i = 0; i < num; i++) {
			
			x[i] = ci.readInt("x[" + i + "] : ");
			
		}
		
		System.out.println("최대 공약수는 " + gcdArray(x, 0, num) + "입니다.");
		
	}

}
