package algorithm.chap05;

import java.util.Scanner;

import algorithm.util.ConsoleInput;

// 하노이의 탑
public class Hanoi {

	// no개의 원반을 x번 기둥에서 y번 기둥으로 옮김
	static void move(int no, int x, int y) {
		
		if (1 < no) {
			
			move(no - 1, x, 6 - x - y);
			
		}
		
		System.out.printf("원반[%d]을(를) %d번 기둥에서 %d번 기둥으로 옮김\n", no, x, y);
		
		if (1 < no) {
			
			move(no - 1, 6 - x - y, y);
			
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		ConsoleInput ci = new ConsoleInput(sc);
		
		System.out.println("하노이의 탑");
		int n = ci.readInt("원반의 개수: ");
		
		move(n, 1, 3);
		
	}

}
