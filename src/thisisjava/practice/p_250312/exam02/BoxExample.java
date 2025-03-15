/**
 * 
 */
package thisisjava.practice.p_250312.exam02;

/**
 * Box객체를 활용한 부피구하기
 */
public class BoxExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 인스턴스화
		Box box = new Box(20, 20, 30);
		
		int width = box.width;
		int length = box.length;
		int height = box.height;

		// 메서드 호출
		double result = box.boxVolume(width, length, height);

		// 출력
		System.out.println("상자의 가로,세로,높이는 " + width + ", " + length + ", " + height + "입니다.");
		System.out.println("상자의 부피는 " + result + "입니다.");

	} // main 끝

} // class 끝
