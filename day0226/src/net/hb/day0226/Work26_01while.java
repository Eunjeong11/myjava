package net.hb.day0226;

public class Work26_01while {
	public static void main(String[] args) {
		int num=0, i=0;
		//while(true){1~30숫자 6줄로출력}
		while(true) {
			i++;
			System.out.print(i+"\t");
			if(i%5==0) {System.out.println();}
			if(i==30) break;
		}
		System.out.println("while해결");
	}//end
}//class end
