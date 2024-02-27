package net.hb.day22;

public class Test03if {
	public static void main(String[] args) {
		int kor=90, eng=85, total=0;
		double avg=0.0;
		String res="";
		
		total=kor+eng;
		avg=(double) total/2; // 87.5 권장
		
		if(avg == 100){res="축합격 보너스지급";}
		else if(avg >= 70) {res="축합격";}
		else {res="재시험";}
		
		System.out.println("총점="+total);
		System.out.println("평균="+avg);
		System.out.println("결과="+res);
	}//end
}//class end