package algorithm.chap03;

// 제네릭 클래스의 예
public class GenericClassTester {

	// 제네릭 클래스의 매개변수를 T라고 작성함
	static class GenericClass<T> {
		
		private T xyz;
		
		// 생성자
		public GenericClass(T t) {
			
			// TODO Auto-generated constructor stub
			this.xyz = t;
			
		}
		
		// xyz getter
		T getXyz() {
			
			return xyz;
			
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 다음과 같이 매개변수에 String을 넘길 수도 있고 Integer를 넘길 수도 있음
		GenericClass<String> s = new GenericClass<String>("ABC");
		GenericClass<Integer> n = new GenericClass<Integer>(15);
		
		System.out.println("s = " + s.getXyz());
		System.out.println("n = " + n.getXyz());

	}

}
