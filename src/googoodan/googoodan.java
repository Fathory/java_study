package googoodan;

import java.util.Scanner;

class TwoThree{
	public static void main(String[] args) {
		// 2��
		System.out.println("2��");
		
		System.out.println(2*1);
		System.out.println(2*2);
		System.out.println(2*3);
		System.out.println(2*4);
		System.out.println(2*5);
		System.out.println(2*6);
		System.out.println(2*7);
		System.out.println(2*8);
		System.out.println(2*9);
		
		// 3��
		System.out.println("3��");
		
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
		// �ֿܼ��� ���� �Է¹��� �� �ִ� ��ƿ
		// 4, 5��
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		int result = 0;
		scan.close(); // �Է¹��� �Ŀ��� �ݾ��ִ� ���� ����.
		System.out.println(i+"��");
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