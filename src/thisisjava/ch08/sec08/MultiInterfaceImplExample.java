package thisisjava.ch08.sec08;

public class MultiInterfaceImplExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RemoteControl rc = new SamrtTelevision();

		// RemoteControl 인터페이스에 선언된 추상 메소드만 호출 가능
		rc.turnOn();
		rc.turnOff();

		Searchable searchable = new SamrtTelevision();

		// Searchable 인터페이스에 선언된 추상 메소드만 호출 가능
		searchable.search("https://youtube.com");

		System.out.println();
		
		SamrtTelevision st = new SamrtTelevision();
		st.turnOn();
		st.turnOff();
		st.search("https://naver.com");
		
	} // main 끝

} // class 끝
