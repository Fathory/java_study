package javaCalendar;

import java.util.Scanner;

class monthLastDayRepeatWhile{
	public static void main(String[] args) {
		int[] months = {31,28,31,30,31,30,31,31,30,31,30,31};
		Scanner scan = new Scanner(System.in);
		int month = 0;
		while(month != -1){
			System.out.println("���� �Է��ϼ���.");
			month = scan.nextInt();
			if(month == -1){
				System.out.println("Have a nice day!");
				break;
			}
			if(month < 1 || month>12){
				System.out.println(month+"���� �������� �ʽ��ϴ�.");
			}else{
				System.out.println(month+"���� "+months[month-1]+"�ϱ��� �ֽ��ϴ�.");
			}
		}
		scan.close();
	}
}