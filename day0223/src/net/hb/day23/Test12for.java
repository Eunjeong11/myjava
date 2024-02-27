package net.hb.day23;
public class Test12for {
	public static void main(String[] args) {
		int num=0, total=0;
		for(int i=0; i<10; i++) { //while(true){}==for( ; ; ){}
			num=num++;
			System.out.println(num+" ");
			total=total+num;
			}
		System.out.println("total="+total);
	}//end
}//class end
