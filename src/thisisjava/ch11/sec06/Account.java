package thisisjava.ch11.sec06;

public class Account {

	private long balance;

	// default 생성자
	public Account() {

	}

	// 현재 잔고
	public long getBalance() {

		return balance;

	}

	// 예금 처리
	public void deposit(int money) {

		balance += money;

	}

	// 출금 처리
	public void withdraw(int money) throws InsufficientException {

		if (balance < money) {

			throw new InsufficientException("잔고 부족 : " + (money - balance) + "원 모자람");

		}

		balance -= money;

	}

} // class 끝
