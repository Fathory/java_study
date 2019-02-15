package javaCalendar;

import java.util.Scanner;

class monthLastDayRepeatWhile{
	public static void main(String[] args) {
		int[] months = {31,28,31,30,31,30,31,31,30,31,30,31};
		Scanner scan = new Scanner(System.in);
		int month = 0;
		while(month != -1){
			System.out.println("월을 입력하세요.");
			month = scan.nextInt();
			if(month == -1){
				System.out.println("Have a nice day!");
				break;
			}
			if(month < 1 || month>12){
				System.out.println(month+"월은 존재하지 않습니다.");
			}else{
				System.out.println(month+"월은 "+months[month-1]+"일까지 있습니다.");
			}
		}
		scan.close();
	}
}