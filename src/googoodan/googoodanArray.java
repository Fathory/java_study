package googoodan;

import java.util.Scanner;

class googoodanArray{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		int[] result = new int[9];
		
		if(n < 2 || n > 9){
			System.out.println("2���� 9 ������ ���� �Է��� �� �ֽ��ϴ�.");
		}else{
			for (int i = 0; i < result.length ; i++){
				result[i] = n*(i+1);
			}
			
			System.out.println("�迭�� �̿��� ������ ����Դϴ�.");
			for(int x = 0; x<result.length; x++){
				System.out.println(result[x]);
			}
		}
	}
}