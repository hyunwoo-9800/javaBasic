/**
 * 
 */
package ch04.sec05;

import java.util.Scanner;

/**
 * 
 */
public class KeyControlExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		// 조건 변수
		boolean run = true;
		int speed = 0;
		
		while(run) {
			
			System.out.println("-----------------------");
			System.out.println("1. 증속 | 2. 감속 | 3. 중지");
			System.out.println("-----------------------");
			System.out.print("선택 : ");
			
			String strNum = sc.nextLine();
			
			// 입력한 값에 따라 조건을 실행
			if (strNum.equals("1")) {
				
				speed++;
				System.out.println("현재 속도는 = " + speed);
				
			} else if (strNum.equals("2")) {
				
				speed--;
				System.out.println("현재 속도는 = " + speed);
				
			} else if (strNum.equals("3")) {
				
				run = false;
				
			}
			
			System.out.println("시스템 종료");
			sc.close();
			
		} // while 종료
		
	} // main 끝

} // class 끝
