package thisisjava.ch08.sec08;

public class MultiInterfaceImplExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RemoteControl rc = new SamrtTelevision();

		rc.turnOn();
		rc.turnOff();

		Searchable searchable = new SamrtTelevision();

		searchable.search("https://youtube.com");

	} // main 끝

} // class 끝
