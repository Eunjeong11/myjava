package net.hb.day23;

import java.util.Scanner;

public class Test08emp {
	public static void main(String[] args) {
		//문제 Scanner클래스 이름데이터입력, 주소데이터입력
		String name="", address="";
		Scanner scan = new Scanner(System.in);
		System.out.print("이름을 입력하세요>>");
		name = scan.nextLine();
		System.out.print("주소를 입력하세요>>");
		address = scan.nextLine();
		
		System.out.println();
		System.out.println("이름 : "+name);
		System.out.println("주소 : "+address);
		
		scan.close();
	}//end
}//class end
