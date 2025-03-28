package thisisjava.ch08.sec09;

public class ExtendsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InterfaceCImpl impl = new InterfaceCImpl();

		InterfaceA ia = impl;
		ia.methodA();
//		ia.methodB(); InterfaceA 와 InterfaceB는 아무 관계도 아니기에 호출 불가
		System.out.println();

		InterfaceB ib = impl;
//		ib.methodA(); InterfaceA 와 InterfaceB는 아무 관계도 아니기에 호출 불가
		ib.methodB();
		System.out.println();

//		InterfaceC는 InterfaceA 와 InterfaceB를 상속받아서 모두 호출 가능
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();

	} // main 끝

} // class 끝
