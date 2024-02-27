package net.hb.day0227;

public class Test01if {
	public static void main(String[] args) {
		int kor = 90, eng = 85;
		//kor, eng 같은지 비교
		if(kor==eng) {System.out.println("kor, eng 동점입니다");}
		else System.out.println("점수가 다릅니다");
		System.out.println();
		
		String a= new String("kim");
		String b= new String("kim");
		if(a==b) {System.out.println("kim데이터 동일합니다");}
		else {System.out.println("다른데이터 입니다");}
	}//end
}//class end
