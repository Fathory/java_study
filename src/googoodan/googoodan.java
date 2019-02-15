package googoodan;

import java.util.Scanner;

class TwoThree{
	public static void main(String[] args) {
		// 2단
		System.out.println("2단");
		
		System.out.println(2*1);
		System.out.println(2*2);
		System.out.println(2*3);
		System.out.println(2*4);
		System.out.println(2*5);
		System.out.println(2*6);
		System.out.println(2*7);
		System.out.println(2*8);
		System.out.println(2*9);
		
		// 3단
		System.out.println("3단");
		
		System.out.println(3*1);
		System.out.println(3*2);
		System.out.println(3*3);
		System.out.println(3*4);
		System.out.println(3*5);
		System.out.println(3*6);
		System.out.println(3*7);
		System.out.println(3*8);
		System.out.println(3*9);
		
		// Scanner Java Util Add
		// 콘솔에서 값을 입력받을 수 있는 유틸
		// 4, 5단
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		int result = 0;
		scan.close(); // 입력받은 후에는 닫아주는 것이 좋음.
		System.out.println(i+"단");
		result = i*1;
		System.out.println(result);
		result = i*2;
		System.out.println(result);
		result = i*3;
		System.out.println(result);
		result = i*4;
		System.out.println(result);
		result = i*5;
		System.out.println(result);
		result = i*6;
		System.out.println(result);
		result = i*7;
		System.out.println(result);
		result = i*8;
		System.out.println(result);
		result = i*9;
		System.out.println(result);
	}
}