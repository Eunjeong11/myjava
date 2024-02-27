package net.hb.day0226;

public class Test02char {
	public static void main(String[] args) {
	//int, char 타입은 ascii= American Standard Code for Information Interchange 
			//char 연산을 하면 ascii코드값 연산 0:48 1:49 2:50 ~~ 9:57 A:64B:66~ a:97 b:98
			char a='a'; //97
		  char b='2'; //50
		  System.out.println(a+b);
		  System.out.println(a+" "+b+" "); // a 2
		  
		  System.out.println("char타입연산 아스키코드");
		  System.out.println();
		  int x=a;
		  int y=b;
		  System.out.println(x+" "+y+" ");
	}//end
}//class end
