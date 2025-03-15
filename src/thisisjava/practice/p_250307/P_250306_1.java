/**
 * 
 */
package thisisjava.practice.p_250307;

import java.util.Scanner;

/**
 * 
 */
public class P_250306_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 입력 값을 받을 변수
		Scanner sc = new Scanner(System.in);
		
		// 입력받을 문구를 카운트 하기 위함
		int cnt = 1;
		
		// 3개의 수만 받을 배열
		int num[] = new int[3];

		// 버블정렬시 임시로 담아 놓을 변수
		int tmpX = 0;
		
		// 배열의 길이만큼 반복하며 값을 입력받음
		for (int i = 0; i < num.length; i++) {

			System.out.println(cnt + "번째 숫자를 입력해 주세요");
			num[i] = Integer.parseInt(sc.nextLine());
			cnt++;

		}
		
		System.out.println();
		
		System.out.println("정렬 전 배열은? ");
		for(int i = 0; i < num.length; i++) {
			
			System.out.print(num[i] + " ");
			
		}
		
		System.out.println();
		
		// 버블정렬
		for (int i = 0; i < num.length; i++) {
			
			for (int j = 0; j < num.length - i - 1; j++) {

				// 현재 인덱스와 다음 인덱스의 값을 비교하여 값을 바꿈
				if (num[j + 1] < num[j]) {

					// 임시 변수에 값을 저장한뒤 자리를 바꿈
					tmpX = num[j];
					num[j] = num[j + 1];
					num[j + 1] = tmpX;

				}

			} // 내부 for 종료

		} // 버블정렬 for 종료

		System.out.println();
		
		// 출력용
		System.out.println("정렬 후 배열은? ");
		for (int i = 0; i < num.length; i++) {

			System.out.print(num[i] + " ");

		}
		
		// 스캐너 함수 종료
		sc.close();

	} // main 끝

} // class 끝
