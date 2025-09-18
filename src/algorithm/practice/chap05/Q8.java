package algorithm.practice.chap05;

import java.util.Scanner;

import algorithm.util.ConsoleInput;

// 하노이의 탑(숫자 대신 기둥으로 출력하기)
public class Q8 {

	static String[] name = {"A 기둥", "B 기둥", "C 기둥"};
	
	// no개의 원반을 x번 기둥에서 y번 기둥으로 옮김(비재귀적으로 수정)
	static void move(int no, int x, int y) {
		
		if (1 < no) {
			
			move(no - 1, x, 6 - x - y);
			
		}
		
		System.out.println("원반[" + no + "] 을 " + name[x - 1] + "에서 " + name[y - 1] + "으로 이동");
		
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
