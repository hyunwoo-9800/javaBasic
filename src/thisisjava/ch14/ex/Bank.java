package thisisjava.ch14.ex;

public class Bank {

	private int money;

	public int getMoney() {
		return money;
	}

//	public void addMoney(int money) {
//
//		this.money += money;
//
//	}

	public synchronized void addMoney(int money) {

		this.money += money;

	}

} // class 끝
