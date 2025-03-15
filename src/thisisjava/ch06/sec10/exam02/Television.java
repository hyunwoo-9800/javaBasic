/**
 * 
 */
package thisisjava.ch06.sec10.exam02;

/**
 * 정정 블록
 */
public class Television {

	// 정적 필드
	static String company = "Samsung";
	static String model = "galaxy";
	static String info;

	/**
	 * default 생성자
	 */
	public Television() {
		// TODO Auto-generated constructor stub
	}

	// 정적 블록
	static {

		info = company + "-" + model;

	}

} // class 끝
