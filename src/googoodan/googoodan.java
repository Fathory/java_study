package googoodan;

import java.util.Scanner;

class Googoodan{
	public static void main(String[] args) {
//		// 2단
//		System.out.println("2단");
//		
//		System.out.println(2*1);
//		System.out.println(2*2);
//		System.out.println(2*3);
//		System.out.println(2*4);
//		System.out.println(2*5);
//		System.out.println(2*6);
//		System.out.println(2*7);
//		System.out.println(2*8);
//		System.out.println(2*9);
//		
//		// 3단
//		System.out.println("3단");
//		
//		System.out.println(3*1);
//		System.out.println(3*2);
//		System.out.println(3*3);
//		System.out.println(3*4);
//		System.out.println(3*5);
//		System.out.println(3*6);
//		System.out.println(3*7);
//		System.out.println(3*8);
//		System.out.println(3*9);
//		
//		// 6, 7단
//		// 반복문 사용
//		Scanner scan = new Scanner(System.in);
//		int i = scan.nextInt();
//		int result = 0;
//		int x = 1; // 반복 횟수 변수
//		scan.close(); // 입력받은 후에는 닫아주는 것이 좋음.
//
//		System.out.println(i+"단");
//		// while 반복문 사용
//		while(x<10){
//			result = i*x;
//			System.out.println(result);
//			x++;
//		}
//		

		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		int result = 0;
		scan.close(); // 입력받은 후에는 닫아주는 것이 좋음.
		if(i < 2 || i>9){
			System.out.println("2 이상, 9 이하의 숫자만 입력할 수 있습니다.");
		}else{
			// for 반복문 사용
			for (int y = 1; y < 10; y++) {
				result = i*y;
				System.out.println(result);
			}
		}
	}
}