package googoodan;

import java.util.Scanner;

class Googoodan{
	public static void main(String[] args) {
//		// 2��
//		System.out.println("2��");
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
//		// 3��
//		System.out.println("3��");
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
//		// 6, 7��
//		// �ݺ��� ���
//		Scanner scan = new Scanner(System.in);
//		int i = scan.nextInt();
//		int result = 0;
//		int x = 1; // �ݺ� Ƚ�� ����
//		scan.close(); // �Է¹��� �Ŀ��� �ݾ��ִ� ���� ����.
//
//		System.out.println(i+"��");
//		// while �ݺ��� ���
//		while(x<10){
//			result = i*x;
//			System.out.println(result);
//			x++;
//		}
//		

		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		int result = 0;
		scan.close(); // �Է¹��� �Ŀ��� �ݾ��ִ� ���� ����.
		if(i < 2 || i>9){
			System.out.println("2 �̻�, 9 ������ ���ڸ� �Է��� �� �ֽ��ϴ�.");
		}else{
			// for �ݺ��� ���
			for (int y = 1; y < 10; y++) {
				result = i*y;
				System.out.println(result);
			}
		}
	}
}