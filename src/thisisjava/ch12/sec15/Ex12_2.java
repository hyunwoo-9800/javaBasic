package thisisjava.ch12.sec15;

public class Ex12_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 올림
		System.out.println("3.51 올림 = " + Math.ceil(3.51) + "\n");

		// 내림
		System.out.println("13.61 버림 = " + Math.floor(13.61) + "\n");

		// 반올림
		System.out.println("12.8 반올림 = " + Math.round(12.8) + "\n");

		// 절대값 구하기
		System.out.println("절대값 1 = " + Math.abs(-4.55));
		System.out.println("절대값 2 = " + Math.abs(-50) + "\n");

		// 최대값 구하기
		int maxValue = Math.max(30, 60);

		// 최소값 구하기
		int minValue = Math.min(40, 70);

		System.out.println("40, 70 최소값 = " + minValue);
		System.out.println("30, 60 최대값 = " + maxValue);

	} // main 끝

} // class 끝
