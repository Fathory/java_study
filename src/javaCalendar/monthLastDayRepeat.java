package javaCalendar;

import java.util.Scanner;

class monthLastDayRepeat{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("반복 횟수를 입력하세요.");
		int repeat = scan.nextInt();
		int[] target = new int[repeat];
		int[] months = {31,28,31,30,31,30,31,31,30,31,30,31};
		System.out.println("월을 입력하세요.");
		for(int i = 0; i<repeat; i++){
			target[i] = scan.nextInt();
			if(target[i] < 1 || target[i]>12){
				System.out.println(target[i]+"월은 존재하지 않습니다.");
				i--;
			}
		}
		scan.close();
		for(int j = 0; j<repeat; j++){
			System.out.println(target[j]+"월은 "+months[target[j]-1]+"일까지 있습니다.");
		}
	}
	
}