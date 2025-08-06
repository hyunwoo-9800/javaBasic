package algorithm.chap02;

// 배열의 모든 요소의 합을 구하여 출력(확장 for 문)
public class ArraySumForIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] a = { 1.0, 2.0, 3.0, 4.0, 5.0 };
		double sum = 0; // 합계

		for (int i = 0; i < a.length; i++) {

			System.out.println("a[" + i + "] = " + a[i]);

		}

		for (double n : a) {

			sum += n;

		}

		System.out.println("모든 요소의 합은 : " + sum + "입니다.");

	}

}
