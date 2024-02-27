package net.hb.day0226;

public class Test10cal {
	public static void main(String[] args) {
		//단항연산
		int a=4, b=4, tot=0, sum=0;
//		a--;
//		--b;
		tot = a++ +3;
		sum = ++b +3;
		System.out.println("a="+a+"\t tot="+tot);
		System.out.println("b="+b+"\t sum="+sum);
		
		System.out.println();
		int num = 10;
		for(int i=0; i<5; i++) {
			//10 9 8 7 6 num변수
			System.out.print(num+" ");
			num=num-1; //1씩감소
		}
	}//end
}//class end
