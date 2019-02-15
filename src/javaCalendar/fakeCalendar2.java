package javaCalendar;

import java.util.Scanner;

class fakeCalendar2{
	private static int[] MAX_DAYS = {31,28,31,30,31,30,31,31,30,31,30,31};
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int month = 0;
		int year = 0;
		String date= "";
		while (month != -1 || year == -1) {
			System.out.println("연도를 입력하세요.");
			System.out.print("cal>>");
			year= scan.nextInt();
			System.out.println("월을 입력하세요.");
			System.out.print("cal>>");
			month = scan.nextInt();
			scan.nextLine();
			System.out.println("1일의 요일을 입력하세요. ex) 월 ");
			System.out.print("cal>>");
			date = scan.nextLine();
			getLeafDays(year);
			if(month == -1 || year == -1){
				System.out.println("Bye~");
				break;
			}
			if(month < 1 || month>12){
				System.out.println("month");
				System.out.println(month+"월은 존재하지 않습니다.");
			}else{
				print(year, month, date);
			}
		}
		scan.close();
	}
	static void print(int year, int month, String date){
		int add = 0;
		if(date == "월"){
			add = 1;
		}else if(date == "화"){
			add = 2;
		}else if(date == "수"){
			add = 3;			
		}else if(date == "목"){
			add = 4;
		}else if(date == "금"){
			add = 5;
		}else if(date == "토"){
			add = 6;
		}
		System.out.println(add);
		System.out.printf("     <<%4d년 %3d월>>\n", year, month);
		System.out.println("    일      월      화     수     목     금    토");
		System.out.println("---------------------");
		for (int i = 1; i <= 7; i++) {
			if(add>0){
				System.out.printf("%3d"," ");
				add--;
			}else{
				System.out.printf("%3d",i);
			}
		}
		System.out.println();
		int count=0;
		for (int i = 7-add; i <= MAX_DAYS[month-1]; i++) {
			System.out.printf("%3d",i);
			if(count == 7 || i == MAX_DAYS[month-1]){
				System.out.println();
				count = 0;
			}
			count++;
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