package net.hb.day0226;

public class Work26_03if {
	public static void main(String[] args) {
int a=15,b=17,c=3; //각자 변경해보셔요
	  
		if(a<b && b<c){ 
			 System.out.println("영111  "+ a + " " + b + " " + c);
		}else if(a<b){
			if(c<a) { System.out.println("영222  "+ c + " " + a + " " + b); }
			else { System.out.println("영333  "+ a + " " + c + " " + b);}
		}else if(b<c) { 
			if(a<c) { System.out.println("영444  "+ b + " " + a + " " + c); }
			else { System.out.println("영555  "+ b + " " + c + " " + a); }
		}else {System.out.println("영666  "+ c + " " + b + " " + a); }
	}//end
}//class end
