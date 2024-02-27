package net.hb.day0227;

public class Test04jumin {
	public static void main(String[] args) {
		int kor = 90, eng = 85;
		//kor, eng 같은지 비교
//		if(kor==eng) {System.out.println("kor, eng 동점입니다");}
//		else System.out.println("점수가 다릅니다");
//		System.out.println();
		
		String x= new String("ca");
		String y= new String("cake");
		//String a = new String("kim");
		//String b = new String("kim");
		if(x.equals(y)) {System.out.println("내용데이터 동일합니다");} //equals는 내용이 같은지
		else {System.out.println("서로 다른데이터 입니다");}
		//new 키워드로 생성된
		//변수이름=객체명=오브젝트명 같은지 비교 ==보다는 대상.equals(비교)
	}//end
}//class end
