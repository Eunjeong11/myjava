package net.hb.day0226;

import java.util.Scanner;

public class Test05gugudan {
	public static void main(String[] args) {
		System.out.println("구구단");
		
		Scanner scan = new Scanner(System.in);
		System.out.print("단입력 >>> ");
		int dan=scan.nextInt();
		for(int i=0; i<10; i++) {
			System.out.println(dan+"*"+i+"="+(dan*i));
		}
		scan.close();//java.io팩키지및 java.net팩키지 close
	}//end
}//class end
