package net.hb.day0226;

public class Test13bit {
	public static void main(String[] args) {
	//p.109 관계연산자, 비교연산자 대소연산, 등가연산 최종결과는 true/false
			int a=5, b=8;
			int tot = a+b;
			boolean ret1 = a>b;
			System.out.println(a+">"+b+" 결과는 "+ ret1);
			System.out.println(a+"<"+b+" 결과는 "+ (a<b));
			System.out.println(a+"=="+b+" 결과는 "+ (a==b));
			System.out.println(a+"!"+b+" 결과는 "+ (a!=b));
			System.out.println(a+"<="+b+" 결과는 "+ (a<=b));
			System.out.println(a+">="+b+" 결과는 "+ (a>=b));
	
//			if(ret1==true) {System.out.println(a+">"+b+" 결과는 "+ ret1);}
//			else {System.out.println(a+">"+b+" 결과는 "+ ret1);}
	}//end
}//class end
