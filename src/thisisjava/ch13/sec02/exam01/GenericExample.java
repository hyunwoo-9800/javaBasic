package thisisjava.ch13.sec02.exam01;

public class GenericExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product<Tv, String> product1 = new Product<Tv, String>();

		product1.setKind(new Tv());
		product1.setModel("스마트Tv");

		Tv tv = product1.getKind();
		String tvModel = product1.getModel();
		System.out.println("tv : " + System.identityHashCode(tv));
		System.out.println("tvModel : " + tvModel + "\n");

		Product<Car, String> product2 = new Product<Car, String>();

		product2.setKind(new Car());
		product2.setModel("SUV자동차");

		Car car = product2.getKind();
		String carModel = product2.getModel();
		System.out.println("car : " + System.identityHashCode(car));
		System.out.println("carModel : " + carModel);

	} // main 끝

} // class 끝
