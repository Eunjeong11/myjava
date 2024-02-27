package net.hb.day0226;

public class Test12bit {
	public static void main(String[] args) {
		//p.121 bit연산
		int x=5, y=8; //5=0000 0101 8=0000 1000
		int a = x&y;//and
		int b = x|y;//or
		int c = x^y;//xor
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}//end
}//class end
