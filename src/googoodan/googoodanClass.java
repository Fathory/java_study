package googoodan;

import java.util.Scanner;

class googoodanClass{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		scan.close();
		if( a<2 || a>9){
			System.out.println("2���� 9 ������ ���� �Է��� �� �ֽ��ϴ�.");
		}else{
			int[] result = googoodanMethod.calc(a);
			System.out.println("Ŭ������ �̿��� ������ ����Դϴ�.");
			googoodanMethod.print(result);
		}
	}
}