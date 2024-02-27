package net.hb.day0226;

public class Work26_04reverse {
	public static void main(String[] args) {
		int num = 5942;
		int div=0, rem=0, rev=0;
		System.out.println("원본 "+num);//5942
		
		System.out.print("역순 ");//2495
		//문제 산술연산 /몫 %나머지 이용 5942/10=594 5942%10=2 594/10=59 594&10=4
		/*
		while(true) {
			//if제어문 break기술
			rem = num % 10;
			div = num / 10;
			num=div;
			System.out.print(rem);
			if(num==0) break;}
			*/
		while(true) {
			rem = num %10;
			num=num/10;
			rev=rev*10+rem;
			if(num==0) break;
		}//while end
		//return num;
		System.out.print(rev);
	}//end
}//class end
