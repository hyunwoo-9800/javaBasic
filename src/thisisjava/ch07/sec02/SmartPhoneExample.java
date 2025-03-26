/**
 * 
 */
package thisisjava.ch07.sec02;

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
		SmartPhone myPhone = new SmartPhone("폴드4", "검정색");

		// Phone으로부터 상속 받은 필드 읽기
		System.out.println("모델: " + myPhone.model);
		System.out.println("색상: " + myPhone.color);

		// SmartPhone의 필드 읽기
		System.out.println("와이파이 상태: " + myPhone.wifi);

		// Phone으로부터 상속 받은 메서드 호출
		myPhone.bell();
		myPhone.sendVoice("여보세요");
		myPhone.reveiveVoice("안녕하세요! 저는 오동욱 입니다");
		myPhone.sendVoice("아~ 네 반갑습니다.");
		myPhone.hangUp();

		// SmartPhone의 메서드 호출
		myPhone.setWifi(true);
		myPhone.internet();

	} // main 끝

} // class 끝
