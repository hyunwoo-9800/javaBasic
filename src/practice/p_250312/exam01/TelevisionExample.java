/**
 * 
 */
package practice.p_250312.exam01;

/**
 * Television 객체 활용
 */
public class TelevisionExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 인스턴스화
		Television LGTelevision = new Television(7, 9, true);

		// 출력
		System.out.println("LGTelevision의 현재 채널은? " + LGTelevision.channel);
		System.out.println("LGTelevision의 현재 볼륨은? " + LGTelevision.volume);
		System.out.println("LGTelevision 켜져있나? " + LGTelevision.onOff);

		// 개행용
		System.out.println();

		// 인스턴스화
		Television SamsungTelevison = new Television(9, 10, true);

		// 출력
		System.out.println("SamsungTelevison의 현재 채널은? " + SamsungTelevison.channel);
		System.out.println("SamsungTelevison의 현재 볼륨은? " + SamsungTelevison.volume);
		System.out.println("SamsungTelevison 켜져있나? " + SamsungTelevison.onOff);

	} // main 끝

} // class 끝
