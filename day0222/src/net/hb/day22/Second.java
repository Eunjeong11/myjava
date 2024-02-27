package net.hb.day22;

public class Second {
	public static void main(String[] args) {
		int kor=90, eng=85, total=0;
		double avg=0.0;
		
		total=kor+eng;
		avg=(double) total/2; // 87.5 권장
		//avg=total/2; 87.0 가능
		//int myavg=total/2; 비권장 87출력
		
		System.out.println("국어="+kor);
		System.out.println("영어="+eng);
		System.out.println("총점="+total);
		System.out.println("평균"+avg);
		//System.out.println("평균="+myavg);
	}//end
}//class end