/**
 * 
 */
package thisisjava.practice.p_250307;

/**
 * 
 */
public class P_250306_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 숫자 출력용
		int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9  };
		
		// 탬파베이 팀 배열
		int[] team1 = { 0, 0, 0, 0, 1, 3, 2, 3, 1 };
		
		// 토론토 팀 배열
		int[] team2 = { 0, 2, 2, 0, 4, 1, 0, 0, 0 };
		
		// 카운트 변수
		int i = 0;
		
		// 합계 변수
		int sum = 0;
		
		System.out.println("스코어 보드");
		
		// 스코어 보드 배열 출력
		for(i = 0; i < num.length; i++) {
			
			System.out.print("\t" + num[i]);
			
		}
		
		System.out.print("\t R");
		
		System.out.println();
		
		System.out.print("\n탬파베이");
		
		// 탬파베이 배열 출력
		for(i = 0; i < team1.length; i++) {
			
			System.out.print("\t" + team1[i]);
			sum += team1[i];
		}
		
		System.out.println("\t" + sum);
		
		System.out.print("\n토론토");
		
		// 합계 변수 초기화
		sum = 0;
		
		// 토론토 배열 출력
		for(i = 0; i < team2.length; i++) {
			
			System.out.print("\t" + team2[i]);
			sum += team2[i];
			
		}
		
		System.out.println("\t" + sum);

	} // main 끝

} // class 끝
