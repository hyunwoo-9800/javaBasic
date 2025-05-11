package algorithm.chap01;

import java.util.Scanner;

public class Alternative2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = 0;
		
		System.out.println("+와 -를 번갈아 n개 출력합니다.");
		System.out.print("n값 : ");
		
		n = Integer.parseInt(sc.nextLine());
		
		for(int i = 0; i < n / 2; i++) {
			
			System.out.print("+-");
			
			if( n % 2 != 0) {
				
				System.out.print("+");
				
			}
			
		} // for 종료
		
		sc.close();
		
	} // main 끝

} // class 끝
