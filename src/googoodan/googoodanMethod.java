package googoodan;

//import java.util.Scanner;

public class googoodanMethod{
	// googoodanClass ���Ͽ��� main ȣ���ؼ� ���
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		if( a<2 || a>9){
//			System.out.println("2���� 9 ������ ���� �Է��� �� �ֽ��ϴ�.");
//		}
//		scan.close();
//		else{
//			int[] result = calc(a);
//			System.out.println("�޼ҵ带 �̿��� ������ ����Դϴ�.");
//			print(result);
//		}
//	}
	public static int[] calc(int a){
		int[] result = new int[9];
		for (int i = 0; i < result.length; i++) {
			result[i] = a*(i+1);
		}
		return result;
	}
	public static void print(int[] result){
		for(int i = 0; i<result.length; i++){
			System.out.println(result[i]);
		}
	}
}