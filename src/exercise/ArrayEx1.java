package exercise;

public class ArrayEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] score = new int[5];
		int k = 1;

		score[0] = 50;
		score[1] = 60;
		score[k + 1] = 70; // socre[2] = 70;
		score[3] = 80;
		score[4] = 90;

		// int tmp = score[3] + [4];
		int tmp = score[k + 2] + score[4];

		for (int i = 0; i < 5; i++) {

			System.out.printf("score[%d] : %d\n", i, score[i]);

		}

		System.out.printf("tmp : %d\n", tmp);

		// index의 범위를 벗어난 값
		System.out.printf("score[%d] : %d\n", 7, score[7]);

	} // main 끝

} // class 끝
