package javaCalendar;

import java.util.Scanner;

class monthLastDayRepeat{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�ݺ� Ƚ���� �Է��ϼ���.");
		int repeat = scan.nextInt();
		int[] target = new int[repeat];
		int[] months = {31,28,31,30,31,30,31,31,30,31,30,31};
		System.out.println("���� �Է��ϼ���.");
		for(int i = 0; i<repeat; i++){
			target[i] = scan.nextInt();
			if(target[i] < 1 || target[i]>12){
				System.out.println(target[i]+"���� �������� �ʽ��ϴ�.");
				i--;
			}
		}
		scan.close();
		for(int j = 0; j<repeat; j++){
			System.out.println(target[j]+"���� "+months[target[j]-1]+"�ϱ��� �ֽ��ϴ�.");
		}
	}
	
}