package net.hb.day23;
public class Test15break {
	public static void main(String[] args) {
		//break, continue
		boolean boolflag=false;
		String name="kim";
		int age = 23;
		//break; //loop반복 아니면 switch제어문
		//continue; //loop반복 단독사용X
		//return; //자바에서 return 문장은 마지막에 기술
		if(boolflag==true) {
		System.out.println("이름="+name+"나이="+age);
		System.out.printf("name %s \n age %d", name, age);}
		System.out.println("last");
	}//end
}//class end
