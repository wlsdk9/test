package javastudy;

import java.util.concurrent.atomic.AtomicInteger;

public class javatest2 {
	public static void main(String[] args) {
	
		
		int money = 500;
		System.out.println("숫자"+ money);
		money = 1000;
		System.out.println("숫자"+money);
		
		
		String str = "12345";
		int num = 0;
		num = Integer.parseInt(str);
		System.out.println("변경된값"+num);
		
		int numB = 1234;
		String strB = "";
		strB = String.valueOf(numB);
		System.out.println("변경된값"+numB);
		
		
		

	}
}

