package net.hb.day0227;

public class Test02String {
	public static void main(String[] args) {
		String jumin = "020202-2123456";//해법
		//String jumin = new String("991103-2134567");//정석
		
		char data = jumin.charAt(7);
		if(data=='1'||data=='3') {System.out.println("남자입니다");}
		else if(data=='2'||data=='4') {System.out.println("여자입니다");}
		else {System.out.println("재입력");}
		}//end
}//class end
