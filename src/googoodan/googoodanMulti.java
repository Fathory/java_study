package googoodan;

import java.util.Scanner;

class googoodanMulti{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String t = scan.nextLine();
		scan.close();
		String[] g = t.split(",");

		for(int i = 0 ; i<g.length; i++){
			int a = Integer.parseInt(g[i]);
			if( a<2 || a>9){
				System.out.println("2���� 9 ������ ���� �Է��� �� �ֽ��ϴ�.");
			}else{
				int[] result = googoodanMethod.calc(a);
				System.out.println("multi ������ ����Դϴ�.");
				googoodanMethod.print(result);
			}
		}
	}
}