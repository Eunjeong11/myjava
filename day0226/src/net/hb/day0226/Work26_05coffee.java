package net.hb.day0226;

import java.util.Scanner;

public class Work26_05coffee {
	public static void main(String[] args) {
		//1. Scanner클래스 키보드입력
		//2. scan.nextLine()문자열입력 int형변환 Integer.parsetInt(String)
		//3. 반복문 while(true){}
		//4. 제어문 if~else if~elses
		int sel=9, money=0, i=0,j=0,k=0;
		String msg="", info="", res="";
		
		Scanner scan=new Scanner(System.in);
		System.out.print("금액입력 >>> ");
		String data = scan.nextLine();
		//money = scan.nextInt(); //비권장
		money = Integer.parseInt(data); //권장
		
		while(true) {
			System.out.println("\t*--- 커피자판기 ---*");
			System.out.println("1.믹스커피(300) 2.코코아(250) 3.반환 9.종료");
			System.out.print("메뉴선택 >>> ");
		//sel = scan.nextInt(); //비권장
			sel = Integer.parseInt(scan.nextLine());//권장
			
			if(sel==9) {
				System.out.println("커피머신 프로그램을 종료합니다");
				 break;}
		}//while end
	}//end
}//class end
