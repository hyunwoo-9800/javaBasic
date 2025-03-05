package exercise;

public class ArrayEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[5];

		// 배열 arr에 1~5의 값을 저장
		for (int i = 0; i < arr.length; i++) {

			arr[i] = i + 1;

		} // for 끝

		// 배열에 저장된 값을 출력
		System.out.println("변경전 - arr.length : " + arr.length);

		for (int i = 0; i < arr.length; i++) {

			System.out.println("arr[" + i + "] : " + arr[i]);

		} // for 끝

		// 배열 arr에 저장된 값을 다른 배열에 복사

		int[] tmp = new int[arr.length * 2];

		for (int i = 0; i < arr.length; i++) {

			tmp[i] = arr[i];

		} // for 끝

		// tmp에 저장된 값을 arr에 저장
		arr = tmp;

		// 배열에 저장된 값을 출력
		System.out.println("변경후 - arr.length : " + arr.length);

		for (int i = 0; i < arr.length; i++) {

			System.out.println("arr[" + i + "] : " + arr[i]);

		} // for 끝

	} // main 끝

} // class 끝
