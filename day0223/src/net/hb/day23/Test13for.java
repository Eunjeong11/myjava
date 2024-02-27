package net.hb.day23;
public class Test13for {
	public static void main(String[] args) {
		int num=0;
		for(int i=0; i<10; i++) { //while(true){}==for( ; ; ){}
			num=num++;
			System.out.print(num+" ");}
			
			num=0;
			while(true) {
				num=num++;
				if(num==5) {continue;}
				System.out.println(num+" ");
				if(num==10) {break;}
			}
	}//end
}//class end
