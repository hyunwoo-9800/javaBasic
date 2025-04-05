package thisisjava.ch14.ex;

public class AddThread implements Runnable {

	private Bank b;
	private String name;

	public AddThread(String name, Bank b) {

		this.name = name;
		this.b = b;

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		try {

			for (int i = 0; i < 10; i++) {

				Thread.sleep(1000);
				b.addMoney(1000);
				
				System.out.println(this.name + "현재 잔고 : " + b.getMoney());
				String threadName = Thread.currentThread().getName();
				System.out.println("AddThread 현재 스레드 이름 : " + threadName);

			}

		} catch (Exception e) {
			// TODO: handle exception

			e.printStackTrace();

		} // try - catch

	}

} // class 끝
