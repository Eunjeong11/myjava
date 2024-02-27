package net.hb.day0227;

import java.util.Scanner;

public class Test08emp {
	public static void main(String[] args) {
		//문제 Scanner클래스 단점 숫자입력후 enter치면 다음라인에서 문자 입력시 문자값대신enter
		int number = 241000;
		String name = null;
		Scanner scan = new Scanner(System.in);
		System.out.println("사번입력 >>> ");
		number = scan.nextInt();
		
		System.out.println("이름입력 >>> ");
		name = scan.nextLine();
		
		System.out.println();
		System.out.println("사번 = "+number+"\t 이름 = "+name);
		System.out.println("화요일 출석체크");
		
	}//end
}//class end
