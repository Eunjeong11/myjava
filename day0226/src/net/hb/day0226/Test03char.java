package net.hb.day0226;

public class Test03char {
	public static void main(String[] args) {
	//int, char 타입은 ascii= American Standard Code for Information Interchange 
		//char 연산을 하면 ascii코드값 연산 0:48 1:49 2:50 ~~ 9:57 A:64B:66~ a:97 b:98
		char sum='c'; //99
	  char tot='A'; //65
	  System.out.println(sum+tot);
	  System.out.println(sum+" "+tot+" ");
	  int kor = (int)sum;
	  int eng = (int)tot;
	  System.out.println(kor+" "+eng+" ");
	  
	  char x= (char)kor;
	  char y= (char)eng;
	  System.out.println(x+" "+y+" ");
	}//end
}//class end
