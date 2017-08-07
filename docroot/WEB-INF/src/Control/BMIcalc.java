package Control;

import javax.faces.bean.*;


@ManagedBean(name = "BmiView")
public class BMIcalc {

	private double weight;
	private double hight;
    private String message;



	public double getWeight() {
		System.out.println("getWeight");
		return weight;
	}

	public void setWeight(double weight) {
		System.out.println("setWeight");
		this.weight = weight;
	}

	public double getHight() {
		System.out.println("getHight");
		return hight;
	}

	public void setHight(double hight) {
		System.out.println("setHight");
		this.hight = hight;
	}

	public String getMessage() {
		System.out.println("進入取得訊息區");
       double result = this.calcBMI();
        message=String.format("你的ＢＭＩ值是： %3.2f 判定為 %s", result,this.BMICate(result));
       System.out.println("進入取得訊息區結束");
       return message;
	}

	private double calcBMI() {
		System.out.println("進入計算區");
		double result = this.weight / (Math.pow(this.hight, 2));
		String parse = String.format("%3.1f", result);
		System.out.println("進入計算區結束");
		return Double.parseDouble(parse);
	}

	/*
	 * 一般體重 18.5～24 理想體重 22 24 超重 25～30 嚴重超重 30～40 極度超重 40以上
	 */
	private String BMICate(double result) {
		System.out.println("進入分類區");
		if (result > 40) {
			System.out.println("進入分類區結束");
			return "極度超重";
		}
		if (result >= 30) {
			System.out.println("進入分類區結束");
			return "嚴重超重";
		}
		if (result >= 25 && result <= 25) {
			System.out.println("進入分類區結束");
			return "超重";
		}
		if (result == 24) {
			System.out.println("進入分類區結束");
			return "理想體重";
		}
		if (result >= 18.5) {
			System.out.println("進入分類區結束");
			return "一般體重";
		}else{
			System.out.println("進入分類區結束");
			return "錯誤的數值";
		}
		
	}// --分類結束

}// -- 類別結束
