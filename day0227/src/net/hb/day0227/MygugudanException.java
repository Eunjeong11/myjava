package net.hb.day0227;

import java.util.Scanner;

public class MygugudanException {
	public static void main(String[] args) {
		System.out.println("구구단");
		
		Scanner scan = new Scanner(System.in);
		
		try {
		System.out.print("단입력 >>> ");
		int dan=scan.nextInt();
		for(int i=1; i<10; i++) {
			System.out.println(dan+"*"+i+"="+(dan*i));}
		} catch(Exception ex) {}
		
		scan.close();//java.io팩키지및 java.net팩키지 close
		
		int a=9,b=5;
    int hap=0, nmg=0;
    double mok = 0.0;

     mok=a/b ; //몫연산
     nmg=a%b ; //나머지연산
     hap=a+b ;
     
     System.out.println();
     System.out.println("몫 = " + mok);
     System.out.println("나 = " + nmg);
     System.out.println("합 = " + hap);
     System.out.println("마지막처리 필수");
	}//end
}//class end
