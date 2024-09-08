package exercise;

import java.util.Arrays;

public class ArrayEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] iArra1 = new int[10];
		int[] iArra2 = new int[10];
//		int[] iArra3 = new int{100, 95, 80, 70, 60};
		int[] iArra3 = {100, 95, 80, 70, 60};
		char[] chArra = {'a', 'b', 'c', 'd'};
		
		for (int i = 0; i < iArra1.length; i++) {
			
			iArra1[i] = i + 1; // 1 ~ 10의 숫자를 순서대로 배열에 저장
			
		}
		
		for (int i = 0; i < iArra2.length; i++) {
			
			iArra2[i] = (int)(Math.random()*10) + 1; // 1 ~ 10의 값을 배열에 저장
			
		}
		
		// 배열에 저장된 값들을 출력
		for (int i = 0; i < iArra1.length; i++) {
			
			System.out.print(iArra1[i]+",");
			
		}
		
		System.out.println();
		System.out.println(Arrays.toString(iArra1));
		System.out.println(Arrays.toString(iArra2));
		System.out.println(Arrays.toString(iArra3));
		System.out.println(Arrays.toString(chArra));
		System.out.println(iArra1);
		System.out.println(iArra2);
		System.out.println(iArra3);
		System.out.println(chArra);
		
		
	} // main 끝

}
