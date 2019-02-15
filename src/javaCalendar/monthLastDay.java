package javaCalendar;

import java.util.Scanner;

class monthLastDay{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int month = scan.nextInt();
		scan.close();
		int[] months = {31,28,31,30,31,30,31,31,30,31,30,31};
		if(month < 1 || month > 12){
			System.out.println(month+"월은 존재하지 않습니다.");
		}else{
			System.out.println(month+"월은 "+months[month-1]+"일까지 있습니다.");
		}
	}
}