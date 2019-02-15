package javaCalendar;

import java.util.Scanner;

class fakeCalendar{
	private static int[] MAX_DAYS = {31,28,31,30,31,30,31,31,30,31,30,31};
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int month = 0;
		int year = 0;
		while (month != -1) {
			System.out.println("������ �Է��ϼ���.");
			System.out.print("cal>>");
			year= scan.nextInt();
			System.out.println("���� �Է��ϼ���.");
			month = scan.nextInt();
			getLeafDays(year);
			if(month == -1 ){
				System.out.println("Bye~");
				break;
			}
			if(month < 1 || month>12){
				System.out.println(month+"���� �������� �ʽ��ϴ�.");
			}else{
				print(year, month);
			}
		}
		scan.close();
	}
	static void print(int year, int month){
		System.out.printf("     <<%4d�� %d��>>\n", year, month);
		System.out.println("    ��      ��      ȭ     ��     ��     ��    ��");
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