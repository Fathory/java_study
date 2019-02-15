package googoodan;

import java.util.Scanner;

class GoogoodanMethod{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		scan.close();
		int[] result = calc(a);
		System.out.println("메소드를 이용한 구구단 출력입니다.");
		print(result);
	}
	static int[] calc(int a){
		int[] result = new int[9];
		for (int i = 0; i < result.length; i++) {
			result[i] = a*(i+1);
		}
		return result;
	}
	static void print(int[] result){
		for(int i = 0; i<result.length; i++){
			System.out.println(result[i]);
		}
	}
}