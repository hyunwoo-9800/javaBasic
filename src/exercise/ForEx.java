package exercise;

public class ForEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 삼각형 출력
		for (int i = 0; i < 11; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();
			
		// 역삼각형 출력
		for (int i = 11; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();

		// 마름모 출력
		
		// 윗쪽 삼각형 출력 for문
		// 10번 반복
		for (int i = 1; i < 11; i++) {
			
//			반복문 확인용	
//			System.out.printf("i = %2d", i);
//			System.out.println();
			
			// 한 행에 출력되는 공백문자 출력용 for문
			// i = 1 일때 j = 10 이므로 해당 for문 9번 반복 됨. j-- 이므로 for문 반복 시 j의 숫자가 점점 줄어듦.
			// 즉, j = 1이 되는 순간 1 > 1이 되어 조건에 맞지 않으므로 for문이 종료된다. -> 공백문자를 9번 출력한다는 의미
			for (int j = 10; j > i; j--) {
				System.out.print(" ");

//				반복문 확인용				
//				System.out.printf("j = %2d", j);
//				System.out.println();
			
			} // 한 행에 출력되는 공백문자 출력용 for문 끝

			// 한 행에 출력되는 "*"문자 출력용 for문
			// i = 1 일때 해당 for문 1번 반복 됨. 즉, 1개의 "*"문자가 출력됨
			for (int n = 1; n <= i * 2 - 1; n++) {
				System.out.print("*");

//				반복문 확인용				
//				System.out.printf("n = %2d", n);
//				System.out.println();
			} // 한 행에 출력되는 "*"문자 출력용 for문 끝
			
			System.out.println();
			
		} // 윗쪽 삼각형 출력 for문 끝

		
		// 아래쪽 삼각형 출력 for문
		// 9번 반복
		for (int i = 9; i > 0; i--) {
//			반복문 확인용
//			System.out.printf("i = %2d", i);
//			System.out.println();

			// 한 행에 출력되는 공백문자 출력용 for문
			// 최초의 for문이 처음 시작될 때 i = 9, j = 10 이므로 해당 for문은 한번 반복 후 종료된다. j-- 이므로 for문 반복 시 j의 숫자가 점점 줄어듦.
			// 즉, j = 9가 되는 순간 9 > 9가 되어 조건에 맞지 않으므로 for문이 종료된다. -> 공백 문자를 한번만 출력한다는 의미
			
			// 최초의 for문이 두번째 시작 될때 i = 8, j = 10 이므로 해당 for문은 두번 반복 후 종료된다. j-- 이므로 for문 반복 시 j의 숫자가 점점 줄어듦. 
			// 즉, j = 8이 되는 순간 8 > 9가 되어 조건에 맞지 않으므로 for문이 종료된다. -> 공백 문자를 두번만 출력한다는 의미
			for (int j = 10; j > i; j--) {
				System.out.print(" ");
				
//				반복문 확인용				
//				System.out.printf("j = %2d", j);
//				System.out.println();
			
			} // 한 행에 출력되는 공백문자 출력용 for문 끝
	
			
			// 한 행에 출력되는 "*"문자 출력용 for문
			// 공백문자 출력용 for문 종료후 실행됨
			// 최초의 for문이 처음 시작될 때 i = 9, n = 1, 1(n) <= 17 {i(9) * 2 - 1} 이므로 n이 우변의 식보다 크거나 같을 때 까지 for문이 반복된다 -> n++이므로
			// n = 17이되면 17 <= 17 이므로 조건에 부합하여 for문이 종료된다. -> 17개의 "*"문자를 출력한다는 의미
			
			// 최초의 for문이 두번째 시작 될때 i = 8, n = 1, 1(n) <= 15 {i(8) * 2 - 1} 이므로 n이 우변의 식보다 크거나 같을 때 까지 for문이 반복된다 -> n++이므로
			// n = 15가되면 15 <= 15 이므로 조건에 부합하여 for문이 종료된다. -> 15개의 "*"문자를 출력한다는 의미
			for (int n = 1; n <= i * 2 - 1; n++) {
				System.out.print("*");
				
//				반복문 확인용			
//				System.out.printf("n = %2d", n);
//				System.out.println();
			} // 한 행에 출력되는 "*"문자 출력용 for문 끝
			
			System.out.println();
		
		}// 아래쪽 삼각형 출력 for문 끝

	} // main 끝

}
