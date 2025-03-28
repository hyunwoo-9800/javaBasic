package thisisjava.ch08.sec08;

public class SamrtTelevision implements RemoteControl, Searchable {

	// default 생성자
	public SamrtTelevision() {
		// TODO Auto-generated constructor stub
	}

	// 메서드 오버라이딩
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub

		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub

		System.out.println("TV를 끕니다.");

	}

	@Override
	public void search(String url) {
		// TODO Auto-generated method stub

		System.out.println(url + "을 검색합니다.");

	}

} // 인터페이스 끝
