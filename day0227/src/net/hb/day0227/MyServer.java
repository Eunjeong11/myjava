package net.hb.day0227;

import java.io.IOException;
import java.net.ServerSocket;

public class MyServer {
	public static void main(String[] args) {
		try {
			ServerSocket ss = new ServerSocket();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {System.out.println("에러상관없이 무조건 실행");}

		
	}//end
}//class end
