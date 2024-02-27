package net.hb.day0227;

import java.util.Scanner;

public class Mygugudan {
	public static void main(String[] args) {
		int kor = 89; //자바에서 null값은 클래스타입, interface 타입
		char flag = 'b'; //char 타입은 무조건 ''
		//null값은 클래스의 초기값에 사용
		
		int dan =1;
		Scanner scan = null; //new Scanner(System.in);
		
		try {
		System.out.print("단입력 >>> ");
		dan=scan.nextInt();
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
