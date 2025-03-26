/**
 * 
 */
package thisisjava.ch07.sec02.exam02;

/**
 * 
 */
public class SmartPhoneExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 인스턴스화
		SmartPhone myPhone = new SmartPhone("갤럭시", "은색");

		// 상속 값 출력
		System.out.println("모델: " + myPhone.model);
		System.out.println("색상: " + myPhone.color);

	} // main 끝

} // class 끝
