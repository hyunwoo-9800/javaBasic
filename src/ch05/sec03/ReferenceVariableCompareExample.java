/**
 * 
 */
package ch05.sec03;

/**
 * 
 */
public class ReferenceVariableCompareExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 배열 선언
		int[] arr1;
		int[] arr2;
		int[] arr3;
		int[] arr4;
		int[] arr5;

		// 배열 초기화
		arr1 = new int[] { 1, 2, 3 };
		arr2 = new int[] { 1, 2, 3 };
		arr3 = arr2;
		
		// 위쪽 배열의 숫자가 같아서 다른걸로 확인하기 위함
		arr4 = new int[] { 100, 98, 001 };
		arr5 = arr4;

		// 배열의 참조가 같은지 검사
		System.out.println("arr1 == arr2 ?? " + (arr1 == arr2));
		System.out.println("arr2 == arr3 ?? " + (arr2 == arr3));
		System.out.println("arr2 == arr3 ?? " + (arr4 == arr5));
		
	} // main 끝

} // class 끝
