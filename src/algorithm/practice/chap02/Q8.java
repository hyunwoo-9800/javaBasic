package algorithm.practice.chap02;

import java.time.LocalDate;
import java.util.Scanner;

// n일 뒤, n일 후의 날짜를 계산
public class Q8 {
	
	static Scanner sc = new Scanner(System.in);

	static class YMD {

		int y; // 년
		int m; // 월
		int d; // 일

		public YMD(int y, int m, int d) {
			// TODO Auto-generated constructor stub

			this.y = y;
			this.m = m;
			this.d = d;

		}

	}

	// 월별 최대 일수
	static int[] mdays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	// 윤년 체크 함수
	static boolean isLeap(int year) {

		return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

	}

	// 윤년이면 2월을 29일로 변경
	static int getMonthDays(int year, int month) {
		
		if (month == 2 && isLeap(year)) {
			
			return 29;
			
		}
		
		return mdays[month - 1];
		
	}
	
	// n 일 뒤의 날짜 계산
	static void afterYMD(int y, int m, int d) {

		int n = 0;

		System.out.println("몇 일 뒤의 날짜를 구할까요?");
		n = Integer.parseInt(sc.nextLine());

		d += n;

		while (true) {
			
			int daysInMonth = getMonthDays(y, m);
			
			if (d <= daysInMonth) {
				
				break;
				
			}
			
			d -= daysInMonth;
			m++;
			
			if (12 < m) {
				
				m = 1;
				y++;
				
			}
			
		}
		
		System.out.println(n + "일 뒤의 날짜는 " + y + "년 " + m + "월 " + d + "일 입니다.");

	}
	
	// n일 전의 날짜 계산
	static void beforeYMD(int y, int m, int d) {

		int n = 0;

		System.out.println("몇 일 전의 날짜를 구할까요?");
		n = Integer.parseInt(sc.nextLine());

		d -= n;

		while (d <= 0) {
			
			m--;
			
			if (m < 1) {
				
				m = 12;
				y--;
				
			}
			
			d += getMonthDays(y, m);
			
		}
		
		System.out.println(n + "일 전의 날짜는 " + y + "년 " + m + "월 " + d + "일 입니다.");

	}

	public static void main(String args[]) {

		LocalDate now = LocalDate.now(); // 현재 날짜 구하기

		int year = now.getYear(); // 년도
		int month = now.getMonthValue(); // 월
		int day = now.getDayOfMonth(); // 일

		YMD ymd = new YMD(year, month, day);

		System.out.println("오늘 날짜는 " + ymd.y + "년 " + ymd.m + "월 " + ymd.d + "일" + "입니다.");

		afterYMD(ymd.y, ymd.m, ymd.d);
		
		beforeYMD(ymd.y, ymd.m, ymd.d);
		
		sc.close();
		
	}

}
