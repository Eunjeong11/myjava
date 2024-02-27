package net.hb.day22;

public class Work01if {
	public static void main(String[] args) {
		int a=99, b=11, c=-100;//적은숫자 출력
		//if~else
		if(a>b && b>c) {System.out.println(c+" "+b+" "+a);}
		else if(b>c && c>a) {System.out.println(a+" "+c+" "+b);}
		else if(c>b && b>a) {System.out.println(a+" "+b+" "+c);}
		else if(a>c && c>b) {System.out.println(b+" "+c+" "+a);}
		else if(b>a && a>c) {System.out.println(c+" "+a+" "+b);}
		else {System.out.println(b+" "+a+" "+c);}
		
		
	}//end
}//class end
