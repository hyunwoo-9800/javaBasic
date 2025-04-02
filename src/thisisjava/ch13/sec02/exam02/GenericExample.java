package thisisjava.ch13.sec02.exam02;

public class GenericExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HomeAgency hacy = new HomeAgency();
		Home home = hacy.rent();
		home.turnOnLight();

		CarAgency cay = new CarAgency();
		Car car = cay.rent();
		car.run();

	} // main 끝

} // class 끝
