package thisisjava.javaTest.roulette;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// 룰렛 게임
public class RouletteGame {

	private Scanner sc = new Scanner(System.in);

	private int remainCnt; 											// 잔여 시도 횟수
	private int revenue; 											// 매출액

	Roulette roulette = new Roulette("기기아이디", "지점명"); 			// 인스턴스화

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		// 인스턴스화 후 메서드 호출
		RouletteGame rouletteGame = new RouletteGame();
		rouletteGame.strart();

	} // main 끝

	// 시작용 메서드
	public void strart() {

		try {

			System.out.println("===============================================");
			System.out.println("룰렛 게임을 시작합니다.");
			System.out.println("기기아이디 : " + roulette.getDeviceId());
			System.out.println("지점명 : " + roulette.getBranchName());
			System.out.println("메뉴를 선택해 주세요.");
			System.out.println("1.충전 | 2.게임시작 | 3.마감");
			System.out.println("===============================================");

			System.out.println();

			String menuNo = sc.nextLine();

			boolean flag = check(menuNo);

			if (flag) {

				System.out.println("입력값은 1 ~ 3까지의 숫자로 입력해주세요.");
				System.out.println();
				strart();

			} else {

				// 입력 받은 값에 따라 메서드 호출
				switch (menuNo) {

				case "1" -> charge(); 							// 충전 메서드 호출
				case "2" -> gameStart(); 						// 게임 시작 메서드 호출
				case "3" -> stopGame(); 						// 마감 메서드 호출

				}

			}

		} catch (NumberFormatException e) {

			// TODO: handle exception
			System.out.println("입력하신 값을 다시 확인해 주세요.");
			System.out.println();
			strart();

		} catch (Exception e) {

			// TODO: handle exception
			System.out.println("입력하신 값을 다시 확인해 주세요.");
			System.out.println();
			strart();

		}

	}

	// 금액 충전용 메서드
	public void charge() {

		try {

			// 잔여 횟수가 남아있을 경우
			if (remainCnt > 0) {

				System.out.println("잔여 횟수가 남아 있습니다. 추가 충전이 불가능합니다.");
				strart();

			}

			int chargeMoney; 										// 충전 금액

			System.out.println("[충전 금액을 입력해주세요.]");
			System.out.println("[1000원 단위로 입력해주세요.]");
			System.out.print("금액 : ");

			String tmp = sc.nextLine();
			boolean flag = check(tmp);

			if (flag) {

				int i = Integer.parseInt(tmp); 						// 형변환

				// 1000원 단위일 경우만 충전
				if (i % 1000 == 0) {

					chargeMoney = i;

					int oneRound = 500; 							// 게임 1회당 500원

					remainCnt = remainCnt + chargeMoney / oneRound; // 잔여횟수 = 잔여횟수 + 충전금액 / 500원

					revenue += chargeMoney; 						// 매출액

					roulette.setRevenue(revenue);
					
					System.out.println(revenue + "원을 충전하였습니다.");
					System.out.println(remainCnt + "번 게임이 가능합니다.");
					System.out.println();

				} else {

					System.out.println("[충전 금액은 1000원 단위로 입력해주세요.]");
					System.out.println();

				}

				strart();													// 시작용 메서드 호출

			} else {
				
				System.out.println("입력하신 충전 금액을 확인해주세요.");
				System.out.println();
				
			}

		} catch (NumberFormatException e) {

			// TODO: handle exception
			System.out.println("입력하신 값을 다시 확인해 주세요.");
			System.out.println();
			strart();														// 시작용 메서드 호출

		} catch (Exception e) {

			// TODO: handle exception
			System.out.println("입력하신 값을 다시 확인해 주세요.");
			System.out.println();
			strart();														// 시작용 메서드 호출

		}

	}

	// 게임 시작용 메서드
	public void gameStart() {

		int successesCnt = 0; 												// 성공횟수
		int failureCnt = 0; 												// 실패횟수

		Roulette roulette = new Roulette();									// 게임 시작 시 데이터 초기화
		
		// 잔여 횟수가 없을 경우
		if (remainCnt == 0) {

			System.out.println("잔여시도횟수가 없습니다. 충전해주세요!");

			strart();
		}

		for (int i = 0; i < remainCnt; i++) {

			int rouletteRange = (int) (Math.random() * 6) + 1; 				// 룰렛용 랜덤 값
			int random = (int) (Math.random() * 6) + 1; 					// 사용자용 랜덤 값

			int point = 0; // 점수 저장용

			// 룰렛과 사용자의 값이 1 ~ 4 범위일 경우
			if (0 < random && random < 5 && 0 < rouletteRange && rouletteRange < 5) {

				// 해당 값에 맞게 점수를 세팅
				switch (rouletteRange) {

				case 1 -> point = 1;
				case 2 -> point = 2;
				case 3 -> point = 3;
				case 4 -> point = 4;

				}

				System.out.println((i + 1) + "회차 : 성공입니다!");
				System.out.println(point + "점을 획득했습니다.");

				successesCnt++; 											// 성공횟수 증가
				roulette.setSuccessesCnt(successesCnt); 					// 성공횟수 세팅

				roulette.setTotalPoint(roulette.getTotalPoint() + point); 	// 전체점수 세팅

				System.out.println();

			} else {

				System.out.println((i + 1) + "회차 : 실패 입니다!");

				point = 0; 													// 범위를 벗어났으므로 0점
				failureCnt++; 												// 실패횟수 증가
				roulette.setFailureCnt(failureCnt); 						// 실패횟수 세팅

				System.out.println(point + "점을 획득했습니다.");
				System.out.println();

			}

		}

		// 전체 횟수와 점수 출력
		System.out.println("성공 횟수 : " + roulette.getSuccessesCnt());
		System.out.println("실패 횟수 : " + roulette.getFailureCnt());
		System.out.println("총합 점수 : " + roulette.getTotalPoint());

		System.out.println();

		remainCnt = 0; 														// 잔여시도 횟수 초기화
		strart();															// 시작용 메서드 호출
	}

	// 마감용 메서드
	public void stopGame() {

		// 잔여 횟수가 남아있을 경우
		if (remainCnt > 0) {

			System.out.println("마감이 불가능합니다. 잔여 횟수가 남아 있습니다.");
			strart(); 														// 시작용 메서드 호출

		} else {

			// 지점의 매출액을 표시한 후 종료
			System.out.println(roulette.getBranchName() + "의 오늘의 매출액 : " + roulette.getRevenue());
			System.exit(0);

		}

	}

	// 입력 값 검증용 메서드
	// 파라미터 tmp는 입력 한 값
	public static boolean check(String tmp) {

		String userX = tmp; 								// 파라미터로 넘어온 값을 저장
		char strX; 											// 문자열을 문자 단위로 분리해 검증할 변수
		boolean flag = false; 								// 입력 값 확인용 플래그

		String regex1 = "[!@#$%^&*]"; 						// 특수 문자 확인용
		String regex2 = "^[ㄱ-ㅎ가-힣a-zA-Z]*$"; 				// 입력한 문자가 영어 혹은 한글인지 판단하기 위함
		Pattern pattern1 = Pattern.compile(regex1); 		// 특수 문자가 문자열에 있는지 확인하기 위한 정규식
		Pattern pattern2 = Pattern.compile(regex2); 		// 영어 혹은 한글이 문자열에 포함되어있는지 확인하기 위한 정규식

		for (int i = 0; i < userX.length(); i++) {

			strX = userX.charAt(i); 						// 입력 받은 문자열을 차례대로 꺼냄

			Matcher matcher1 = pattern1.matcher(userX); 	// 입력 받은 문자열에 특수 문자가 포함되었는지 확인
			Matcher matcher2 = pattern2.matcher(userX); 	// 입력 받은 문자열에 특수 문자가 포함되었는지 확인

			// 문자열이 포함되었다면 숫자가 아님
			if (Character.isDigit(strX) == false) {

				flag = true;

			} else if (matcher1.find() || matcher2.find()) {

				// 입력 받은 문자열이 정규식에 선언한 문자열이 포함되었다면 숫자가 아님
				flag = true;

			}

		} // for 종료

		// 입력 값이 1, 2, 3이 아닐 경우
		if (!flag) {

			int user = Integer.parseInt(userX);

			if (user < 0 || 4 < user) {

				flag = true;

			}

		}

		return flag;

	} // 메서드 종료

}
// class 끝
