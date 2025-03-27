package thisisjava.ch07.sec10.exam02;

public class AbstractMethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 인스턴스화
		Dog dog = new Dog();
		dog.sound();

		// 인스턴스화
		Cat cat = new Cat();
		cat.sound();

		System.out.println("=============");

		// 매개변수의 다형성
		animalSound(new Dog());
		animalSound(new Cat());

	} // main 끝

	// 메서드
	public static void animalSound(Animal animal) {

		animal.sound();

	}

} // class 끝
