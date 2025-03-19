/**
 * 
 */
package test;

import java.util.HashSet;

/**
 * 
 */
public class Test04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Integer> lotto = new HashSet<Integer>();

		int random = 0;

		boolean check = false;

		while (!check) {

			random = (int) ((Math.random() * 45) + 1);

			lotto.add(random);

			if (lotto.size() > 5) {

				check = true;

			}

		}

		System.out.print("이번 주 로또 예상 번호는 ");
		System.out.println(lotto + " 입니다.");

	}

}
