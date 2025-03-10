/**
 * 
 */
package javaTest;

import java.util.Scanner;

/**
 * 
 * 야구게임(공격만)
 * 
 */
public class BaseBallGame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		// 사용자가 입력한 값
		int user = 0;

		// 컴퓨터가 가질 값
		int cum = 0;

		// 타자 배열
		String batterArr[] = new String[9];

		// out 카운트
		int outCnt = 0;

		// 게임 카운트
		int gameCnt = 1;

		// 타자 카운트
		int batterCnt = 0;

		// 타석수 배열
		int[] batArr = new int[9];

		// 안타수 배열
		int[] hitsArr = new int[9];

		// 타율
		double battingAvg = 0;

		// 타자 등록
		System.out.println("===============================================");
		System.out.println("타자를 등록합니다. 등록할 9명의 타자를 적어주세요.");
		System.out.println("===============================================");

		System.out.println();

		for (int i = 0; i < batterArr.length; i++) {

			batterArr[i] = sc.nextLine();

		} // 타자 등록 for 종료

		// 게임 체크용 변수
		boolean check = false;

		System.out.println("게임을 시작합니다.");
		System.out.println();

		// 게임 시작
		do {

			if (9 <= batterCnt) {

				batterCnt = 0;

			}

			// 타석수가 0보다 클 경우만 타율을 계산
			if (0 < batArr[batterCnt]) {

				battingAvg = hitsArr[batterCnt] / batArr[batterCnt];

			}

			System.out.println("===============================================");
			System.out.println("타순 = " + (batterCnt + 1) + "번 타자");
			System.out.println("타자명 = " + batterArr[batterCnt]);
			System.out.println("타율 = " + battingAvg);
			System.out.println("===============================================");

			System.out.println();

			System.out.println("===============================================");
			System.out.println("1 ~ 10 사이의 숫자를 입력해주세요.");
			System.out.println("===============================================");
			System.out.println();

			user = Integer.parseInt(sc.nextLine());
			cum = (int) (Math.random() * 9) + 1;

			if (0 < user && user < 11) {

				// 회차 확인용
				boolean gameCheck = false;
				gameCnt = 1;

				while (!gameCheck) {

					// 3회차일 경우
					if (gameCnt == 3) {

						gameCnt++;
						gameCheck = true;
						break;

					}

					// 안타일 경우
					if (user == cum) {

						System.out.println("안타");

						// 게임 카운트 증가
						gameCnt++;

						// 타석수 증가
						batArr[batterCnt] += 1;

						hitsArr[batterCnt] += 1;

						// 다음 타자로
						batterCnt++;
						break;

					} else {

						// 아웃일 경우
						System.out.println("아웃");

						// 타석수 증가
						batArr[batterCnt] += 1;

						// 아웃 카운트 증가
						outCnt++;

						// 게임 카운트 증가
						gameCnt++;

						// 다음 타자로
						batterCnt++;
						break;

					}

				}

				System.out.println();

				// 3아웃일 경우 1회 종료
				if (outCnt == 3) {

					System.out.println("===============================================");
					System.out.println("1회 종료");
					System.out.println("===============================================");
					System.out.println();

				}

				// 2아웃일 경우 2회 종료
				if (outCnt == 6) {

					System.out.println("===============================================");
					System.out.println("2회 종료");
					System.out.println("===============================================");
					System.out.println();

				}

				// 3아웃일 경우
				if (outCnt == 9) {

					System.out.println("더 하시려면 'yes'를 입력해주세요.");
					String str = sc.nextLine();

					// yes를 입력하면
					if (str.contains("yes")) {

						// 게임 시작
						check = false;

						// 아웃카운트, 게임카운트, 타자 카운트 초기화
						outCnt = 0;
						gameCnt = 1;
						batterCnt = 0;

					} else {

						check = true;

					}

				}

			} else {

				System.out.println("숫자로 입력해주세요");
				continue;

			}

		} while (!check); // do while 종료

		System.out.println("===============================================");
		System.out.println("게임종료");
		System.out.println("===============================================");

		// 스캐너 함수 종료
		sc.close();

	} // main 끝

} // class 끝
