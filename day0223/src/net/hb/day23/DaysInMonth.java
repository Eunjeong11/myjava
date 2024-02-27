package net.hb.day23;

import java.util.Scanner;

public class DaysInMonth {
	public static void main(String[] args) {
		int month ;
		int year = 2011;
		int lastDay = 9;
		
		System.out.print("원하는 달을 입력하세요 : ");
		Scanner input = new Scanner(System.in);
		month = input.nextInt();
		
		switch(month) {
		case 4:
		case 6:
		case 9:
		case 11:
			lastDay = 30; break;
		case 2:
			lastDay = 28; break;
		default:
			lastDay = 31; break;
		}
		System.out.println(month+"월의 마지막 날은 "+lastDay+"일입니다.");
	}//end
}//class end
