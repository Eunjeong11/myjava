package net.hb.day23;

public class Test18switch {
	public static void main(String[] args) {
		int kor=90, eng=95, total=0;
		double avg=0.0;
		String res=""; char grade='F';
		
		total=kor+eng;
		avg=(double) total/2; // 87.5 권장
		
		//if~else 학점 구하기
		
//		if(avg >= 90) {grade='A';}
//		else if(avg >= 80) {grade='B';}
//		else if(avg >= 70) {grade='C';}
//		else if(avg >= 60) {grade='D';}
//		else {grade='F';}
		
		//switch(조건){case값: 처리; break;~~default: 처리; break;}
		switch((int)avg/10) {
			case 10:
			case 9:
				grade='A'; break;
			case 8:
				grade='B'; break;
			case 7:
				grade='C'; break;
			case 6:
				grade='D'; break;
			default:
				grade='F'; break;
		}//switch end
		
		if(avg<=59) {res="FALSE";}
		else{res="PASS";}
		
		System.out.println("총점: "+total);
		System.out.println("평균: "+avg);
		System.out.println("학점: "+grade);
		System.out.println("결과: "+res);
		System.out.println("Test18");
	}//end
}//class end