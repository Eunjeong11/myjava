package net.hb.day22;

public class Test07 {
	public static void main(String[] args) {
		int num=358;
		String res="";
	  //문제1 num변수 값이 짝수or홀수 구별
		if(num%2==0) {res="짝수";}
		else {res="홀수";}
		//문제2 37숫자는 짝수/홀수 입니다
		System.out.println("num은 "+num+", "+res+"입니다");
	}//end
}//class end
