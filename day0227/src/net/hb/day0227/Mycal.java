package net.hb.day0227;

public class Mycal {
	public static void main(String[] args) {
		int a=7, b=4;
		int sum=0, rem=0;
		double div=0.0;
		
		try {
			sum=a+b;
			div=a/b;
			rem=a%b;
		} catch (Exception e) {System.out.println("에러원인"+e);}
		
		System.out.println("더하기 = "+sum);
		System.out.println("나누기 = "+div);
		System.out.println("나머지 = "+rem);
		System.out.println("TUE");
		
	}//end
}//class end
