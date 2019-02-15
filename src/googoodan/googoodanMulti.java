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
				System.out.println("2부터 9 사이의 값만 입력할 수 있습니다.");
			}else{
				int[] result = googoodanMethod.calc(a);
				System.out.println("multi 구구단 출력입니다.");
				googoodanMethod.print(result);
			}
		}
	}
}