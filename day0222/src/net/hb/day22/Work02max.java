package net.hb.day22;
public class Work02max {
	public static void main(String[] args) {
		int a=-19, b=-20, c=0, temp=0;
		//가장 큰수 9출력 if제어문으로
//		if(a>b)b=a;
//		if(c>b)b=c;
//		System.out.println("최대값은 "+b); //내가한거
		
		if(a>b) {temp=a;} //5>9 처리못함
		if(b>a) {temp=b;} //9>4 처리 temp=9
		if(c>temp) {temp=c;} //4>9 처리못함
		System.out.println("최대값은 " + temp);
	}//end
}//class end
