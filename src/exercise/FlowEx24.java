package exercise;

public class FlowEx24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 11;
		
		System.out.println("자, 이제 카운트다운을 시작합니다.");
		
		// i--, i != 0 동안 반복
		while (i--!=0) {
			
			// 아무런 내용도 없는 빈 문장
			// 시간지연을 위해 사용
			for (int j = 0; j < 2_000_000_000; j++) {
				;				
			}
			
			System.out.println(i);
			
		} // while 끝
		
		System.out.println("GAME OVER");
		
	} // main 끝

} // class 끝
