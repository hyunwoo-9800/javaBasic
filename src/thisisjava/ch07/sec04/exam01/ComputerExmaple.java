/**
 * 
 */
package thisisjava.ch07.sec04.exam01;

// 오버라이딩
public class ComputerExmaple extends Calculator {

	public static void main(String[] args) {
		
        int r = 10;        

        Calculator calculator = new Calculator();
        System.out.println("원면적 = " + calculator.areaCircle(r));        
        System.out.println();        

        Computer computer = new Computer();
        System.out.println("원면적 = " + computer.areaCircle(r));

    } // main 끝

} // class 끝
