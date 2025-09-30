package algorithm.practice.chap05;

// 8 퀸 문제 풀이(시각화 하기)
public class Q9 {

	static boolean[] flag_a = new boolean[8];	// 각 행에 퀸을 배치했는지 체크
	static boolean[] flag_b = new boolean[15];	// ／ 대각선 방향으로 퀸을 배치했는지 체크
	static boolean[] flag_c = new boolean[15];	// ＼ 대각선 방향으로 퀸을 배치했는지 체크
	
	static int[] pos = new int[8];				// 각 열에 있는 퀸의 위치
	
	static int cnt = 1;
	
	// 각 열에 있는 퀸의 위치를 출력
	static void print() {
		
		System.out.println(" " + cnt + "번째 해");
		
		for (int i = 0; i < 8; i++) {
			
			for (int j = 0; j < 8; j++) {
				
				System.out.printf("%s", j == pos[i] ? " ■ " : " □ ");
				
			}
			
			System.out.println();
			
		}
		
		cnt++;
		
		System.out.println();
		
	}

	// i열에 알맞은 위치에 퀸을 배치
	static void set(int i) {
		
		for (int j = 0; j < 8; j++) {
			
			// 가로(j행), ／ 대각선 방향, ＼ 대각선 방향에 아직 배치하지 않았을 경우
			if (!flag_a[j] && !flag_b[i + j] && !flag_c[i - j + 7]) {
				
				pos[i] = j;			// 퀸을 j행에 배치
				
				if (i == 7) {		// 모든 열에 배치
					
					print();
					
				} else {
					
					flag_a[j] = true;
					flag_b[i + j] = true;
					flag_c[i - j + 7] = true;
					
					set(i + 1);
					
					flag_a[j] = false;
					flag_b[i + j] = false;
					flag_c[i - j + 7] = false;
					
				}
				
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		set(0);							// 0열에 퀸을 배치

	}

}
