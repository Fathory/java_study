package javaCalendar;

import java.util.Scanner;

class javaSum{
	public static void main(String[] args) {
		System.out.println("두 수를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		scan.close();
		String[] a = s.split(" ");
		int sum = 0;
		for(int i = 0; i<a.length; i++){
			sum += Integer.parseInt(a[i]);
		}
		System.out.println("두 수의 합은 "+sum+"입니다.");
	}
}