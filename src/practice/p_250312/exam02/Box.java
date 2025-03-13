/**
 * 
 */
package practice.p_250312.exam02;

/**
 * 박스의 부피를 구하는 클래스
 */
public class Box {

	// 가로
	int width = 0;

	// 세로
	int length = 0;

	// 높이
	int height = 0;

	/**
	 * default 생성자
	 */
	public Box() {
		// TODO Auto-generated constructor stub
	}

	// 생성자
	public Box(int width, int length, int height) {
		
		// 초기화
		this.width = width;
		this.length = length;
		this.height = height;
		
	}
	
	// 부피를 구하는 메서드
	double boxVolume(int width, int length, int height) {
		
		double result = (double) width * (double) length * (double) height;

		return result;

	}

} // class 끝
