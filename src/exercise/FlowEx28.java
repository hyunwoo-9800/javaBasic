package exercise;

import java.util.Scanner;

public class FlowEx28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input = 0;
		int answer = 0;

		// 입력한 문자열 체크
		char check;
		
		// 문자열이 숫자인지 아닌지 판별하기 위한 플래그
		boolean flag = true;

		// 1 ~ 100 사이의 임의의 수를 저장
		answer = (int) (Math.random() * 100) + 1;

		System.out.println("1 ~ 100사이의 정수를 입력하세요.>");
		Scanner sc = new Scanner(System.in);

		do {

			String tmp = sc.nextLine();

			// 입력한 문자열이 숫자가 아닐 경우 flag = false
			for (int i = 0; i < tmp.length(); i++) {
				check = tmp.charAt(i);

				if (Character.isDigit(check) == false) {
					
					flag = false;
					sc.close();
				
				}
			
			} // for 끝

			if (flag == true) {
				
				input = Integer.parseInt(tmp);

				if (input > answer) {
					
					System.out.println("더 작은 수로 다시 시도해보세요.");
					
				} else if (input < answer) {
					
					System.out.println("더 큰 수로 다시 시도해보세요.");
					
				} // else if 끝
				
			} // if 끝

			if (flag == false) {
				
				System.out.println("숫자로 입력해주세요.");
				break;
				
			} // if 끝

		} while (input != answer); // do while 끝

		if (flag == true) {
			
			System.out.println("정답입니다!");
			
		} // if 끝

	} // main 끝

} // class 끝
