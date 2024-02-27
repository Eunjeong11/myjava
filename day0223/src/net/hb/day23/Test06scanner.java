package net.hb.day23;

import java.lang.System;
import java.lang.String;
import java.util.Scanner;

public class Test06scanner {
	public static void main(String[] args) {
		System.out.println("구구단");
		int dan=0;
		Scanner scan = new Scanner(System.in);
		System.out.print("원하는 단 입력 >>> ");
		dan = scan.nextInt();
		for(int i=0; i<10; i++) {
			System.out.println(dan+"*"+i+"="+(dan*i));
		}
		
		scan.close();
		//자바의 기본클래스는 java.lang팩키지 포함되어 있으면 import생략가능
		//1. java.util팩키지소속 Scanner클래스
		//2. Scanner scan = new Scanner(System.in);
		//3. 안내문 숫자는 변수=scan.nextInt() 문자는 변수=scan.nextLine()
	}//end
}//class end
