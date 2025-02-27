/**
 * 
 */
package ch02.sec06;

/**
 * 
 */
public class TextBlockExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "" +
				"{\n" +
				"\t\"id\" : \"winter\",\n" +
				"\t\"name\" : \"눈송이\"\n" +
				"}"
				;
		
		// java 13부터 제공하는 텍스트 블록
		String str2 = """
		{
			"id" : "winter",
			"name" : "눈송이"
		}
		""";
		
		System.out.println(str1);
		System.out.println("============================================");
		System.out.println(str2);
		System.out.println("============================================");
		
		// 텍스트 블록에서 \는 줄바꿈을 하지 않고 출력 > java 14부터 제공
		String str3 = """
				나는 자바를 \
				학습합니다.
				나는 자바 고수가 될 겁니다.
				""";
		System.out.println(str3);
			
	} // main 끝

} // TextBlockExample 끝
