package net.hb.day0226;

public class Test07koreng {
	public static void main(String[] args) {
		int kor=90, eng=85, total=0;
		double avg=0.0;
		char grade='F';
//		String result="";
		
		total=kor+eng;
		avg=(double) total/2; 
		
//		if(avg>=70) {result="축합격";}
//		else {result="재시험";}
		//if~else 조건연산 변수 = 조건? 만족: 불만족;
		String info = avg >= 70 ? "pass" : "failed" ;
		int add = avg >= 70 ? 10 : 2 ;
		boolean flag = avg >= 70 ? true : false ;
		
		System.out.println("총점: "+total);
		System.out.println("평균: "+avg+" 평균="+(int)avg);
		System.out.println("결과: "+info);
		System.out.println("가산점수 "+add+"점 추가");
		System.out.println("결과"+flag);
	}//end
}//class end