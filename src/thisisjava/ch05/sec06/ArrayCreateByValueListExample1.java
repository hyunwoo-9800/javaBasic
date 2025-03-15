/**
 * 
 */
package thisisjava.ch05.sec06;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 
 */
public class ArrayCreateByValueListExample1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 배열 선언
		String[] season = { "Spring", "Summer", "Fall", "Winter" };

		// 배열의 항목값 읽기
//		for (int i = 0; i < season.length; i++) {
//			
//			System.out.println("Spring 배열");
//			System.out.println("season[" + i + "] = " + season[i]);
//			
//		}

		// 읽을 때 마다 카운트를 증가시켜 배열의 인덱스를 확인 하기 위함
		AtomicInteger counter = new AtomicInteger(0);

		// 람다식 표현
		Arrays.stream(season).forEach(s -> System.out.println("season[" + counter.getAndIncrement() + "] = " + s));

		// 배열 값 변경
		season[1] = "야, 여름이다.";
		System.out.println("season[1] = " + season[1]);

		// 개행용
		System.out.println();

		// 배열 선언
		int[] score = { 83, 90, 87 };

		// 총합을 저장할 변수
		int sum = 0;

		// 총합
		for (int i = 0; i < score.length; i++) {

			sum += score[i];

		}

		// 평균
		double avg = (double) sum / 3;

		System.out.println("총합과 평균 구하기");
		System.out.println("총합 = " + sum);
		System.out.println("평균 = " + avg);

		// 개행용
		System.out.println();

		// 배열 선언
		int[] arr1 = new int[3];

		System.out.println("인덱스 번호 넣기");

		System.out.println("배열의 초기값");

		// 배열 초기값 출력
		for (int i = 0; i < arr1.length; i++) {

			System.out.println("arr1[" + i + "] = " + arr1);

		}

		System.out.println("배열의 인덱스로 초기화");
		for (int i = 0; i < arr1.length; i++) {

			arr1[i] = i;
			System.out.println("arr[" + i + "] = " + arr1[i]);

		}

		// 개행용
		System.out.println();

		// double형 배열
		System.out.println("double형 배열 연습");
		double[] dArr;

		// 배열선언
		dArr = new double[3];
		dArr[0] = 0.1d;
		dArr[1] = 0.3d;
		dArr[2] = 0.5d;

		// 배열 값 출력
		for (int i = 0; i < dArr.length; i++) {

			System.out.println("dArr[" + i + "] = " + dArr[i]);

		}

		System.out.println();

		System.out.println("String형 배열 연습");
		String[] strArr;

		strArr = new String[3];
		strArr[0] = "1월";
		strArr[1] = "2월";
		strArr[2] = "3월";

		for (int i = 0; i < strArr.length; i++) {

			System.out.println("strArr[" + i + "] = " + strArr[i]);

		}

		System.out.println();

		System.out.println("배열로 총합과 평균 구하기");
		int[] iArr = { 100, 50, 80, 94 };
		int iArrSum = 0;

		for (int i = 0; i < iArr.length; i++) {

			iArrSum += iArr[i];

		}

		double iArrAvg = iArrSum / iArr.length;

		System.out.println("총점은 = " + iArrSum + " 평균은 = " + iArrAvg);

	} // main 끝

} // class 끝
