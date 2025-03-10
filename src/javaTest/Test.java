/**
 * 
 */
package javaTest;

import java.util.Scanner;

/**
 * 
 */
public class Test {

	public static void main(String[] args) {
		// 타자 등록
		String playerArr[] = { "일번타자", "이번타자", "삼번타자", "사번타자", "오번타자", "육번타자", "칠번타자", "팔번타자", "구번타자" };

		Scanner scan = new Scanner(System.in);

		int hitCnt = 0; // 안타수
		int outCnt = 0; // 아웃수
		int totalRound = 3; // 총횟수
		int playerIndex = 0; // 타자 순서 인덱스

		int batCntArr[] = new int[9]; // 선수별 타석수
		int hitCntArr[] = new int[9]; // 선수별 안타수
		double battingAvg = 0; // 타율

		System.out.println("===3단계 게임을 시작합니다===");

		// 총횟수만큼만 게임 진행
		for (int i = 1; i <= totalRound; i++) {
			System.out.printf("***%d회차\n", i);
			System.out.println();

			while (true) {
				// 선수 입장문
				System.out.printf(">>>%d번 타자 '%s선수' 입장 !!\n", (playerIndex + 1), playerArr[playerIndex]); // 선수배열[인덱스]

				// 선수별 타율 표시
				if (batCntArr[playerIndex] > 0) { // 첫타석이 아니면
					battingAvg = (double) (hitCntArr[playerIndex] / batCntArr[playerIndex]);
				}
				System.out.printf(">>>타율:%.2f(안타:%d/타석:%d)\n", battingAvg, hitCntArr[playerIndex],
						batCntArr[playerIndex]);

				int pitchBall = (int) (Math.random() * 10) + 1; // 투수가 던지는 공

				System.out.print("공을 던져주세요 : ");
				int playerBall = scan.nextInt(); // 유저가 입력한 공

				// 입력한 공이 1~10을 벗어나면
				if (playerBall < 1 || playerBall > 10) {
					System.out.println("*공은 1~10까지 던질 수 있습니다.*");
				} else { // 1~10 사이로 잘 입력했으면

					// 투수공과 유저공이 같은면 안타수 증가
					if (pitchBall == playerBall) {
						hitCnt++;
					} else { // 다르면 아웃수 증가
						outCnt++;
					}

					playerIndex++; // 다음 선수를 위해 값 증가
					// 9명의 선수가 다 출루했으면 초기화
					if (playerIndex == playerArr.length) {
						playerIndex = 0;
					}
					System.out.printf("[투수:%d 플레이어:%d 안타:%d 아웃:%d]\n", pitchBall, playerBall, hitCnt, outCnt);
					System.out.println();

					// 아웃 3번이 되면 반복문 종료
					if (outCnt == 3) {
						System.out.printf("===%d회차를 종료합니다===\n", i);
						break;
					}
				}
			}
			outCnt = 0; // 다음 회차 시작 전에 아웃수 초기화
		}
		System.out.println("===게임을 종료합니다===");
	}

}
