package thisisjava.ch08.sec12;

public class Bus implements Vehicle {

	// 메서드 오버라이딩
	@Override
	public void run() {
		// TODO Auto-generated method stub

		System.out.println("버스가 달립니다.");

	}

	public void checkFare() {

		System.out.println("승차요금을 체크합니다.");

	}

} // class 끝
