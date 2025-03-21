/**
 * 
 */
package thisisjava.javaTest;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BaseBallGame2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in); 					// 입력받을 함수

		ArrayList batter = new ArrayList(); 					// 타자 저장용 배열

		int[] bat = new int[9]; 								// 타석수 저장용 배열
		int[] hit = new int[9]; 								// 안타수 저장용 배열
		int batCnt = 0; 										// 타석수 증가용
		int hitCnt = 0; 										// 안타수 증가용

		int user = 0; 											// 사용자 입력 값
		int com = 0; 											// 컴퓨터 랜덤 값

		int outCnt = 0; 										// 아웃 여부 확인용
		int cnt = 1; 											// 회차 확인용
		int batterCnt = 0; 										// 타자 변경용

		double battingAvg = 0; 									// 타율

		System.out.println("==================================");
		System.out.println("야구게임 시작");
		System.out.println("==================================");

		System.out.println();

		// 게임 시작
		for (;;) {

			// 타자 배열에 값이 없으면 실행
			if (batter.isEmpty()) {

				batterList(batter);

			}

			com = (int) (Math.random() * 10) + 1; 						// 컴퓨터 랜덤 값

			battingAvg = avg(bat, hit, batterCnt); 						// 타율 계산

			System.out.println((batterCnt + 1) + "번째 타자는 " + batter.get(batterCnt) + "입니다.");
			System.out.println(batter.get(batterCnt) + "선수의 타율은 " + battingAvg + "입니다.");

			System.out.println("==================================");
			System.out.println("숫자를 입력 해주세요");

			String checkStr = sc.nextLine();

			boolean flag = check(checkStr, 1);

			if (flag) {

				System.out.println("입력값은 0 ~ 10까지의 숫자로 입력해주세요.");
				continue;

			}

			user = Integer.parseInt(checkStr);							// 사용자 입력 값

			// 안타 여부 확인
			if (user == com) {

				System.out.println();
				System.out.println();
				System.out.println();
				
				System.out.println("안타입니다.");
				System.out.println("==================================");
				
				System.out.println();
				System.out.println();
				System.out.println();

				hitCnt++; 												// 안타 수 증가
				hit[batterCnt] = hitCnt + hit[batterCnt]; 				// 안타를 친 선수의 안타 배열에 안타 저장
				hitCnt = 0; 											// 안타 수 초기화

				batCnt++; 												// 타석 수 증가
				bat[batterCnt] = batCnt + bat[batterCnt]; 				// 타석에 올라온 선수의 배열에 타석수 증가
				batCnt = 0; 											// 타석 수 초기화

				batterCnt++; 											// 다음 선수로

				// 9명의 선수가 전부 타석에 올랐다면 처음 선수를 부르기 위해 초기화
				if (batterCnt == 9) {

					batterCnt = 0;

				}

				continue; 												// 안타를 치면 다음 번 타자로 이행

			} else {

				System.out.println();
				System.out.println();
				System.out.println();
				
				System.out.println("아웃입니다.");
				System.out.println("==================================");
				
				System.out.println();
				System.out.println();
				System.out.println();

				batCnt++; 												// 타석 수 증가
				bat[batterCnt] = batCnt + bat[batterCnt]; 				// 타석에 올라온 선수의 배열에 타석수 증가
				batCnt = 0; 											// 타석 수 초기화

				outCnt++; 												// 아웃 카운트 증가
				batterCnt++; 											// 다음 선수로

				// 9명의 선수가 전부 타석에 올랐다면 처음 선수를 부르기 위해 초기화
				if (batterCnt == 9) {

					batterCnt = 0;

				}

			} // 안타 여부 확인 if 종료

			// 게임 종료 여부 확인
			// outCnt가 3의 배수일 때 마다 각 회차 종료
			if (outCnt % 3 == 0) {

				System.out.println("==================================");
				System.out.println(cnt + "회차 종료");
				System.out.println("==================================");
				
				System.out.println();
				System.out.println();
				System.out.println();

				cnt++; 													// 회차 증가

				// 3회차 까지만 진행하기 위함
				if (cnt < 4) {

					continue;

				} else {

					// 3회차가 넘어가면 게임 종료
					System.out.println("==================================");
					System.out.println("게임 종료!");
					System.out.println("==================================");
					break;

				}

			} // 게임종료 확인용 if 종료

		} // for 종료

	} // main 끝
	
	

	// 타자 저장용 메서드
	public static ArrayList batterList(ArrayList batter) {

		Scanner sc = new Scanner(System.in);

		for (;;) {

			System.out.println("등록할 타자 9명을 입력해주세요.(영어 혹은 한글로 입력해주세요.)");

			String checkStr = sc.nextLine();									// 입력 받은 값을 저장

			boolean flag = check(checkStr, 0);									// 입력 받은 값 검증

			if (flag) {

				// 영어 혹은 한글이 아니라면
				System.out.println("타자는 영어 또는 한글로 입력해주세요.");
				System.out.println();
				continue;

			} else {
				
				batter.add(checkStr); 											// 형식에 맞다면 입력 받은 값을 배열에 저장
				System.out.println("입력한 타자는 " + batter + "입니다. \n");			// 입력된 타자를 출력

			}

			// 입력 받은 값이 9개면 종료
			if (batter.size() == 9) {

				return batter;

			}

		} // for 종료

	} // 메서드 종료
	

	// 타율 계산용 메서드
	public static double avg(int[] bat, int[] hit, int batterCnt) {

		int batX = 0; 										// 타석 수
		int hitY = 0; 										// 안타 수
		double avg = 0; 									// 타율

		// 타석 or 안타 배열 값이 0이 아니면
		if (bat[batterCnt] != 0 || hit[batterCnt] != 0) {

			batX = bat[batterCnt]; 							// 타석 배열에서 해당하는 선수의 타석 수
			hitY = hit[batterCnt]; 							// 안타 배열에서 해당하는 선수의 안타 수
			avg = (double) hitY / (double) batX; 			// 타율 계산

		}

		return avg;

	} // 메서드 종료

	
	// 입력 값 검증용 메서드
	// 파라미터 tmp는 입력 한 값, 파라미터 count는 검증할 로직 판단(0이면 타자 배열, 1이면 사용자 입력 값)
	public static boolean check(String tmp, int count) {

		String userX = tmp;												// 파라미터로 넘어온 값을 저장
		char strX;														// 문자열을 문자 단위로 분리해 검증할 변수
		boolean flag = false;											// 입력 값 확인용 플래그

		String regex = "[!@#$%^&*]";									// 특수 문자 확인용
		Pattern pattern = Pattern.compile(regex);						// 특수 문자가 문자열에 있는지 확인하기 위한 정규식

		String batterRegex = "^[ㄱ-ㅎ가-힣a-zA-Z]*$";						// 입력한 문자가 영어 혹은 한글인지 판단하기 위함
		Pattern batterPattern = Pattern.compile(batterRegex);			// 영어 혹은 한글이 문자열에 포함되어있는지 확인하기 위한 정규식

		// 타자 배열 검증인 경우
		if (count == 0) {

			Matcher matcher = batterPattern.matcher(userX);				// 입력 값에 영어 혹은 한글이 포함되어있는지 확인

			if (!matcher.find()) {

				// 입력 받은 문자열에 영어 혹은 한글이 없다면
				flag = true;

			}

			return flag;
			
		} else if (count == 1) {
		  // 입력 값 검증인 경우
			
			// 전체 문자열 만큼 반복
			for (int i = 0; i < userX.length(); i++) {

				
				strX = userX.charAt(i);									// 입력 받은 문자열을 차례대로 꺼냄

				
				Matcher matcher = pattern.matcher(userX);				// 입력 받은 문자열에 특수 문자가 포함되었는지 확인

				// 문자열이 포함되었다면 숫자가 아님
				if (Character.isDigit(strX) == false) {

					flag = true;

				} else if (matcher.find()) {

					// 입력 받은 문자열이 정규식에 선언한 문자열이 포함되었다면 숫자가 아님
					flag = true;

				}

			}

			return flag;

		}

		return flag;

	} // 메서드 종료

} // class 끝
