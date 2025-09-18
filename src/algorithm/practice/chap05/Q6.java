package algorithm.practice.chap05;

import java.util.Scanner;

import algorithm.util.ConsoleInput;

// 비재귀적 구현
public class Q6 {
	
	static void recur(int n) {
		
		int[] nstk = new int[100];
		int[] sstk = new int[100];
		
		int ptr = -1;
		int sw = 0;
		
		while (true) {
			
			if (0 < n) {
				
				ptr++;
				
				nstk[ptr] = n;
				sstk[ptr] = sw;
				
				if (sw == 0) {
					
					n = n - 1;
					
				} else if (sw == 1) {
					
					n = n - 2;
					sw = 0;
					
				}
				
				continue;
				
			} // if 종료
			
			do {
				
				n = nstk[ptr];
				sw = sstk[ptr--] + 1;
				
				if (sw == 2) {
					
					System.out.println(n);
					
					if (ptr < 0) {
						
						return;
						
					}
					
				}
				
			} while (sw == 2); // do - while 종료
			
		} // 전체 while 종료
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		ConsoleInput ci = new ConsoleInput(sc);
		
		int x = ci.readInt("정수를 입력하세요: ");
		
		recur(x);

	}
	
}
