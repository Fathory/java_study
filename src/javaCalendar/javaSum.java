package javaCalendar;

import java.util.Scanner;

class javaSum{
	public static void main(String[] args) {
		System.out.println("�� ���� �Է��ϼ���.");
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		scan.close();
		String[] a = s.split(" ");
		int sum = 0;
		for(int i = 0; i<a.length; i++){
			sum += Integer.parseInt(a[i]);
		}
		System.out.println("�� ���� ���� "+sum+"�Դϴ�.");
	}
}