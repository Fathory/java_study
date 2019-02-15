package javaCalendar;

import java.util.Scanner;

class fakeCalendar{
	private static int[] MAX_DAYS = {31,28,31,30,31,30,31,31,30,31,30,31};
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int month = 0;
		int year = 0;
		while (month != -1) {
			System.out.println("연도를 입력하세요.");
			System.out.print("cal>>");
			year= scan.nextInt();
			System.out.println("월을 입력하세요.");
			month = scan.nextInt();
			getLeafDays(year);
			if(month == -1 ){
				System.out.println("Bye~");
				break;
			}
			if(month < 1 || month>12){
				System.out.println(month+"월은 존재하지 않습니다.");
			}else{
				print(year, month);
			}
		}
		scan.close();
	}
	static void print(int year, int month){
		System.out.printf("     <<%4d년 %d월>>\n", year, month);
		System.out.println("    일      월      화     수     목     금    토");
		System.out.println("---------------------");
		for (int i = 1; i <= MAX_DAYS[month-1]; i++) {
			System.out.printf("%3d",i);
			if(i % 7 == 0 || i == MAX_DAYS[month-1]){
				System.out.println();
			}
		}
	}
	public static void getLeafDays(int year){
		if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)){
			MAX_DAYS[1] = 29;
		}else{
			MAX_DAYS[1] = 28;
		}
	}
}