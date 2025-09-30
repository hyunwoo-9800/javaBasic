package algorithm.practice.chap05;

// 8 퀸 문제 풀이(시각화 하기 및 비재귀적 구현)
public class Q10 {

	// --- 보드 크기/대각선 보정 ---
	static final int N = 8;
	static final int SHIFT = N - 1; 							// (i - j + SHIFT) 가 음수 안 되도록 보정

	// --- 점유 체크 테이블 ---
	static boolean[] flagRow = new boolean[N]; 					// 각 행 사용 여부
	static boolean[] flagDiagSlash = new boolean[2 * N - 1]; 	// ／ 대각선 (i + j)
	static boolean[] flagDiagBack = new boolean[2 * N - 1]; 	// ＼ 대각선 (i - j + SHIFT)

	// --- 해 표현 ---
	static int[] pos = new int[N]; 								// pos[i] = i열(=col)의 행 인덱스
	static int solutionCount = 1;

	// --- 보드 출력 ---
	static void print() {

		System.out.println(" " + solutionCount + "번째 해");

		// 열 인덱스 헤더
		System.out.print("   ");

		for (int j = 0; j < N; j++) {

			System.out.printf("%2d ", j);

		}

		System.out.println();

		// 행 인덱스 + 보드
		for (int i = 0; i < N; i++) {

			System.out.printf("%2d  ", i);

			for (int j = 0; j < N; j++) {

				System.out.print(j == pos[i] ? "■  " : "□  ");

			}

			System.out.println();

		}

		System.out.println();
		solutionCount++;

	}

	// --- i열의 알맞은 위치에 퀸을 배치 (비재귀) ---
	static void set(int i) {

		int j = 0;
		int[] jstk = new int[N]; // 각 열에서 마지막으로 시도한 행을 저장하는 스택 역할

		Start: while (true) {

			j = 0;

			while (true) {

				while (j < N) {

					// 행/대각선 충돌 없으면 배치
					if (!flagRow[j] && !flagDiagSlash[i + j] && !flagDiagBack[i - j + SHIFT]) {

						pos[i] = j;

						// 마지막 열까지 배치 끝
						if (i == N - 1) {

							print();

						} else {

							flagRow[j] = flagDiagSlash[i + j] = flagDiagBack[i - j + SHIFT] = true; 	// 사용 플래그 세팅 + 다음 열로
							jstk[i++] = j; 																// 현재 열에서 선택한 행 기억
							continue Start; 															// 다음 열 탐색 시작

						}

					} // if 종료

					j++;

				} // while 종료

				// 현재 열에서 더 이상 놓을 곳이 없으면 백트래킹
				if (--i == -1) {

					return; // 모든 경우 탐색 완료

				}

				j = jstk[i]; 																	// 되돌아온 열에서 다시 시작할 행
				flagRow[j] = flagDiagSlash[i + j] = flagDiagBack[i - j + SHIFT] = false; 		// 해제
				j++; 																			// 다음 행부터 재시도

			} // 내부 while 종료

		} // Start while 종료

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		set(0); // 0열에 퀸을 배치

	}

}
