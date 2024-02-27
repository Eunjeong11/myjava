package net.hb.day22;

public class Test05cal {

	public static void main(String[] args) {
		int a=19, b=7;
		//문제1 변수 더하기, 빼기, 곱, 몫, 나머지
		int sum=0, min=0, mul=0, div=0, rem=0;
		//문제2 더하기, 빼기, 곱, 몫, 나머지
		sum=a+b; min=a-b; mul=a*b; div=a/b; rem=a%b;
		//문제3 출력 System.out.println();
		//키보드에서 데이터입력 Scanner sc = new Scanner(System.in);
		System.out.println(a+" + "+b+" = "+sum);
		System.out.println(a+" - "+b+" = "+min);
		System.out.println(a+" * "+b+" = "+mul);
		System.out.println(a+" / "+b+" = "+div);
		System.out.println(a+" % "+b+" = "+rem);
	}//end
}//class end
