package javaCalendar;

import java.util.Scanner;

class fakeCalendar{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int month = 0;
		while (month != -1) {
			month = scan.nextInt();
			if(month == -1 ){
				System.out.println("Bye~");
				break;
			}
			if(month < 1 || month>12){
				System.out.println(month+"���� �������� �ʽ��ϴ�.");
			}else{
				print(month);
			}
		}
		scan.close();
	}
	static void print(int a){
		int[] months = {31,28,31,30,31,30,31,31,30,31,30,31};
		int week = months[a-1];
		if(week%7 == 0){
			week = week/7;
		}else{
			week = week/7 + 1;
		}
		String[] weeks =  new String[week];
		int day = 1;
		for (int i = 0; i < weeks.length; i++) {
			weeks[i] = "";
			for(int j = 0; j<7; j++){
				if(day > months[a-1]){
					weeks[i] += " ";
				}else{
					if(day < 10){
						weeks[i] += " "+day++ +" ";
					}else{
						weeks[i] += day++ +" ";
					}
				}
			}
		}
		System.out.println("  ��     ��     ȭ     ��     ��     ��     ��");
		System.out.println("--------------------");
		for(int x = 0; x<weeks.length; x++){
			System.out.println(weeks[x]);
		}
		
	}
}