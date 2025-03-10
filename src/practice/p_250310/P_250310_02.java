/**
 * 
 */
package practice.p_250310;

/**
 * 
 */
public class P_250310_02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1000번 반복
		for (int i = 1; i <= 1000; i++) {

			System.out.print(i + "단계 = ");

			// 값을 String형으로 변환
			String str = String.valueOf(i);

			// 값에 3, 6, 9가 포함 되어있다면
			if (str.contains("3") || str.contains("6") || str.contains("9")) {

				// 값에 33, 36, 39, 63, 69, 99가 포함되어있다면
				if (str.contains("33") || str.contains("36") || str.contains("39") || str.contains("63")
						|| str.contains("69") || str.contains("99")) {
					
					System.out.print("짝짝");
					
				} else {

					System.out.print("짝");

				}

			} else {

				// 10의 배수라면
				if (i % 10 == 0) {

					System.out.print("뽀숑");

				} else {

					System.out.print(i);

				}

			}

			System.out.println();
		}

	} // main 끝

} // class 끝
