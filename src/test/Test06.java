package test;

import java.util.Random;

public class Test06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random random = new Random();
		
		int randomInt = random.nextInt(10) + 1;
		
		System.out.println("random = " + randomInt);
		
		if (randomInt % 2 == 0) {
			
			System.out.println("사자");
			
		} else {
			
			System.out.println("사지말자");
			
		}
		
	}

}
