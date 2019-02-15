package googoodan;

import java.util.Scanner;

class googoodanClass{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		scan.close();
		if( a<2 || a>9){
			System.out.println("2부터 9 사이의 값만 입력할 수 있습니다.");
		}else{
			int[] result = googoodanMethod.calc(a);
			System.out.println("클래스를 이용한 구구단 출력입니다.");
			googoodanMethod.print(result);
		}
	}
}