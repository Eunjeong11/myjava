package net.hb.day22;

public class Test04escape {
	public static void main(String[] args) {
		int kor=90, eng=85, total=0;
		double avg=0.0;
		
		total=kor+eng;
		avg=(double) total/2; // 87.5 권장
		
		System.out.println("국어="+kor);
		System.out.println("영어="+eng);
		System.out.println("총점="+total);
		System.out.println("평균="+avg);
		System.out.println(); //<br>태그역할
		System.out.println("국어\t영어\t총점\t평균");
		System.out.println(kor+"\t"+eng+"\t"+total+"\t"+avg);
		
		System.out.println();
		System.out.println();
		System.out.println();
		
	}//end
}//class end