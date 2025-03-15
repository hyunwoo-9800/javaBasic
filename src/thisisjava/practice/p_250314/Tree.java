/**
 * 
 */
package thisisjava.practice.p_250314;

/**
 * 
 */
public class Tree {

	// 나무 이름
	String mango = "";
	String papaya = "";
	String banana = "";
	String lemon = "";

	// 가격
	int mangoPrice = 0;
	int papayaPrice = 0;
	int bananaPrice = 0;
	int lemonPrice = 0;

	// 걸리는 시간
	int mangoHour = 0;
	int papayaHour = 0;
	int bananaHour = 0;
	int lemonHour = 0;

	// 산 개수
	int mangoBuyNum = 0;
	int papayaBuyNum = 0;
	int bananaBuyNum = 0;
	int lemonBuyNum = 0;

	// 살 수 있는 최대 개수
	int mangoMaxNum = 0;
	int papayaMaxNum = 0;
	int bananaMaxNum = 0;
	int lemonMaxNum = 0;

	// default 생성자
	public Tree() {

	}

	// 생성자
	public Tree(String mango, String papaya, String banana, String lemon, int mangoPrice, int papayaPrice,
			int bananaPrice, int lemonPrice, int mangoHour, int papayaHour, int bananaHour, int lemonHour,
			int mangoBuyNum, int papayaBuyNum, int bananaBuyNum, int lemonBuyNum, int mangoMaxNum, int papayaMaxNum,
			int bananaMaxNum, int lemonMaxNum) {
		
		this.mango = mango;
		this.papaya = papaya;
		this.banana = banana;
		this.lemon = lemon;
		this.mangoPrice = mangoPrice;
		this.papayaPrice = papayaPrice;
		this.bananaPrice = bananaPrice;
		this.lemonPrice = lemonPrice;
		this.mangoHour = mangoHour;
		this.papayaHour = papayaHour;
		this.bananaHour = bananaHour;
		this.lemonHour = lemonHour;
		this.mangoBuyNum = mangoBuyNum;
		this.papayaBuyNum = papayaBuyNum;
		this.bananaBuyNum = bananaBuyNum;
		this.lemonBuyNum = lemonBuyNum;
		this.mangoMaxNum = mangoMaxNum;
		this.papayaMaxNum = papayaMaxNum;
		this.bananaMaxNum = bananaMaxNum;
		this.lemonMaxNum = lemonMaxNum;
	}

} // class 끝
