package algorithm.chap02;

// 1000이하의 소수를 나열(버전 1)
public class PrimeNumber1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cnt = 0;	// 나눗셈의 횟수
		
		for (int n = 2; n <= 1000; n++) {
			
			int i;
			
			for (i = 2; i < n; i++) {
				
				cnt++;
				
				// 나누어 떨어진다면 소수가 아님
				if (n % i == 0) {
					
					break;
					
				}
				
				
			} // 내부 for 종료
			
			// 마지막까지 나누어 떨어지지 않음
			if (n == i) {
				
				System.out.println("소수는? " + n);
				
			}
			
		} // 전체 for 종료
		
		System.out.println("나눗셈을 실행한 횟수: " + cnt);
		
	}

}
