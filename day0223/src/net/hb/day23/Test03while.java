package net.hb.day23;
public class Test03while {
	public static void main(String[] args) {
		System.out.println("while(true)반복문");
		int i=0, total=0;
		while(true) {
			i=i+1;
			System.out.println(i+" ");
			total=total+i;
			if(i==10) {break;}
			}
		System.out.println("total="+total);
	}//end
}//class end
