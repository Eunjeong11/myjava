package net.hb.day0226;

import java.util.Scanner;

public class 은정Work26_05coffee {
	public static void main(String[] args) {
	  Scanner scan = new Scanner(System.in);
		
		System.out.println("-----coffee-----");
		System.out.println("1.아메리카노-2500원");
		System.out.println("2.카페라테-3500원");
		System.out.println("3.카페모카-4000원");
		System.out.println("메뉴를 선택하세요");
		int menu = scan.nextInt();
		
		System.out.print("주문 수량 >>> ");
		int amount = scan.nextInt();
		
		System.out.print("입금액 >>> ");
		int money = scan.nextInt();
		System.out.println();
		
		String coffee = ""; //커피 종류 저장될 변수
		int price = 0; //커피가격
		
		switch(menu) {
		case 1 : 
			coffee = "아메리카노";
			price = 2500;
			break;
		case 2 : 
			coffee = "카페라떼";
			price = 3500;
			break;
		case 3 : 
			coffee = "카페모카";
			price = 4000;
			break;
		default :
			System.out.println("선택하신 커피는 없는 메뉴입니다.");}
		
		int sum = (price*amount); //총 금액
		int change = money - sum; //거스름돈
		
		System.out.println("주문한 메뉴 : "+coffee);
		System.out.println("커피 가격 : %d"+price);
		System.out.println("입금액 : "+money);
		System.out.println("총금액 : "+sum);
		System.out.println("거스름돈 : %d"+change);
		scan.close();
	}//end
}//class end
