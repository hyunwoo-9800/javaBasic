package thisisjava.ch08.sec13;

// 봉인된 인터페이스
public sealed interface InterfaceA permits InterfaceB {

	void methodA();

} // 인터페이스 끝
