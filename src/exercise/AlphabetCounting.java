package exercise;

import java.util.Arrays;
import java.util.Scanner;

public class AlphabetCounting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] alpha = new char[26]; // 알파벳을 넣을 배열
		int[] cnt = new int[26]; 	// 카운팅하기 위한 배열

		System.out.println("대문자 알파벳을 입력하세요. >>");

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		// 문자열 확인
		System.out.println("입력된 알파벳 = " + str);

		// 입력받은 문자열 길이만큼 반복
		for (int i = 0; i < str.length(); i++) {
			// 배열 길이 만큼 반복
			for (int j = 0; j < alpha.length; j++) {

				// 배열에 A ~ Z까지의 알파벳 저장
				alpha[j] = (char) (65 + j); // 아스키코드 65 = 'A'를 의미

				// 배열에 저장된 알파벳과 입력받은 문자열을 비교
				if (alpha[j] == str.charAt(i)) {
					// 비교하여 같다면 카운팅 배열에 추가
					cnt[j]++;
				} // if 끝

			} // for 끝

		} // for 끝
		
		// 결과값을 리스트형으로 출력
		System.out.println(Arrays.toString(alpha));
		System.out.println(Arrays.toString(cnt));
		sc.close();

	} // main 끝

}
