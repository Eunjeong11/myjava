package net.hb.day23;

import java.util.Scanner;

public class Test16variable {
	public static void main(String[] args) {
		int num=0; //지역변수 값이 없는 상태 출력 문법에러 발생
		
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자입력 >>> ");
		num = scan.nextInt();
		System.out.println("Number : "+num);
		
		
		scan.close();
	}//end
}//class end
