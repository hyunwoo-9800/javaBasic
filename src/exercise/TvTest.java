package exercise;

class Tv {

	// Tv의 멤버변수
	String color; // 색상
	boolean power; // 전원
	int channel; // 채널

	// Tv의 기능

	void power() {

		power = !power;

	}

	void channelUp() {

		++channel;

	}

	void channelDown() {

		--channel;

	}

}

public class TvTest {

	public static void main(String[] args) {
// TODO Auto-generated method stub

		/*
		 * Tv t; t = new Tv(); t.channel = 7; t.channelDown();
		 * 
		 * System.out.println("현재 채널은 " + t.channel + " 입니다");
		 */

		/*
		 * Tv t1 = new Tv(); Tv t2 = new Tv(); System.out.println("t1의 채널 값은 " +
		 * t1.channel + " 입니다"); System.out.println("t2의 채널 값은 " + t2.channel + " 입니다");
		 * 
		 * t1.channel = 7; System.out.println("t1의 채널 값을 7로 변경하였습니다.");
		 * System.out.println("t1의 채널 값은 " + t1.channel + " 입니다");
		 * System.out.println("t2의 채널 값은 " + t2.channel + " 입니다");
		 */

		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("t1의 채널 값은 " + t1.channel + " 입니다");
		System.out.println("t2의 채널 값은 " + t2.channel + " 입니다");

		t2 = t1; // t1의 값을 t2에 저장
		
		t1.channel = 7;
		System.out.println("t1의 채널 값을 7로 변경하였습니다.");
		System.out.println("t1의 채널 값은 " + t1.channel + " 입니다");
		System.out.println("t2의 채널 값은 " + t2.channel + " 입니다");

	}

}
