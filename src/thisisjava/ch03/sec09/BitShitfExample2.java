/**
 * 
 */
package thisisjava.ch03.sec09;

/**
 * 
 */
public class BitShitfExample2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int value = 772;

		// 우측으로 3바이트 이동하고 끝 1바이트만 읽음
		byte byte1 = (byte) (value >>> 24);
		int int1 = byte1 & 255;

		System.out.println("첫 번째 바이트 부호 없는 값 = " + int1);

		// 우측으로 2바이트 이동하고 끝 1바이트만 읽음
		byte byte2 = (byte) (value >>> 16);
		int int2 = Byte.toUnsignedInt(byte2);

		System.out.println("두 번째 바이트 부호 없는 값 = " + int2);

		// 우측으로 1바이트 이동하고 끝 1바이트만 읽음
		byte byte3 = (byte) (value >>> 8);
		int int3 = byte3 & 255;

		System.out.println("두 번째 바이트 부호 없는 값 = " + int3);

		// 끝 1바이트만 읽음
		byte byte4 = (byte) value;
		int int4 = Byte.toUnsignedInt(byte4);

		System.out.println("두 번째 바이트 부호 없는 값 = " + int4);

	} // main 끝

} // class 끝
