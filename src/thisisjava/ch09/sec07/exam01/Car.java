package thisisjava.ch09.sec07.exam01;

// 익명 객체
public class Car {

	private Tire tire1 = new Tire();

	// 필드에 익명 자식 객체 대입
	private Tire tire2 = new Tire() {

		@Override
		public void roll() {
			// TODO Auto-generated method stub

			System.out.println("익명 자식 Tire 객체 1이 굴러갑니다.");
		}

	};

	// 메서드, 핃드 이용
	public void run1() {

		tire1.roll();
		tire2.roll();

	}

	// 메서드, 로컬 변수 이용
	public void run2() {

		Tire tire = new Tire() {

			@Override
			public void roll() {
				// TODO Auto-generated method stub

				System.out.println("익명 자식 Tire 객체 2가 굴러갑니다.");
			}

		};

		tire.roll();
	}

	// 메서드, 매개변수 이용
	public void run3(Tire tire) {

		tire.roll();

	}

} // class 끝
