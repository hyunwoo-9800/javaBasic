/**
 * 
 */
package practice.p_250311.exam02;

/**
 * 
 */
public class P_250310_04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 전체 배열
		int[][] array = {
							{ 95, 86 },
							{ 83, 92, 96 },
							{ 78, 83, 93, 87, 88 }
						};

		// 배열에 담겨있는 숫자의 개수
		int num = 0;

		// 총합
		int sum = 0;

		// 평균
		double avg = 0.0d;

		// 배열의 길이만큼 반복(3번)
		for (int i = 0; i < array.length; i++) {

			// 배열에 저장된 요소의 전체 개수
			num += array[i].length;

			// 점수 합산
			for (int j = 0; j < array[i].length; j++) {

				sum += array[i][j];

			}

		}
		
		// 배열 확인용 for문
		for (int i = 0; i < array.length; i++) {
			
			for (int j = 0; j < array[i].length; j++) {
				
				//System.out.println("array[" + i + "] = " + array[i]);
				
				System.out.println("array[" + i + "]"+ "[" + j + "] = " + array[i][j]);
				
			}
			
		} // for 종료
		
		System.out.println();
		
		// 평균 계산
		avg = sum / num;

		// 출력
		System.out.println("총점은? " + sum);
		System.out.println("평균은? " + avg);

	} // main 끝

} // class 끝
