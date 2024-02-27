package net.hb.day23;
public class Test11dowhile {
	public static void main(String[] args) {
		int num=0, total=0;
		do {
			num=num+1;
			System.out.print(num+" ");
			total=total+num;
		} while(num<10);
		System.out.println("total="+total);
	}//end
}//class end
