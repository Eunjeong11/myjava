package net.hb.day22;

public class Test08if {
	public static void main(String[] args) {
		int kor=90, eng=50, total=0;
		double avg=0.0;
		String res=""; char grade='F';
		
		total=kor+eng;
		avg=(double) total/2; // 87.5 권장
		
		//if~else 학점 구하기
		
		if(avg >= 90) {grade='A';}
		else if(avg >= 80) {grade='B';}
		else if(avg >= 70) {grade='C';}
		else if(avg >= 60) {grade='D';}
		else {grade='F';}
		
		//평균 70점포함, 각과목 60점포함 국어,영어 각각 60점 합격
		if(kor>=60 && eng>=60 && avg>=70) {res="PASS";}
		else{res="재시험";}
//		if(avg>=70) {
//			if(kor>=60)
//		}
		
		
		System.out.println("국어: "+kor);
		System.out.println("영어: "+eng);
		System.out.println("총점: "+total);
		System.out.println("평균: "+avg);
		System.out.println("학점: "+grade);
		System.out.println("결과: "+res);
	}//end
}//class end