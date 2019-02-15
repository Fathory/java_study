package googoodan;

//import java.util.Scanner;

public class googoodanMethod{
	// googoodanClass 파일에서 main 호출해서 사용
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		if( a<2 || a>9){
//			System.out.println("2부터 9 사이의 값만 입력할 수 있습니다.");
//		}
//		scan.close();
//		else{
//			int[] result = calc(a);
//			System.out.println("메소드를 이용한 구구단 출력입니다.");
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