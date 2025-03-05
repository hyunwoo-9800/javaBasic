package exercise;

import java.util.Scanner;

public class FlowEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 점수 저장용 변수
		int score = 0;

		// 학점 저장용 변수
		char grade = ' ';

		// 입력한 문자열 체크
		char check;

		// 문자열이 숫자인지 아닌지 판별하기 위한 플래그
		boolean flag = true;

		System.out.println("점수를 입력하세요.>");
		Scanner sc = new Scanner(System.in);
		String tmp = sc.nextLine();

		// 입력한 문자열이 숫자인지 아닌지 판별
		for (int i = 0; i < tmp.length(); i++) {

			check = tmp.charAt(i);

			// 숫자가 아니라면 false
			if (Character.isDigit(check) == false) {

				flag = false;

			}

		} // for 끝

		// 입력한 문자가 숫자가 아닐 경우
		if (flag == false) {

			System.out.println("숫자를 입력해주세요.");
			sc.close();

		} else {
			
			// 숫자일 경우에만 점수를 저장
			score = Integer.parseInt(tmp);

			// 점수가 100점을 넘어갈때
			if (score > 100) {
				
				System.out.println("점수를 정확히 입력해주세요.");
				sc.close();
				
			} else {
				
				if (score >= 90) {
					
					grade = 'A';
					
				} else if (score >= 80) {
					
					grade = 'B';
					
				} else if (score >= 70) {
					
					grade = 'C';
					
				} else {
					
					grade = 'D';
					
				}

				System.out.println("당신의 학점은 " + grade + "이고, ");
				System.out.println("점수는 " + score + "입니다.");
				sc.close();
			}

		} // if - else if 끝

	} // main 끝

} // class 끝
